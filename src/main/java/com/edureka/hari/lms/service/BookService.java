package com.edureka.hari.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.hari.lms.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	

}
