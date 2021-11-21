# spring-ordermanagement-redis
Order management basic APIs with Springboot and redis (NOSQL) project

The project is a demo of the redis as database(NOSQL) where the order entity is saved. I have created basic CRUD APIs to persist and fetch the data

e.g: localhost:8080/api/orders/create -> POST method

{
    "orderId" : 9872,
    "orderDesc" : "Car parts",
    "orderType" : "Cash pay",
    "orderedBy" : "Mihir",
    "products": ["AB","VF"]
}


