FROM eclipse-temurin:21-jre-alpine

LABEL authors="hatrongvu"

WORKDIR /opt/service

COPY /target/*.jar /opt/service/app.jar

COPY /src/main/resources /opt/service/resources_default

COPY entrypoint.sh /entrypoint.sh

RUN sed -i 's/\r$//' /entrypoint.sh && \
    chmod +x /entrypoint.sh \

# === Security: Non-root + OpenShift compatible ===
RUN addgroup -S appgroup && \
    adduser -S appuser -G appgroup && \
    chown -R appuser:appgroup /opt/service && \
    chmod -R g=u /opt/service

RUN chgrp -R 0 ./ && chmod -R g=u ./

RUN ls -l /

RUN cat /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]