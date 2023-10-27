package com.edureka.hari.lms.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edureka.hari.lms.model.Author;
import com.edureka.hari.lms.service.AuthorService;

import java.util.List;

// Autowire Service repository for the controller

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    // method to get all authors
    @GetMapping("/api/authors")
    public List<Author> getAllAuthors() {
        return authorService.getAuthors();
    }

    // write a controller method to get a single author by id with GET
    @GetMapping("/api/authors/{id}")
    public Author getAuthorById(@RequestParam("id") Long id) {
        return authorService.getAuthorById(id);
    }

    // write a controller method to add an author with POST
    @PostMapping("/api/authors")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    // write a controller method to update an author with PUT
    @PutMapping("/api/authors/{id}")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    // write a controller method to delete an author with DELETE
    @DeleteMapping("/api/authors/{id}")
    public void deleteAuthor(@RequestParam("id") Long id) {
        authorService.deleteAuthor(id);
    }
    
    @GetMapping("/api/authors/populate")
    public void putAuthors() {
    	Author a1 = new Author();
    	a1.setAddress("Home");
    	a1.setEmail("author@edureka.co");
    	a1.setName("Jacob Wendy");
    	a1.setPhoneNumber("888-777-1234");
    	authorService.addAuthor(a1);
    }
}