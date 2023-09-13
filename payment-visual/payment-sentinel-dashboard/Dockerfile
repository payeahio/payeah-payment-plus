FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER Lion Li

RUN mkdir -p /payment/sentinel-dashboard/logs \
    /payment/skywalking/agent

WORKDIR /payment/sentinel-dashboard

EXPOSE 8718

ADD ./target/payment-sentinel-dashboard.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
#            "-Dskywalking.agent.service_name=payment-sentinel-dashboard", \
#            "-javaagent:/payment/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
