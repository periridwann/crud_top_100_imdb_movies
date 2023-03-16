package com.example.moviecrud.apicrud.controllers;

import com.example.moviecrud.apicrud.entities.MovieEntity;
import com.example.moviecrud.apicrud.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    //    Insert
    @PostMapping(value = "addNewMovie")
    public MovieEntity addNewMovie(@RequestBody MovieEntity param) {
        movieRepository.save(param);
        return param;
    }

    //    Read All
    @GetMapping(value = "getAllMovie")
    public List<MovieEntity> getAllMovie() {
        return movieRepository.findAll();
    }

    //    Read By ID
    @GetMapping(value = "getById")
    public MovieEntity getById(@RequestParam int id) {
        return movieRepository.findById(id).get();
    }

    //    Update
    @PostMapping(value = "updateMovie")
    public MovieEntity updateMovie(@RequestBody MovieEntity param) {
        return movieRepository.save(param);
    }

    //    Delete
    @GetMapping(value = "deleteMovie")
    public String deleteMovie(@RequestParam int id) {
        movieRepository.deleteById(id);
        return "Success delete movie id "+id;
    }
}
