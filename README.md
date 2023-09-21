# UserSpec
# Documentation du Projet User :

. This document provides information about the User project, which provides two APIs for managing users. 
  The APIs allow you to consult registered users (getUser)and register new users (saveUser) residing in France. 
  The project is based on Java 11 and uses Spring Boot with an integrated H2 database.
  
# Prerequisites
. Java 11
. Spring Boot
. Integrated H2 database  ( jdbc:h2:mem:users ) NB :[ h2 database configuration in the properties file ]

# Project Construction

. Clone the project repository from GitHub ( https://github.com/Yossri-Ghabri/UserSpec/tree/master ).
. Navigate to the project directory.
. Run the following command to build the project:  mvn clean install

# Running the Application :

 . To run the Spring Boot application locally, 
   the application runs on the default port: 8080. ( http://localhost:8080/h2-console/login.jsp?jsessionid=769d66e2f80ecfac8766e0965f196615 )

# API Endpoints :

 1. getUser - View Registered Users

Description: This API allows you to view the details of a registered user using their ID.
URL: http://localhost:8080/user/getUser/{userId}
HTTP method: GET
Query Parameters:
{userId} (path parameter): The ID of the user to consult.

2. saveUser - Save a New User
   
Description: This API allows you to register a new user residing in France.
URL: http://localhost:8080/user/saveUser
HTTP method: POST
Query: JSON representing user details, including name, date of birth, country of residence, phone number, and gender.
Requirements: Only users residing in France are allowed to register.

# Examples of Queries and Responses :

GET http://localhost:8080/user/getUser/1
 . Response (JSON):

{
  "userId": 1,
  "username": "anna",
  "birthdate": "2000-12-3",
  "countryOfResidence": "France",
  "phoneNumber": "0654345633",
  "gender": "femme"
}

POST http://localhost:8080/user/saveUser
 . Request (HTTP POST) :
 
{
  "username": "Alex",
  "birthdate": "1991-12-5",
  "countryOfResidence": "France",
  "phoneNumber": "0654356633",
  "gender": "homme"
}

# Error management : 

 . If a user attempts to register from a country other than France, an HTTP 400 Bad Request error is returned with an explicit error message.

