package com.edureka.hari.lms.controller;

import com.edureka.hari.lms.model.Borrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.edureka.hari.lms.service.BorrowerService;

import java.util.List;

@RestController
public class BorrowerController {
    @Autowired
    private BorrowerService borrowerService;

    @GetMapping("/api/borrowers")
    public List<Borrower> getAllBorrowers() {
        return borrowerService.getAllBorrowers();
    }


    @GetMapping("/api/borrowers/{id}")
    public Borrower getBorrower(@RequestParam(value = "id") final Long id) {
        return borrowerService.getBorrower(id);
    }

    @PostMapping("/api/borrowers")
    public Borrower createBorrower(@RequestBody Borrower borrower) {
        return borrowerService.createBorrower(borrower);

    }


    @PutMapping("/api/borrowers/{id}")
    public Borrower updateBorrower(@RequestBody Borrower borrower) {
        return borrowerService.updateBorrower(borrower);
    }

    @DeleteMapping("/api/borrowers/{id}")
    public void deleteBorrower(@RequestParam(value = "id") final Long id) {
        borrowerService.deleteBorrower(id);
    }
}
