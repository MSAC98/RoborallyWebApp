package com.example.testapp.controller;

import com.example.testapp.entity.CardFieldCommand;
import com.example.testapp.entity.Game;
import com.example.testapp.service.CardFieldCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardFieldCommandController {
    @Autowired
    CardFieldCommandService cardFieldCommandService;

    //Se alle Card Field Command i databasen
    @GetMapping("/command")
    public ResponseEntity<List<CardFieldCommand>> getCFCommand(){
        List<CardFieldCommand> CFCommand = cardFieldCommandService.listAllCFCommand();
        return ResponseEntity.ok().body(CFCommand);
    }

    //Se en specifik Card Field Command ved game id i databasen
    @GetMapping("/command/{id}")
    public CardFieldCommand getCFCommandByID (@PathVariable int id){
        CardFieldCommand cardFieldCommand = null;
        cardFieldCommand = cardFieldCommandService.getCFCommand(id);
        return cardFieldCommand;
    }

}
