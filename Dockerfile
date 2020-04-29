FROM openjdk:8-alpine
ARG JAR_FILE
#alpine 镜像使用以下命令
RUN addgroup -g 666  -S app &&  adduser -Du  666 -G app  app #alpine 镜像
#openjdk:8 使用的oracle LINUX 镜像这个镜像为标准的jdk，使用以下命令
#RUN groupadd -g 666  app && useradd -u 666 -m  -g 666  app
USER app
WORKDIR /home/app
COPY --chown=app:app  target/${JAR_FILE}  app.jar
#CMD ["sleep","3600"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
