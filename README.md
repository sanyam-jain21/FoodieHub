# FoodieHub

Online food delivery Application using spring boot


This project is developed with the help of the Spring-Boot framework. The main objective of this Web services application is to cater needs of front-end developers to call different types of API as per the requirement.


## Tech Stack and Tools
- Java
- Spring Boot Framework
- Spring Data JPA
- Hibernate
- MySQL
- Swagger-UI
- Lombok

## ER- Diagram
<p>
        <img
        align="center"
        src="https://github.com/sanyam-jain21/FoodieHub/blob/main/ER%20-DIA.jpg"
        alt="Coding"
        width="700"
        style="display: block"/>
    </p>
    <br>

## Modules
- Login Module
- Restaurant Module
- Customer Module
- Order Module
- Items Module
- Food Cart Module
- Bill Module

## Features
- Customer and Admin authentication & validation with session uniqueId.
- Admin Features:
 - Only registered admins with valid session id can do the CRUD operations like add/update/delete.
 - Admin can add restaurants and food items.
 - Admin can remove restaurants and items.
 
- Customer Features:
 - Customer can register themselves with the application.
 - Customer can login to get the valid session token(id).
 - View list of available items.
 - Add items to food cart, view cart details, placing the order, update and access other features.
  
## Installation & Run
- To run this API server, you should update the database configuration inside the application.properties file which is present in the src/main/resources folder.
- Update the port number, username and password as per your local database configuration.
  - server.port=8888
  - spring.datasource.url=jdbc:mysql://localhost:3306/FoodieHub;
  - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  - spring.datasource.username=your_username_here
  - spring.datasource.password=your_password_here

## API Root Endpoint
```
https://localhost:8888/
```
