package org.hatem.task.service;


import org.hatem.task.enums.Action;
import org.hatem.task.model.Game;
import org.hatem.task.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameRunnerTest {


    @Test
    void testGamePlay(){
        Player firstPlayer=new Player();
        Player secondPlayer=new Player();
        Game game=new Game(firstPlayer,secondPlayer,1);
        GameRunner gameRunner=new GameRunner();
        gameRunner.play(game);
        int[] resultTable=gameRunner.getResultTable();
        int firstPlayActionValue=game.getFirstPlayerActionValue();
        if (firstPlayActionValue==0){
            Assertions.assertEquals(1,resultTable[0]);
        }
        if (firstPlayActionValue==1){
            Assertions.assertEquals(1,resultTable[1]);
        }
        if (firstPlayActionValue==2){
            Assertions.assertEquals(1,resultTable[2]);
        }
    }
}