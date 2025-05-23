package com.treinamentoSpring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoSpring.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{

}
