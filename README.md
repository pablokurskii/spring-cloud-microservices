# spring-cloud-microservices
 spring-cloud-microservices

To run
start ConfigApplication
start RegistryApplication
start Docker
create 2 DB for accounts and bills
start AccountApplication
start BillApplication

Eureka discovery available on http://localhost:8761/ 
RabbitMQ http://localhost:15672/ 

REST Test queries

With Gateway Eureka
POST http://localhost:8989/accounts/
POST http://localhost:8989/bills/
POST http://localhost:8989/deposits/

With opened network
POST http://localhost:8082/bills/

Request
```
{
    "accountId": 2,
    "amount": 3000,
    "isDefault": true,
    "overdraftEnabled": true
}
```
Response
```
1
```

POST http://localhost:8081/accounts/

Request
```
{
    "name": "Baxter",
    "phone": "+18654654654",
    "email": "baxter@gmail.com",
    "bills": [
        1
    ]
}
```
Response

```
1
```

POST http://localhost:8989/deposits/

Request
```
{
    "billId": 1,
    "amount": 3000
}
```
Response

```
{
    "amount": 3000,
    "mail": "baxter@gmail.com"
}
```
