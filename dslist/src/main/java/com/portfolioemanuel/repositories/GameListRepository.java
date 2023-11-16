package com.portfolioemanuel.repositories;

import com.portfolioemanuel.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
