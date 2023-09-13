FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER Lion Li

RUN mkdir -p /payment/resource/logs \
    /payment/resource/temp \
    /payment/skywalking/agent

WORKDIR /payment/resource

ENV SERVER_PORT=9204

EXPOSE ${SERVER_PORT}

ADD ./target/payment-resource.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=payment-resource", \
#            "-javaagent:/payment/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
