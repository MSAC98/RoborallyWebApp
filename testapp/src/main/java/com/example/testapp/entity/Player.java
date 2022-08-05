package com.example.testapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Player_no")
    private int playerNo;
    @Column(name = "Game_id")
    private int gameID;
    @Column(name = "Name")
    private String name;
    @Column(name = "Color")
    private String color;
    @Column(name = "X_position")
    private int xPosition;
    @Column(name = "Y_position")
    private int yPosition;
    @Column(name = "Heading")
    private int heading;

    public Player(){}

    public Player(int playerNo, int gameID, String name, String color, int xPosition, int yPosition, int heading) {
        this.playerNo = playerNo;
        this.gameID = gameID;
        this.name = name;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.heading = heading;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }
}


