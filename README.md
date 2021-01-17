# civetta

A small service for small business to receive, process and delivers orders.

## Running the application in dev mode

Start the database:

```shell
podman run -d --rm \
    -e POSTGRES_DB=civetta \
    -e POSTGRES_USER=civetta \
    -e POSTGRES_PASSWORD=civetta \
    -p 49904:5432 \
    --name civettadb postgres
```

Start the Quarkus backend:

```shell
./mvnw compile quarkus:dev
```

Start the React frontend:

```shell
cd app && npm start
```
