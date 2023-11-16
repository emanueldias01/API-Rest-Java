package com.portfolioemanuel.services;

import com.portfolioemanuel.dto.GameMinDTO;
import com.portfolioemanuel.dto.Gamedto;
import com.portfolioemanuel.entities.Game;
import com.portfolioemanuel.projections.GameMinProjection;
import com.portfolioemanuel.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public Gamedto findById(Long id){
    Game result = gameRepository.findById(id).get();
    Gamedto dto = new Gamedto(result);
    return dto;
    }

    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result;


   }

   @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return  result.stream().map(x -> new GameMinDTO(x)).toList();

   }




}


