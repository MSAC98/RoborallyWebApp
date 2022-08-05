package com.example.testapp.service;

import com.example.testapp.entity.Game;
import com.example.testapp.entity.Player;
import com.example.testapp.repository.GameRepository;
import com.example.testapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    public List<Player> listAllPlayer(){
        return playerRepository.findAll();
    }
    public void savePlayer(Player player){
        playerRepository.save(player);
    }

    public Player getPlayer(Integer id) {
        return playerRepository.findById(id).get();
    }

    public void deletePlayer(Integer id){
        playerRepository.deleteById(id);
    }
}
