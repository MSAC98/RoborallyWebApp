package com.example.testapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Card_field_command")
public class CardFieldCommand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Player_no")
    private int playerNo;
    @Column(name = "Game_id")
    private String gameID;
    @Column(name = "Command")
    private int command;
    @Column(name = "Position")
    private String position;
    @Column(name = "Visible")
    private int visible;
    @Column(name = "Active")
    private String active;
    @Column(name = "Is_program")
    private String isProgram;

    public CardFieldCommand(){
    }

    public CardFieldCommand(int playerNo, String gameID, int command, String position, int visible, String active, String isProgram) {
        this.playerNo = playerNo;
        this.gameID = gameID;
        this.command = command;
        this.position = position;
        this.visible = visible;
        this.active = active;
        this.isProgram = isProgram;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getIsProgram() {
        return isProgram;
    }

    public void setIsProgram(String isProgram) {
        this.isProgram = isProgram;
    }
}
