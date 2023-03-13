package com.masai.Service;

import java.util.List;
import java.util.Locale.Category;

import com.masai.Exception.*;
import com.masai.module.Vegetable;

public interface VegetableService {
	
	public Vegetable addVegetables(Vegetable vegetables,String key) throws VegetableException;
	public Vegetable updateVegetables(Vegetable vegetables,String key) throws VegetableException;
	public Vegetable removeVegetables(Integer vegetablesId,String key) throws VegetableException;
	public List<Vegetable> viewsAllVegetables() throws VegetableException;
	public List<Vegetable> viewVegetablesList(String type,String key) throws VegetableException;
	public List<Vegetable> viewVegetablesByName(String name,String key) throws VegetableException;
	

}
