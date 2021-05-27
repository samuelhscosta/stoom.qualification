FROM openjdk:16

ARG PROFILE 
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/qualification

COPY /target/qualification*.jar qualification.jar

SHELL ["bin/sh","-c"]

EXPOSE 8092
EXPOSE 5005

CMD java ${ADDITIONAL_OPTS} -jar qualification.jar --spring.profiles.active=${PROFILE}