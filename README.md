# Job Application Tracker

Minimal setup instructions for running the project locally.

## Backend setup

Go to the backend directory.

Copy the example properties file:

```bash
cp src/main/resources/application-example.properties src/main/resources/application.properties
```


Then edit `application.properties` and configure:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
app.cors.allowed-origin=YOUR_FRONTEND_URL
```

Run the backend from the backend directory:

```bash
./mvnw spring-boot:run
```

The backend will run on:

```text
http://localhost:8080
```

## Frontend setup

Go to the frontend directory.

Copy the example environment file:

```bash
cp .env.example .env
```

Then edit `.env` and configure the backend URL:

```env
VITE_API_BASE_URL=http://localhost:8080
```

Install dependencies:

```bash
npm install
```

Run the frontend:

```bash
npm run dev
```

The frontend will usually run on:

```text
http://localhost:5173
```
