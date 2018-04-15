FROM java:8
ADD dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
ADD boot.sh /boot.sh
RUN sed -i 's/\r$//' /boot.sh
RUN chmod +x /boot.sh
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "/boot.sh" ]