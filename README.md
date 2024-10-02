# Spring Security Learning Project

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.6.3-orange)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6-brightgreen)

## Overview

This project is a comprehensive learning journey into Spring Security, focusing on Authentication and Authorization. The project is built using Spring Boot and Maven, and it covers various aspects of securing a Spring application.

## Table of Contents

- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Key Features](#key-features)
- [Learning Stages](#learning-stages)
- [Running the Application](#running-the-application)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher

### Installation

1. Clone the repository
   ```sh
   git clone git@github.com:AnirudhHanda/SpringSecurity.git

2. Navigate to the project directory
   ```sh
   cd SpringSecurityProjectApplication

3. Build the project
   ```sh
   mvn clean install

## Project Structure

```
SpringSecurityProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── walter/
│   │   │   │   │   ├── springsecurityproject/
│   │   │   │   │   │   ├── appuser/
│   │   │   │   │   │   ├── registration/
│   │   │   │   │   │   ├── security/
│   │   │   │   │   │   ├── SpringSecurityProjectApplication.java
│   ├── resources/
│   │   ├── application.properties
├── pom.xml
```

## Key Features

- **User Registration**: Allows new users to register.
- **Password Encoding**: Uses BCrypt for password encoding.
- **Authentication**: Custom `UserDetailsService` for loading user-specific data.
- **Authorization**: Configures HTTP security to restrict access to certain endpoints.

## Learning Stages

### Stage 1: Project Setup

- **Commit Message**: "Initial project setup with Spring Boot and Maven"
- **Description**: Set up the basic structure of the Spring Boot project with Maven.
- 
### Stage 2: Stateless Session and CSRF

- **Commit Message**: "Till learning how to make it all STATELESS and working without CSRF and disabling it with our own SecurityConfig file"
- **Description**: Configured the application to use stateless sessions and disabled CSRF protection.

### Stage 3: HTTP Security Configuration

- **Commit Message**: "The register end-point is made public so that new users do not already need to be authenticated in order to create a new account"
- **Description**: Configured `WebSecurityConfig` to manage session policies, CSRF protection, and endpoint authorization.

### Stage 4: Custom UserDetailsService

- **Commit Message**: "Security concepts learned till logging in the user using DaoAuthenticationProvider, our own UserDetailsService, AppUser, UserPrincipal which is the current user and an implementation of the UserDetails interface"
- **Description**: Implemented `MyUserDetailsService` to load user-specific data during authentication.

### Stage 5: User Registration

- **Commit Message**: "User Registration implemented using BCrypt Password Encoder which is a one-way hashing technique to securely store passwords in the database"
- **Description**: Created `RegistrationController` and `MyUserDetailsService` to handle user registration and save users to the database.

### Stage 6: Password Encoding

- **Commit Message**: "Added BCrypt password encoding"
- **Description**: Integrated BCrypt password encoder to securely store user passwords.


## Running the Application

To run the application, use the following command:

    ```sh
    mvn spring-boot:run

The application will be accessible at `http://localhost:8080`.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.