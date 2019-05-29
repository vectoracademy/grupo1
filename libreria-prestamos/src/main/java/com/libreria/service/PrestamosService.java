package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.Book;
import com.libreria.entity.BookInstance;
import com.libreria.entity.BookPick;
import com.libreria.repository.PrestamosRepository;

@Service
public class PrestamosService {

	@Autowired
	private PrestamosRepository prestamosRepository;
	

	public BookInstance pickBook(BookPick bookPick) {

		return prestamosRepository.getInstance(bookPick);
	}
}
