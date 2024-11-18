package com.daniele.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniele.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
