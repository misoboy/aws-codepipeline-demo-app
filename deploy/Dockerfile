FROM amazoncorretto:latest

RUN yum -y update && \
	yum clean all
ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar demo-app.jar
ADD ./deploy/docker-entrypoint.sh /usr/local/bin/docker-entrypoint.sh

RUN chmod 755 /usr/local/bin/docker-entrypoint.sh
ENTRYPOINT ["/usr/local/bin/docker-entrypoint.sh"]
EXPOSE 8080
