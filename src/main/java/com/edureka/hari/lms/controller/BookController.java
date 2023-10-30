package com.edureka.hari.lms.controller;

import com.edureka.hari.lms.model.Author;
import com.edureka.hari.lms.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.edureka.hari.lms.service.BookService;

import java.util.List;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;

	//controller method to get all books
	@GetMapping("/api/books")
	public List<Book> getAllBooks() {
		return bookService.getBooks();
	}

	//rest controller method to get book by id
	@GetMapping("/api/books/{id}")
    public Book getBookById(Long id) {
		return bookService.getBook(id);
	}

	//rest controller method to add book with Book object as payload with http post
	//http://localhost:8080/api/books
	@PostMapping("/api/books")
    public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
    }

	@PutMapping("/api/books/{id}")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@DeleteMapping("/api/books/{id}")
	public void deleteBook(@RequestParam("id") Long id) {
		bookService.deleteBook(id);
	}





	//get book by id



	
	
}
