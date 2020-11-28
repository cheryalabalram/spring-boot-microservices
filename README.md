# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)


# Balram Cheryala

# API Calls!
  - POST : http://localhost:8080/users/save
    {
	"name": "balram",
	"emailId": "balramc@example.com",
	"mobile" : "125412541254",
	"location" : "Hyderabad",
	"departmentId": 1
}
  - POST : http://localhost:8080/departments/save
    {
	"name": "IT",
	"location" : "Hyderabad"
    }
 - Getdeptanduserbyuserid : GET : http://localhost:8080/users/1
 
### OUTPUT
        {
            "user": {
                "id": 1,
                "name": "balram",
                "emailId": "balramc@example.com",
                "mobile": "125412541254",
                "location": "Hyderabad",
                "departmentId": 1
            },
            "department": {
                "id": 1,
                "name": "IT",
                "location": "Hyderabad"
            }
        }
 

