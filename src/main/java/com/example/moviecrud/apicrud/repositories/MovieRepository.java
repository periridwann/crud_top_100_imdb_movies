package com.example.moviecrud.apicrud.repositories;

import com.example.moviecrud.apicrud.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
}
