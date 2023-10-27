package com.edureka.hari.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edureka.hari.lms.model.LibraryBranch;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryBranch, Long> {

}
