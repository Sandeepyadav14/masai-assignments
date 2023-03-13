package com.masai.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Bean.BookLibrary;

@RestController
public class MyController {

	
     
	static List<BookLibrary> libraries=new ArrayList<>();
    
	@PostConstruct
	 public void AddBook() {
      
    	
        BookLibrary bookLibrary=new BookLibrary();
        bookLibrary.setName("Ramayan Books");
        bookLibrary.setAuthor("Prem Chopra");
        bookLibrary.setCategory("Ramayan");
        bookLibrary.setPages(221);
        bookLibrary.setPublication("Rajshree Publication");
        bookLibrary.setPrice(9000);
       bookLibrary.setBookId(1);
       libraries.add(bookLibrary);
       
       BookLibrary bookLibrary1=new BookLibrary();
       bookLibrary1.setName("Ramanand Sagar ");
       bookLibrary1.setAuthor("Vlmiki");
       bookLibrary1.setCategory("Mahabharat");
       bookLibrary1.setPages(150);
       bookLibrary1.setPublication("Dharam ji Publication");
       bookLibrary1.setPrice(9870);
      bookLibrary1.setBookId(2);
      libraries.add(bookLibrary1);
    }
	
    @GetMapping("/book")
    public static List<BookLibrary> getBook(){
    	return libraries;
    }
    
    @GetMapping("/book/{id}")
    public static BookLibrary getBookById(@PathVariable Integer id) {
   BookLibrary book=null;
    	 for(BookLibrary i:libraries) {
    		 if(i.getBookId()==id) {
    			 book=i;
    		 }
    	 }
    	 return book;
    }
    
    @PostMapping("/addbook")
    public static BookLibrary addBookLibraries(@RequestBody BookLibrary book) {
    	libraries.add(book);
    	return book;
    	
    }
    
    @DeleteMapping("/bookdelete/{id}")
    public static BookLibrary deleteBook(@PathVariable Integer id) {
    	BookLibrary bookLibrary=null;
    	for(BookLibrary i:libraries) {
    		if(i.getBookId()==id) {
    			bookLibrary=i;
    			libraries.remove(i);
    		}
    	}
    	return bookLibrary;
    
    	
    }
     
     
     
}
