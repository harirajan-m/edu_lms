package com.edureka.hari.lms.service;

import com.edureka.hari.lms.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.hari.lms.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);

	}
	//method to add book with Book object
    public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public Book getBook(Long id) {
		return bookRepository.findById(id).get();
	}

	public Book updateBook(Book book) {
		return bookRepository.save(book);

	}
}
