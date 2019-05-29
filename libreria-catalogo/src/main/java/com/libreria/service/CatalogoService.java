package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.Book;
import com.libreria.entity.BookInstance;
import com.libreria.repository.CatalogoRepository;

@Service
public class CatalogoService {

	@Autowired
	private CatalogoRepository catalogoRepository;
	
	public Book getBook(String isbn) {
		
		return catalogoRepository.getBook(isbn);
	}
	
	public BookInstance getInstance(String instanceId) {
		
		return new BookInstance(true, "12345", instanceId);
	}

	public Book saveBook(Book book) {

		return catalogoRepository.saveBook(book);
	}
}
