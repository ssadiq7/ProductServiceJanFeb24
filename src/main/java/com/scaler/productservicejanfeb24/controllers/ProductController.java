package com.scaler.productservicejanfeb24.controllers;

import com.scaler.productservicejanfeb24.dtos.CreateProductDto;
import com.scaler.productservicejanfeb24.models.Product;
import com.scaler.productservicejanfeb24.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{

    private ProductService productService;

    public ProductController(ProductService productService)
    { // Dependency Injection
        this.productService = productService;
    }
    /*
    * API: methods in controller class
    * APIs are nothing but methods in controller class
     */

    /*
    * GET /products: Get all products
     */
    //@RequestMapping(value = "/products", method = RequestMethod.GET) // This is old way of doing
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    /*
    * GET /products/{id}
     */
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") long id)
    {
        return productService.getSingleProduct(id);
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
    public void createProduct(CreateProductDto createProductDto)
    {
        productService.createProduct(createProductDto);
    }
}
