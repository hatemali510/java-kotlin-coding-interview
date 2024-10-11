package org.hatem.task;


import org.hatem.task.model.Game;
import org.hatem.task.model.Player;
import org.hatem.task.service.GameRunner;

public class Main {

    public static void main(String[] args) {
        int[] resultTable=new int[3];
        GameRunner gameRunner=new GameRunner();
        int gameRounds = 100;
        Player firstPlayer=new Player();
        Player secondPlayer=new Player();
        Game game=new Game(firstPlayer,secondPlayer,gameRounds);
        gameRunner.play(game);
        resultTable= gameRunner.getResultTable();
        System.out.println("Player A wins "+ resultTable[2] +" of 100 games");
        System.out.println("Player B wins "+ resultTable[0] +" of 100 games");
        System.out.println("Draws: "+ resultTable[1]+" of 100 games");
    }
}