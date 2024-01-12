package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<List<Product>> getAllEmployees(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    private ResponseEntity<Product> saveEmployee (@RequestBody Product employee){
        try {
            Product employeeSave = productService.save(employee);
            return ResponseEntity.created(new URI("/employee/"+employeeSave.getCode())).body(employeeSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @DeleteMapping (value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
        productService.deleteById(id);
        return ResponseEntity.ok(!(productService.findById(id)!=null));
    }
}
