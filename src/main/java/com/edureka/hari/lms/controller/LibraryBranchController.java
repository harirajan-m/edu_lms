package com.edureka.hari.lms.controller;

import com.edureka.hari.lms.model.LibraryBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.edureka.hari.lms.service.LibraryBranchService;

import java.util.List;

@RestController
public class LibraryBranchController {
    @Autowired
    LibraryBranchService libraryBranchService;

    @GetMapping("/api/library-branches")
    public List<LibraryBranch> getAllLibraryBranches() {
        return libraryBranchService.getAllLibraryBranches();
    }

    @GetMapping("/api/library-branches/{id}")
    public LibraryBranch getLibraryBranch(@RequestParam(value = "id") final
                                              Long id) {
        return libraryBranchService.getLibraryBranch(id);
    }

    @PostMapping("/api/library-branches")
    public LibraryBranch createLibraryBranch(@RequestBody LibraryBranch libraryBranch) {
        return libraryBranchService.createLibraryBranch(libraryBranch);
    }

    @PutMapping("/api/library-branches")
    public LibraryBranch updateLibraryBranch(@RequestBody LibraryBranch libraryBranch) {
        return libraryBranchService.updateLibraryBranch(libraryBranch);
    }

    @DeleteMapping("/api/library-branches/{id}")
    public void deleteLibraryBranch(@RequestParam(value = "id") final
                                        Long id) {
        libraryBranchService.deleteLibraryBranch(id);
    }
}
