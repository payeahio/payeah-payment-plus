FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER Lion Li

RUN mkdir -p /payment/system/logs \
    /payment/system/temp \
    /payment/skywalking/agent

WORKDIR /payment/system

ENV SERVER_PORT=9201

EXPOSE ${SERVER_PORT}

ADD ./target/payment-system.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=payment-system", \
#            "-javaagent:/payment/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
