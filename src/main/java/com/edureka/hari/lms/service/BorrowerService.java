package com.edureka.hari.lms.service;

import com.edureka.hari.lms.model.Borrower;
import com.edureka.hari.lms.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService {
    @Autowired
    private BorrowerRepository borrowerRepository;

    public List<Borrower> getAllBorrowers(){
        return borrowerRepository.findAll();
    }

    public Borrower getBorrower(Long id){
        return borrowerRepository.findById(id).get();
    }

    public Borrower createBorrower(Borrower borrower){
        return borrowerRepository.save(borrower);
    }


    public void deleteBorrower(Long id){

        borrowerRepository.deleteById(id);

    }

    public Borrower updateBorrower(Borrower borrower){
        return borrowerRepository.save(borrower);

    }


}
