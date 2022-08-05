package com.example.testapp.service;

import com.example.testapp.entity.Game;
import com.example.testapp.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class GameService {
    @Autowired
    private GameRepository gameRepository;
    ArrayList<Game> games = new ArrayList<Game>();
    public List<Game> listAllGame(){
        return gameRepository.findAll();
    }
    public void saveGame(Game game){
        gameRepository.save(game);
    }

    public Game getGame(Integer id) {
        return gameRepository.findById(id).get();
    }

    public boolean removeGame(int id){
        ArrayList<Game> newGames = new ArrayList<Game>();
        int oldSize = games.size();
        games.forEach((Game -> {
            if (Game.getGameID() != id)
                newGames.add(Game);
        }));
        games = newGames;
        return oldSize < games.size() ? true : false;
        //gameRepository.deleteById(id);
    }

}
