package com.example.testapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Game_id")
    private int gameID;
    @Column(name = "Board_name")
    private String BoardName;
    @Column(name = "Current_player")
    private int currentPlayer;
    @Column(name = "Phase")
    private String phase;
    @Column(name = "Step")
    private int step;
    @Column(name = "Game_name")
    private String gameName;

    public Game(){
    }

    public Game(int gameID, String boardName, int currentPlayer, String phase, int step, String gameName) {
        this.gameID = gameID;
        BoardName = boardName;
        this.currentPlayer = currentPlayer;
        this.phase = phase;
        this.step = step;
        this.gameName = gameName;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getBoardName() {
        return BoardName;
    }

    public void setBoardName(String boardName) {
        BoardName = boardName;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
