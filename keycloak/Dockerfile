FROM quay.io/keycloak/keycloak:22.0.5
USER root
RUN microdnf update -y && microdnf install -y curl && microdnf clean all
USER keycloak
