package com.daniele.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniele.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
