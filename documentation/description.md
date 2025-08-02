# Contenido
- [Tecnologias](#tecnologías-utilizadas)
- [Estructuración de repositorio](#estructuración-de-repositorio)
- [Monorepo](#por-qué-utilizar-un-monorepo-para-la-migración)

### Tecnologías utilizadas
___
Las principales dependencias que se manejan para los servicios son con las siguientes tecnologías:

* [Java Jdk Zulu v21.0.6 LTS](https://www.azul.com/downloads/?version=java-21-lts&os=linux&architecture=x86-64-bit&package=jdk&show-old-builds=true#zulu)
* [Spring boot v3.4.6](https://spring.io/blog/2025/05/22/spring-boot-3-4-6-available-now)
* [Apache camel springboot v4.10.2](https://camel.apache.org/camel-spring-boot/4.10.x/spring-boot.html)
* [Spring Cloud v4.2.2](https://spring.io/projects/spring-cloud)


### Estructuración de repositorio
___
* apps: <br>
  Directorio dentro de los cuales se encuentran los módulos (aplicaciones) applicaciones para el proyecto de seminario

* commons  <br>
  Directorio para albergar proyectos de Spring Boot reutilizables como librerías

* k8s  <br>
  Directorio para script para creación de recursos de k8s por proyecto


#### ¿Por qué utilizar un Monorepo para la creacion del proyecto de seminario?
___
Se utiliza un repositorio principal **umg-service-parent** con el objetivo de centralizar el su archivo ``pom.xml``
la administración de las diferentes versiones para las dependencias utilizadas en las aplicaciones a utilizar en el proyecto,
esto garantizará que todas las aplicaciones compartan las mismas versiones de las tecnologías usadas.

Todas las aplicaciones que se creen dentro del directorio apps, deben tener como parent el proyecto principal.

````xml
<parent>
    <groupId>gt.edu.umg</groupId>
    <artifactId>umg-service-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <relativePath>../../pom.xml</relativePath>
</parent>
````
Al hacer esto en el momento de agregar una dependecia que es compartida por diferentes módulos, solo se necesitará
declarla sin especificar la versión, por ejemplo:

````xml
<dependency>
   <groupId>com.mysql</groupId>
   <artifactId>mysql-connector-j</artifactId>
</dependency>
````

En el ``pom.xml`` del proyecto principal se define la versión que se usará al momento de compartirla en cualquier módulo
```xml
<dependencyManagement>
 <dependencies>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>${mysql.connector.version}</version>
    </dependency>
 </dependencies>
</dependencyManagement>
```

___
[Anterior](buld-container-images.md)   |  [Siguiente](buld-container-images.md)