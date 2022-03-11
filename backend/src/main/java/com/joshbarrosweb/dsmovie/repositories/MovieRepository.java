package com.joshbarrosweb.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joshbarrosweb.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
