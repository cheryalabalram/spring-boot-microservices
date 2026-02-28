# Getting Started

### Reference Documentation

### Java
$env:PATH += ";C:\Users\username\.jdks\openjdk-25\bin"

### Zipkin
PS zipkin_path java -jar zipkin-server-3.5.1-exec.jar


# API Calls!
  - POST : http://localhost:8080/users/save
    ```json 
        {
        "name": "balram",
        "emailId": "balramc@example.com",
        "mobile" : "125412541254",
        "location" : "Hyderabad",
        "departmentId": 1
        }
    ```
  - CMD 
  - curl -X POST http://localhost:8080/users/save ^
    -H "Content-Type: application/json" ^
    -d "{\"name\":\"balram\",\"emailId\":\"balramc@example.com\",\"mobile\":\"125412541254\",\"location\":\"Hyderabad\",\"departmentId\":1}"

    - POST : http://localhost:8080/departments/save
    ```json 
      {
      "name": "IT",
      "location" : "Hyderabad"
      }
      ```
  - CMD 
  - curl -X POST http://localhost:8080/departments/save ^
    -H "Content-Type: application/json" ^
    -d "{ \"name\": \"IT\", \"location\": \"Hyderabad\" }"```

 - Getdeptanduserbyuserid : GET : http://localhost:8080/users/department/1
 
### OUTPUT
        
```json
{
  "id": 1,
  "name": "HR",
  "location": "HYD"
}
```
