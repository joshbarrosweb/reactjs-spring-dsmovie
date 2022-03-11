package com.joshbarrosweb.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joshbarrosweb.dsmovie.entities.Score;
import com.joshbarrosweb.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
