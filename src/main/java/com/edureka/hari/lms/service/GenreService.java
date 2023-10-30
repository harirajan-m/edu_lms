package com.edureka.hari.lms.service;

import com.edureka.hari.lms.model.Genre;
import com.edureka.hari.lms.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GenreService {
    @Autowired
    GenreRepository genreRepository;

    public Genre addGenre(Genre genre ){
        return genreRepository.save(genre);
    }


    public List<Genre> getGenres(){
        return genreRepository.findAll();
    }

    public Genre getGenre(Long id){
        return genreRepository.findById(id).get();
    }

    public Genre updateGenre(Genre genre){
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id){
        genreRepository.deleteById(id);
    }

}
