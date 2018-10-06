FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/thinkpro-account-0.0.1-SNAPSHOT.jar thinkpro-account.jar
RUN sh -c 'touch /thinkpro-account.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/thinkpro-account.jar"]
EXPOSE 9092
