package com.scaler.productservicejanfeb24.controllers;

import com.scaler.productservicejanfeb24.dtos.CreateProductDto;
import com.scaler.productservicejanfeb24.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    /*
    * API: methods in controller class
    * APIs are nothing but methods in controller class
     */

    /*
    * GET /products: Get all products
     */
    //@RequestMapping(value = "/products", method = RequestMethod.GET) // This is old way of doing
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return null;
    }

    /*
    * GET /products/{id}
     */
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        return null;
    }

    /*
    * POST /products: Create a new product
    * {
    * title = ______,
    * description = ______,
    * image_Url = ______,
    * .
    * .
    * .
    * }
     */
    @PostMapping("/products")
    public void createProduct(CreateProductDto createProductDto) {

    }
}
