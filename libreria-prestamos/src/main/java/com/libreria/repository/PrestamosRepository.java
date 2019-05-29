package com.libreria.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.libreria.entity.Book;
import com.libreria.entity.BookInstance;
import com.libreria.entity.BookPick;

@Repository
public class PrestamosRepository {

	public BookInstance getInstance(BookPick bookPick) {

		ResponseEntity<BookInstance> response = new RestTemplate().getForEntity("http://localhost:8090/book/instance/" + bookPick.getBookInstanceId(), BookInstance.class);
		return response.getBody();
	}
}
