FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER Lion Li

RUN mkdir -p /payment/job/logs \
    /payment/job/temp \
    /payment/skywalking/agent

WORKDIR /payment/job

ENV SERVER_PORT=9203

EXPOSE ${SERVER_PORT}

ADD ./target/payment-job.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=payment-job", \
#            "-javaagent:/payment/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
