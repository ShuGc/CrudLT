package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.model.Order;
import com.example.demo.service.ClientService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    private ResponseEntity<List<Order>> getAllEmployees(){
        return ResponseEntity.ok(orderService.findAll());
    }

    @PostMapping
    private ResponseEntity<Order> saveEmployee (@RequestBody Order order){
        try {
            Order orderSave = orderService.save(order);
            return ResponseEntity.created(new URI("/client/"+ orderSave.getIdOrder())).body(orderSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping (value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
        orderService.deleteById(id);
        return ResponseEntity.ok(!(orderService.findById(id)!=null));
    }
}
