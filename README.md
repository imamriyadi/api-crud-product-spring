## Base url

```
https://api-crud-product-spring.herokuapp.com/v1
```

## Table endpoints

### Product

| Name               | Endpoint               | Method   | Body and response                |
|--------------------|------------------------|----------|----------------------------------|
| Create Product     | `/product`             | `POST`   | [example](#create-product)      |
| Get All Product   | `/product`            | `GET`    | [example](#get-all-product)     |
| Get Product By id | `/product/{id}` | `GET`    | [example](#get-product-by-id)   |
| Update Product    | `/product/{id}`       | `PUT`    | [example](#update-product)      |
| Delete Product    | `/customer/{id}`       | `DELETE` | [example](#delete-product)      |

## Create Product

Request :

- Method : POST
- Endpoint : `/v1/product`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json 
{ 
    "name" : "string",
    "qty" : "integer",
    "price" : "integer"
}
```

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "qty" : "integer",
          "price" : "integer"
        }
    ]
}
```

## Get All product

Request :

- Method : GET
- Endpoint : `/product`
- Header :
    - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "qty" : "integer",
          "price" : "integer"
        }
    ]
}
```

## Get Product By id

Request :

- Method : GET
- Endpoint : `/product/{id}`
- Header :
    - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "qty" : "integer",
          "price" : "integer"
        }
    ]
}
```
 
## Update Product

Request :

- Method : PUT
- Endpoint : `/product/{id}`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json 
{
     "name" : "string",
     "qty" : "integer",
     "price" : "integer"
}
```

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : {
          "id" : "string, unique",
          "name" : "string",
          "qty" : "integer",
          "price" : "integer"
    } 
}
```

## Delete Product

Request :

- Method : DELETE
- Endpoint : `/product/{ids}`
- Header :
    - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "qty" : "integer",
          "price" : "integer"
        }
    ]
}
```