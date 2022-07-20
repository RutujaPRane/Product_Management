package com.example.Product_Management.controller;

import com.example.Product_Management.Entity.Product;
import com.example.Product_Management.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) throws ExecutionException, InterruptedException {
        return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() throws ExecutionException, InterruptedException {
        return productService.fetchProductList();
    }

    @GetMapping("/products/{barcode}")
    public Product fetchProduct(@PathVariable("barcode") String barcode) throws ExecutionException, InterruptedException {
        return productService.fetchProduct(barcode);
    }

    @GetMapping("/products/price")
    public List<Product> getAllProductByValue(@RequestParam(name = "gt") Long greaterThan, @RequestParam(name = "lt") Long lessThan) throws ExecutionException, InterruptedException {
        return productService.getAllProductByValue(greaterThan, lessThan);

    }



    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) throws ExecutionException, InterruptedException {
        return productService.updateProduct(product);
    }
//
    @DeleteMapping("/products")
    public String deleteProduct(@RequestParam String barcode) {
        return productService.deleteProduct(barcode);

    }


}
