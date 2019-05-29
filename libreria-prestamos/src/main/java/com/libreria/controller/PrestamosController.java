package com.libreria.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.entity.Book;
import com.libreria.entity.BookInstance;
import com.libreria.entity.BookPick;
import com.libreria.service.PrestamosService;

@RestController
@RequestMapping(value = "/book")
public class PrestamosController {

	@Autowired
	private PrestamosService prestamosService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BookInstance> pickBook(@RequestBody BookPick bookPick){
		
		return new ResponseEntity<>(prestamosService.pickBook(bookPick), HttpStatus.OK);
	}
}
