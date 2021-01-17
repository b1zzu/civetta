# civetta

A small service for small business to receive, process and delivers orders.

## Contributing

### Running the application in dev mode

Start the local database for the application:

```shell
podman run -d --rm \
    -e POSTGRES_DB=civetta \
    -e POSTGRES_USER=civetta \
    -e POSTGRES_PASSWORD=civetta \
    -p 49904:5432 \
    --name civettadb postgres
```

You can run your application in dev mode that enables live coding using:

```shell
./mvnw compile quarkus:dev
```
