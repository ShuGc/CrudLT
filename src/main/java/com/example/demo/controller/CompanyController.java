package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    private ResponseEntity<List<Company>> getAllEmployees(){
        return ResponseEntity.ok(companyService.findAll());
    }

    @PostMapping
    private ResponseEntity<Company> saveEmployee (@RequestBody Company company){
        try {
            Company companySave = companyService.save(company);
            return ResponseEntity.created(new URI("/company/"+companySave.getNit())).body(companySave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @DeleteMapping (value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
        companyService.deleteById(id);
        return ResponseEntity.ok(companyService.findById(id) == null);
    }
}
