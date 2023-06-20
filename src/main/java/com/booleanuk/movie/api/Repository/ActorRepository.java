package com.booleanuk.movie.api.Repository;

import com.booleanuk.movie.api.Model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    List<Actor> findActorByMovieId(int movieId);
}


