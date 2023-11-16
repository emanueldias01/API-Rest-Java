package com.portfolioemanuel.controllers;


import com.portfolioemanuel.dto.GameMinDTO;
import com.portfolioemanuel.dto.Gamedto;
import com.portfolioemanuel.entities.Game;
import com.portfolioemanuel.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;
    @GetMapping(value = "/{id}")
    public Gamedto findById(@PathVariable Long id){
        Gamedto result = gameService.findById(id);
        return result;

    }

    }





