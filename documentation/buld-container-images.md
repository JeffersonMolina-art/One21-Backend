
### Contenido
- [Imagen base](#imagen-base)
- [Configuración principal plugin](#configuración-pomxml-principal)
- [Configuraicón en módulo](#configuración-pomxml-de-módulo)
- [Build del servicio](#build)


### Imagen Base
___
Para la compilación y creación de imagenes de los servicios se utiliza una imagen báse personalizada, utilizando un
``Dockerfile`` que se encuentra ubicado en ``umg-service-parent/k8s/base-image``, cuyo contenido
es el siguiente:

````dockerfile
FROM bellsoft/liberica-openjre-alpine:21.0.6

ARG APP_USER=umguser
ARG APP_GROUP=byte
ARG APP_UID=1000
ARG APP_GID=1000

RUN addgroup -S -g ${APP_GID} ${APP_GROUP} \
    && adduser -S -u ${APP_UID} -G ${APP_GROUP} ${APP_USER}

USER ${APP_USER}:${APP_GROUP}

WORKDIR /app
````
Los propósitos para utilizar este enfoque son los siguientes:

1. Estandarizar la imagen base para todos los servicios que se desplegarán en el cluster de k8s
2. Utilizar una imagen base liviana que contenga únicamente lo necesario para la ejecución del servicio
3. Configurar el uso de un usuario personalizado para la ejecución de los contenedores y evitar que se ejecuten como root

Para lo cual se opta por una imagen ``bellsoft/liberica`` basada en ``alpine`` que contenga únicamente el ``jre``
que se necesita para la ejección del servicio.

Para compilar la imagen y disponer de ella en los siguientes pasos de copilación de servicios, debemos ubicarnos en
el directorio donde se encuentra el archivo  ``Dockerfile`` y ejecutar el comando de compilación:

```shell
  docker build -t umg-base-liberica-openjre-alpine:21-jre-headless .
```

Se le asigna el nombre *umg-base-liberica-openjre-alpine* a la imagen resultante, con el tag formado por la versión de
Java a usar y el sufijo *jre-headless*, al cual se hará referencia desde le archivo ``pom.xml``.

Al ejecutar el comando nos creará en nuestro registry local de docker una imagen, la cual podremos utilizar en
los siguientes pasos.


### Configuración ``pom.xml`` principal
___

Para realizar el build final de un servicio y generar la imagen a desplegar, se utiliza el plugin de google llamado -*jib*-**[^1]**, cuya configuración
está dividida en dos partes, una configuración en el pom.xml principal y una en cada módulo que se integre.

La configuración del plugin es la siguiente:
1. definición de propiedades <br>
   Se establecen algunas propiedades que se usarán en tiempo de build, como imagen base y prefijo para imagen final.
    ```xml
   <docker.image.prefix>umg-service</docker.image.prefix>
   <java.version>21</java.version>
   <java.suffix>jre-headless</java.suffix>
   <docker.image.base>docker://umg-base-liberica-openjre-alpine:${java.version}-${java.suffix}</docker.image.base>
    ```
   La propiedad *docker.image.prefix* será el prefijo que se utiliará para las imagenes finales junto al nombre del módulo
   La propiedad *docker.image.base* es el nombre de la imagen base construida en la sección anterior, usando como tag
   la versión de java + el sufijo que se le agregó en el proceso build del dockerfile.

2. configuración del plugin <br>
   El plugin se configura en la sección de build del archivo pom.xml y lleva el siguiente contenido:
    ```xml
   <plugin>
        <groupId>com.google.cloud.tools</groupId>
        <artifactId>jib-maven-plugin</artifactId>
        <configuration>
           <allowInsecureRegistries>true</allowInsecureRegistries>
           <container>
              <jvmFlags>
                   <jvmFlag>-server</jvmFlag>
                   <jvmFlag>-Djava.security.egd=file:/dev/./urandom</jvmFlag>
                   <jvmFlag>-Xlog:gc*:file=/tmp/cglog.gc:time,pid,tags:filecount=10,filesize=20m</jvmFlag>
                   <jvmFlag>-Xms256m</jvmFlag>
                   <jvmFlag>-Xmx768m</jvmFlag>
              </jvmFlags>
              <volumes>
              <volume>/tmp</volume>
              </volumes>
              <workingDirectory>/app</workingDirectory>
              <creationTime>USE_CURRENT_TIMESTAMP</creationTime>
              <labels>
              <maintainer>support@bytesw.com</maintainer>
              </labels>
           </container>
           <from>
                <image>${docker.image.base}</image>
           </from>
           <to>
              <image>${docker.image.prefix}/${project.artifactId}:${project.version}-${maven.build.timestamp}</image>
           </to>
           <extraDirectories>
                <permissions>
                   <permission>
                      <file>/app</file>
                      <mode>777</mode>
                   </permission>
                </permissions>
           </extraDirectories>
        </configuration>
    </plugin>
    ```
   La configuración del plugin está dividida en 4 partes:
    1. Configuración del contenedor <br>
       En la configuración de contenedor se establecen variables para jvm, entre los cuales están configurados límites,
       los logs del GC, etc. y aunque java 21 por defecto funciona en modalidad server, se le configura explícitamente que
       utilice esa modalidad ``<jvmFlag>-server</jvmFlag>``.
       Se configuran un volumen para directorio ``/tmp``, asi como el directorio de trabajo  ``/app``.

    2. Imagen base a usar <br>
       Se le indica al plugin cual debe ser la imagen base para construir el contenedor, tomandola de las propiedades definidas
       anteriormente  ``<image>${docker.image.base}</image>``.
    3. Nombre de imagen final <br>
       Se establece un nombre de imagen final por defecto, aunque en cada módulo se puede reescribir esta propiedad.
    4. Permisos de directorio de trabajo <br>
       Se establecen los permisos del directorio de trabajo.

3. definición de un perfil<br>
   De define un perfil para el plugin configurado anteriormente.
```xml
    <profiles>
        <profile>
            <id>web-service</id>
            <build>
                <plugins>
                    <plugin>
                        <groupId>com.google.cloud.tools</groupId>
                        <artifactId>jib-maven-plugin</artifactId>
                        <version>3.4.5</version>
                        <configuration>
                            <to>
                                <image>${docker.image.prefix}/web-service-${project.artifactId}</image>
                            </to>
                        </configuration>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>
```

### Configuración ``pom.xml`` de módulo
___
En el ``pom.xml`` específico de cada módulo se define nuevamente el plugin a utilizar para la compilación, reescribiendo
ciertas propiedades específicas del módulo.

```xml
    <build>
        <plugins>
            <plugin>
                <groupId>com.google.cloud.tools</groupId>
                <artifactId>jib-maven-plugin</artifactId>
                <version>3.4.5</version>
                <configuration>
                    <to>
                        <image>${docker.image.prefix}/${project.artifactId}:${project.version}-${maven.build.timestamp}</image>
                    </to>
                    <container>
                        <mainClass>gt.edu.umg.notification.service.NotificationServiceApplication</mainClass>
                    </container>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
En esta sección se puede reescribir el nombre de la imagen final, si se requiere agregar algo al nombre de la misma,
adicional se agrega la propiedad ``<mainClass>gt.edu.umg.notification.service.NotificationServiceApplication</mainClass>`` al contenedor, donde se especifica
el nombre y paquete completo de la clase principal del proyecto.

### Build
___
Una vez establecidas las configuraciones en ambos archivos ``pom.xml``, tanto del parent como del módulo. Para realizar
el build de la imagen del servicio, usando una terminal, ubicados en el directorio principal del proyecto, se ejecuta el
siguiente comando.

```shell
    mvn -Dmaven.test.skip -Djacoco.skip -Ddependency-check.skip=true -f apps/notification-service compile jib:dockerBuild
```
Los primeros parámetros son para saltar la parte de los test y validación dependencias, con la opción ``-f`` se le indica
la ruta del archivo ``pom.xml`` del módulo que se requiere compilar, luego se le indica la opción ``compile`` y por último se
indica información para el plugin, ``jib:dockerBuild`` esta opción le indica al plugin que realice la compilación y la
imagen resultante quede guardada en el registry local de docker específicamente. <br>

Se puede usar la opción ``jib:build``, sin embargo este comando realiza la compilación de la imagen, y al mismo tiempo
intenta realizar el push directamente a un registry remoto, esto en caso se tenga un registry privado al cual se requiera
enviar la imagen en el mismo proceso de compilación. Para esto es necesario realizar ajustes de credenciales en la configuración
del plugin, en el ``pom.xml`` principal, si en caso es necesario referirse a la documentación del plugin, **[^1]**  para verificar
como realizar este paso.
___
[^1]: [*jib-maven-plugin*](https://github.com/GoogleContainerTools/jib/blob/master/jib-maven-plugin/README.md)
___
[Índice](../README.md) | [Anterior](description.md)  | [Siguiente](description.md)