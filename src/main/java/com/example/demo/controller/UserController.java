package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    private ResponseEntity<List<User>> getAllEmployees(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    private ResponseEntity<User> saveEmployee (@RequestBody User user){
        try {
            User userSave = userService.save(user);
            return ResponseEntity.created(new URI("/client/"+ userSave.getIdUser())).body(userSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping (value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
        userService.deleteById(id);
        return ResponseEntity.ok(!(userService.findById(id)!=null));
    }
}
