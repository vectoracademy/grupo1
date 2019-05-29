package com.libreria.repository;

import org.springframework.stereotype.Repository;

import com.libreria.entity.Book;

@Repository
public class CatalogoRepository {

	public Book getBook(String isbn) {
		
		return new Book("El Reino de la Chirimoya", "35.40", isbn);
	}

	public Book saveBook(Book book) {

		return book;
	}
}
