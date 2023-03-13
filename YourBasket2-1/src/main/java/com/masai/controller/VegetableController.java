package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.VegetableService;
import com.masai.module.Vegetable;

@RestController
public class VegetableController {
	
	@Autowired
	private VegetableService vegetableService;
	
	
	@PostMapping("/vegetable/{key}")
	public ResponseEntity<Vegetable> addVegetable(@RequestBody Vegetable vegetable,@PathVariable String key){
		
	  Vegetable vegetable2=	vegetableService.addVegetables(vegetable, key);
	
	  return new ResponseEntity<Vegetable>(vegetable2,HttpStatus.CREATED);
	}
	
	
	@PutMapping("vegetable/{key}")
	public ResponseEntity<Vegetable> updateVegetebl(@RequestBody Vegetable vegetable,@PathVariable String key){
		
		Vegetable vegetable2=vegetableService.updateVegetables(vegetable, key);
		
		return new ResponseEntity<Vegetable>(vegetable2,HttpStatus.OK);
	}

	
	@DeleteMapping("vegetable/{vegetableId}/{key}")
	public ResponseEntity<Vegetable> deleteVegetables(@PathVariable Integer vegetableId,@PathVariable String key){
		
		Vegetable vegetable=vegetableService.removeVegetables(vegetableId, key);
		
		return new ResponseEntity<Vegetable>(vegetable,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/vegetable")
	public ResponseEntity<List<Vegetable>> getAllVegetables(){
		List<Vegetable> vegetables=vegetableService.viewsAllVegetables();
		return new ResponseEntity<List<Vegetable>>(vegetables,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/vegetable/{type}/{key}")
	public ResponseEntity<List<Vegetable>> getVegetableByType(@PathVariable String type,@PathVariable String key){
		List<Vegetable> list=vegetableService.viewVegetablesList(type, key);
		return new ResponseEntity<List<Vegetable>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/vegetableByname/{name}/{key}")
	public ResponseEntity<List<Vegetable>> getVegetableByName(@PathVariable String name,@PathVariable String key){
		List<Vegetable> list=vegetableService.viewVegetablesByName(name, key);
		return new ResponseEntity<List<Vegetable>>(list,HttpStatus.OK);
	}
}
