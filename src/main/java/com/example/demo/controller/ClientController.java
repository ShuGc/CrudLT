package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	 @Autowired
	 private ClientService clientService;
	 
	 @GetMapping
	 private ResponseEntity<List<Client>> getAllEmployees(){
		 return ResponseEntity.ok(clientService.findAll());
	 }
	 
	 @PostMapping
	 private ResponseEntity<Client> saveEmployee (@RequestBody Client client){
		 try {
			 Client clientSave = clientService.save(client);
			 return ResponseEntity.created(new URI("/client/"+ clientSave.getIdClient())).body(clientSave);
		 }catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		 }
		
	 }

	 @DeleteMapping (value = "/delete/{id}")
	 private ResponseEntity<Boolean> deleteEmployee (@PathVariable ("id") Long id){
		 clientService.deleteById(id);
		 return ResponseEntity.ok(!(clientService.findById(id)!=null));
	 }
	
}
