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

REST Test queries
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
