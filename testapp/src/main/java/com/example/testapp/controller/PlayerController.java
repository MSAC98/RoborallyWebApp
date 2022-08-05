package com.example.testapp.controller;

import com.example.testapp.entity.Player;
import com.example.testapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("")
    public java.util.List<Player> list(){
        return playerService.listAllPlayer();
    }

    @GetMapping("/player/{id}")
    public ResponseEntity<Player> get(@PathVariable Integer id) {
        try {
            Player player = playerService.getPlayer(id);
            return new ResponseEntity<Player>(player, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<Player>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Player player){
        playerService.savePlayer(player);
    }

    @PutMapping("/player/{id}")
    public ResponseEntity<?> update(@RequestBody Player player, @PathVariable Integer id){
        try {
            Player existGame = playerService.getPlayer(id);
            player.setGameID(id);
            playerService.savePlayer(player);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        playerService.deletePlayer(id);
    }

}
