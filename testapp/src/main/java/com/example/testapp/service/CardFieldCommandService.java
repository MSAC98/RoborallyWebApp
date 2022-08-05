package com.example.testapp.service;


import com.example.testapp.entity.CardFieldCommand;
import com.example.testapp.entity.Player;
import com.example.testapp.repository.CardFieldCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CardFieldCommandService {
    @Autowired
    private CardFieldCommandRepository cardFieldCommandRepository;

    public List<CardFieldCommand> listAllCFCommand(){
        return cardFieldCommandRepository.findAll();
    }
    public void saveCFCommand(CardFieldCommand player){
        cardFieldCommandRepository.save(player);
    }

    public CardFieldCommand getCFCommand(Integer id) {
        return cardFieldCommandRepository.findById(id).get();
    }

    public void deletePlayer(Integer id){
        cardFieldCommandRepository.deleteById(id);
    }
}
