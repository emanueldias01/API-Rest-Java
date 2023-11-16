package com.portfolioemanuel.services;

import com.portfolioemanuel.dto.GameListDTO;
import com.portfolioemanuel.entities.GameList;
import com.portfolioemanuel.repositories.GameListRepository;
import com.portfolioemanuel.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
