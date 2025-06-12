# E-commerce Project

## Overview
This project is an e-commerce application built using a microservices architecture. It leverages Spring Boot for service development, an API Gateway for routing requests, and Keycloak for authentication and authorization.

## Architecture
The application is divided into several microservices, each responsible for a specific domain:

- **API Gateway**: Acts as the entry point for all client requests and routes them to the appropriate microservice.
- **Auth Service**: Manages user authentication and authorization using Keycloak.
- **Product Service**: Handles product-related operations such as listing, adding, and updating products.
- **Order Service**: Manages order processing and related functionalities.
- **Common Module**: Contains shared utilities and configurations used across different services.

## Technologies Used
- Java 21
- Spring Boot
- Spring Cloud
- Keycloak
- Docker

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd ecommerce-project
   ```

2. **Build the Project**
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   You can run the entire application using Docker Compose:
   ```bash
   docker-compose up
   ```

4. **Access the Services**
   - API Gateway: `http://localhost:8080`
   - Auth Service: `http://localhost:8081`
   - Product Service: `http://localhost:8082`
   - Order Service: `http://localhost:8083`

## Usage Guidelines
- Use the API Gateway to interact with the services.
- Authentication can be done through the Auth Service, which integrates with Keycloak.
- Each service has its own set of APIs, which can be accessed via the API Gateway.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.