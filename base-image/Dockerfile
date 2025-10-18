FROM bellsoft/liberica-openjre-alpine:21.0.6

ARG APP_USER=umguser
ARG APP_GROUP=umg
ARG APP_UID=1000
ARG APP_GID=1000

RUN addgroup -S -g ${APP_GID} ${APP_GROUP} \
    && adduser -S -u ${APP_UID} -G ${APP_GROUP} ${APP_USER}

USER ${APP_USER}:${APP_GROUP}

WORKDIR /app