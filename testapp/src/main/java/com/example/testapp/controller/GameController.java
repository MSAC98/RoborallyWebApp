package com.example.testapp.controller;

import com.example.testapp.entity.Game;
import com.example.testapp.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
//@RequestMapping("/games")
public class GameController {
    @Autowired
    GameService gameService;

    //Se alle spil i databasen
    @GetMapping("/games")
    public ResponseEntity<List<Game>> getGames(){
        List<Game> games = gameService.listAllGame();
        return ResponseEntity.ok().body(games);
    }

    //Se en specifik spil ved id i databasen
    @GetMapping("/games/{id}")
    public Game getGamesByID(@PathVariable int id){
        Game game = null;
        game = gameService.getGame(id);
        return game;
    }

    @DeleteMapping("/games/{id}")
    public ResponseEntity<String> removeGame (@PathVariable int id){
        boolean removed = gameService.removeGame(id);
        return ResponseEntity.ok().body("Game removed");
    }

    public void delete(@PathVariable Integer id){
        gameService.removeGame(id);
    }





    @PostMapping("/")
    public void add(@RequestBody Game game){
        gameService.saveGame(game);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Game game, @PathVariable Integer id){
        try {


            Game existGame = gameService.getGame(id);
            game.setGameID(id);
            gameService.saveGame(game);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}

