package org.hatem.task.service;


import org.hatem.task.enums.Action;
import org.hatem.task.model.Game;
import org.hatem.task.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class GameRunnerTest {


    /**
     * first player plays Rock
     * result should be [0,1,0]
     */
    @Test
    void testGamePlayWithFirstPlayRock(){
        Player firstPlayer=new Player();
        Player secondPlayer=new Player();
        Game game=new Game(firstPlayer,secondPlayer,1);
        game.setFirstPlayerAction(Action.ROCK);
        game.setSecondPlayerAction();
        GameRunner gameRunner=new GameRunner();
        gameRunner.play(game);
        int[] resultTable=gameRunner.getResultTable();
        Assertions.assertEquals(0,resultTable[0]);
        Assertions.assertEquals(1,resultTable[1]);
        Assertions.assertEquals(0,resultTable[2]);
    }

    /**
     * first player plays Paper
     * result should be [0,0,2]
     */
    @Test
    void testGamePlayWithFirstPlayPaper(){
        Player firstPlayer=new Player();
        Player secondPlayer=new Player();
        Game game=new Game(firstPlayer,secondPlayer,1);
        game.setFirstPlayerAction(Action.PAPER);
        game.setSecondPlayerAction();
        GameRunner gameRunner=new GameRunner();
        gameRunner.play(game);
        int[] resultTable=gameRunner.getResultTable();
        Assertions.assertEquals(0,resultTable[0]);
        Assertions.assertEquals(0,resultTable[1]);
        Assertions.assertEquals(1,resultTable[2]);
    }

    /**
     * first player plays SCISSOR
     * result should be [1,0,0]
     */
    @Test
    void testGamePlayWithFirstPlayScissor(){
        Player firstPlayer=new Player();
        Player secondPlayer=new Player();
        Game game=new Game(firstPlayer,secondPlayer,1);
        game.setFirstPlayerAction(Action.SCISSOR);
        game.setSecondPlayerAction();
        GameRunner gameRunner=new GameRunner();
        gameRunner.play(game);
        int[] resultTable=gameRunner.getResultTable();
        Assertions.assertEquals(1,resultTable[0]);
        Assertions.assertEquals(0,resultTable[1]);
        Assertions.assertEquals(0,resultTable[2]);
    }
}