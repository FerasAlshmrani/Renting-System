# Rent Express

### I worked on redesign structure  class diagram 
--------
## mainly worked in :

models:

| MyOrder model
| Comment model
| Product model

-----
| RenterService

- buyProduct()

---

| ProductService
| ProductController 
| ProductRepository

Endpoints:
note there are logic in these CREATE,UPDATE,REMOVE
- getProduct()
- addProduct()
- updateProduct()
- removeProduct()
- expandDurationForProduct()
- getProductsByLessor()
- getProductsByAvaliable()
- getProductsByAvailableAndPrice()
- getProductsByAvaliableAndPriceDESC()
- getProductsByName()

------

| OrderService
| OrderController
| OrderRepository

//Note in order model i didnt write any vaildation because they are coming from other class (buyProduct)

EndPoints:
- getOrder()
- addOrder()
- isReturnedProduct()
- OrderList()

//Note add Comment Coming from isReturendProduct function

---
| commentService 
| CommentController
| CommentRepository
 
- updateComment()
- deleteComment()
----

## also i have worked Scheduling in our server

Schedule methods :

- checkOrderEndDate()
- checkProductEndDate()
- checkOrderBlockState()
- checkSubscriptionsEndDate()

#### also we all worked with relations , figma , security , draw class diagram
