# Product_Management
A  micro service using Java and Spring Boot
that manages a collection of operations with the basic feature: fetch, save, update, delete.Demonstrating CRUD API with SpringBoot

## Getting Started

### How To Create Firestore Database

You can follow the steps mentioned in [The Firebase Documentation](https://firebase.google.com/docs/firestore/quickstart)


* **Methods**

`GET`| `POST` | `DELETE` | `PUT`
* **URL**

  - `GET` :  /products
  - `GET` :  /products/price
  - `GET` : /products/{barcode}
  - `POST` : /products
  - `PUT` : /products
  - `DELETE` : /products


* **URL Params**

    - **Required:**

        - `barcode=[String]`


* **Data Params**
    - `POST`:
      ```{
      "group": "Biscuits, Chips & Snacks",
      "barcode": "7622201431631",
      "category": "Biscuits, Cookies & Crackers",
      "subCategory": "Biscuits",
      "itemName": "Cadbury Oreo Chocolatey Sandwich Biscuits - Strawberry Creme",
      "imageUrl": "https://storage.googleapis.com/bizbuzzzv2-dev.appspot.com/Commons/Supermarket/MaterData/7622201431631.png",
      "type": "NONE",
      "price1": 10,
      "qty1": 50,
      "mrp1": 10,
      "unit1": "g"
      }```


### STATUS CODE :
* **Success Response:**
    * **Code:** 200 <br />
        * **Content:** `{barcode : 7622201431631}`

---
* **Error Response:**
    * **Code:** 500  Internal Server Error <br />
