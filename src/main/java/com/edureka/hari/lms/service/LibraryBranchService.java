package com.edureka.hari.lms.service;

import com.edureka.hari.lms.model.LibraryBranch;
import com.edureka.hari.lms.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryBranchService {
    @Autowired
    private LibraryRepository libraryBranchRepository;

    public List<LibraryBranch> getAllLibraryBranches(){
        return libraryBranchRepository.findAll();
    }

    public LibraryBranch getLibraryBranch(Long id){
        return libraryBranchRepository.findById(id).get();
    }

    public LibraryBranch createLibraryBranch(LibraryBranch libraryBranch){
        return libraryBranchRepository.save(libraryBranch);
    }

    public LibraryBranch updateLibraryBranch(LibraryBranch libraryBranch){
        return libraryBranchRepository.save(libraryBranch);
    }

    public void deleteLibraryBranch(Long id){
        libraryBranchRepository.deleteById(id);

    }
}
