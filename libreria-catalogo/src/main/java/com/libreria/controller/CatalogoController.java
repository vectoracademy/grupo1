package com.libreria.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entity.Book;
import com.libreria.entity.BookInstance;
import com.libreria.service.CatalogoService;

@RestController
@RequestMapping(value = "/book")
public class CatalogoController {

	@Autowired
	private CatalogoService catalogoService;
	
	@GetMapping(path = "/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getBook(@PathVariable String isbn) {
		
		return new ResponseEntity<>(catalogoService.getBook(isbn), HttpStatus.OK);
	}
	
	@GetMapping(path = "/instance/{instanceId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BookInstance> getInstance(@PathVariable String instanceId) {
		
		return new ResponseEntity<>(catalogoService.getInstance(instanceId), HttpStatus.OK);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> createBook(@RequestBody @Valid Book book){
		
		return new ResponseEntity<>(catalogoService.saveBook(book), HttpStatus.CREATED);
	}
}
