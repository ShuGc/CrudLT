package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Client;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private ResponseEntity<List<Category>> getAllEmployees(){
        return ResponseEntity.ok(categoryService.findAll());
    }

    @PostMapping
    private ResponseEntity<Category> saveEmployee (@RequestBody Category category){
        try {
            Category categorySave = categoryService.save(category);
            return ResponseEntity.created(new URI("/client/"+ categorySave.getIdCategory())).body(categorySave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping (value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
        categoryService.deleteById(id);
        return ResponseEntity.ok(!(categoryService.findById(id)!=null));
    }
}
