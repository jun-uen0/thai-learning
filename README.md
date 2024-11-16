# Thai Learning Application

This project is a web-based Thai language learning application designed to help users improve their understanding of Thai pronunciation rules, tone patterns, and more. The application is built with Java Spring Boot and supports both local and Docker-based deployment.

---

## Features

- Interactive quizzes to learn Thai tone rules.
- Lightweight JSON-based data management (no database setup required).
- Easy deployment via Docker or Maven.

---

## Prerequisites

Ensure the following tools are installed on your system:

- **Java**: 20.0.1  
- **Maven**: 3.9.9  
- **Docker**: 23.0.5  

---

## Setup and Installation

### Local Deployment

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-repo>/thai-learning.git
   cd thai-learning
   ```

2. Build and run the application:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

3. Access the application in your browser at [http://localhost:8080](http://localhost:8080).

---

### Docker Deployment

1. Build the Docker image:
   ```bash
   docker build -t thai-learning:latest .
   ```

2. Run the Docker container:
   ```bash
   docker run -p 8080:8080 thai-learning:latest
   ```

3. Access the application in your browser at [http://localhost:8080](http://localhost:8080).

---

## License

This project is licensed under [MIT License](LICENSE).

---

## Contribution

Feel free to open issues and pull requests to enhance this application 😆😆😆