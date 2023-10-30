package com.edureka.hari.lms.controller;

import com.edureka.hari.lms.model.Genre;
import com.edureka.hari.lms.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    GenreService genreService;

    //method for get mapping to retrieve all genres
    @GetMapping("/api/genres") //http://localhost:8080/api/genres
    public List<Genre> getAllGenres() {
        return genreService.getGenres();
    }

    @GetMapping("/api/genres/{id}")
    public Genre getGenre(@RequestParam(name = "id") final Long id) {
        return genreService.getGenre(id);
    }

    @PostMapping("/api/genres")
    public Genre addGenre(@RequestBody Genre genre) {
        return genreService.addGenre(genre);
    }

    @PutMapping("/api/genres/{id}")
    public Genre updateGenre(@RequestBody Genre genre) {
        return genreService.updateGenre(genre);
    }


    @DeleteMapping("/api/genres/{id}")
    public void deleteGenre(@RequestParam(name = "id") final Long id) {
        genreService.deleteGenre(id);
    }

}
