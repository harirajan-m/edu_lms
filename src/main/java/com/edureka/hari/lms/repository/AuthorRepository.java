package com.edureka.hari.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edureka.hari.lms.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
