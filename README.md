## My Skeleton

-- Microservices pom files are generated by Spring initializer https://start.spring.io/


Always boot services in this order

- config-server
- eureka-server
- user-service
- gateway-service

See registered instances at Eureka Server: http://localhost:8761/

Routes from gateway with actuator
/actuator/gateway/globalfilters
/actuator/gateway/routes

