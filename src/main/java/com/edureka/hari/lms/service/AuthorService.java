package com.edureka.hari.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.hari.lms.model.Author;
import com.edureka.hari.lms.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	AuthorRepository authorRepository;

	// Get a constructor with variables
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}

	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}

	public Author getAuthorById(Long authorId) {
		return authorRepository.findById(authorId).get();
	}

	public Author updateAuthor(Author author) {
		return authorRepository.save(author);
	}

	public void deleteAuthor(Long authorId) {
		authorRepository.deleteById(authorId);
	}
}