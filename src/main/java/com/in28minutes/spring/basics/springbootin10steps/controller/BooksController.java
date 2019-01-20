/**
 * 
 */
package com.in28minutes.spring.basics.springbootin10steps.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.spring.basics.springbootin10steps.model.Book;

/**
 * @author user
 *
 */
@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l,"Mastering Spring 5.1","Michael"));
	}
}
