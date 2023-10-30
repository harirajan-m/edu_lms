package com.edureka.hari.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edureka.hari.lms.model.Borrower;

import java.util.List;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {


}
