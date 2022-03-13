docker run --rm --name pg-docker -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=root -e POSTGRES_DB=postgres -p 5432:5432  postgres:13
docker run -p 15672:15672 -p 5672:5672 rabbitmq:3-management