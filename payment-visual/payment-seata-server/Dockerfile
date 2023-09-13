FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER Lion Li

RUN mkdir -p /payment/seata-server/logs \
    /payment/skywalking/agent

WORKDIR /payment/seata-server

ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 7091
EXPOSE 8091

ADD ./target/payment-seata-server.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
#            "-Dskywalking.agent.service_name=payment-seata-server", \
#            "-Dskywalking.plugin.seata.server=true", \
#            "-javaagent:/payment/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
