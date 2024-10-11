package org.hatem.task.model;


import org.hatem.task.enums.Action;

import java.util.Random;

public class Game {
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final int gameRounds;

    public Game(Player firstPlayer, Player secondPlayer, int gameRounds){
        this.firstPlayer=firstPlayer;
        this.secondPlayer=secondPlayer;
        this.gameRounds=gameRounds;
    }

    public int getGameRounds() {
        return gameRounds;
    }

    public void setFirstPlayerRandomAction(){
        this.firstPlayer.setAction(getRandomAction());
    }

    public void setFirstPlayerAction(Action action){
        this.firstPlayer.setAction(action);
    }

    public void setSecondPlayerAction(){
        this.secondPlayer.setAction(Action.ROCK);
    }

    public Action getRandomAction(){
       Action[] actions=Action.values();
       Random randomIdx = new Random();
       return actions[randomIdx.nextInt(actions.length)];
    }

    public int getFirstPlayerActionValue(){
       return this.firstPlayer.getAction().getValue();
    }

    public int getSecondPlayerActionValue(){
        return this.secondPlayer.getAction().getValue();
    }

}
