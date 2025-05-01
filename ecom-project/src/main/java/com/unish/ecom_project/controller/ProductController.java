package com.unish.ecom_project.controller;

import com.unish.ecom_project.model.Product;
import com.unish.ecom_project.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class ProductController {

    public ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }


    @RequestMapping("/")
    public String greet(){
       return  "Hello World!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

}
