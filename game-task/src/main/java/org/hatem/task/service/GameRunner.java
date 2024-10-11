package org.hatem.task.service;


import org.hatem.task.model.Game;
import org.hatem.task.model.Player;

public class GameRunner {

    /**
     * this is the main game method to run the game for the two player .
     * first player get random action and second player always get ROCK action .
     * accumulate the result in the result table (( didn't use if condition to save some processing time for performance aspects ))
     * how count the result ?
     *     - as explained in Action Enum , we set three possibilities for first player (( rock , paper , scissor ))
     *     - each action have a weight and according to multiplication of the first player weight and second player weight will get the value
     *     - this value will be [SCISSOR => [ value = 0 (lose)] , ROCK => [ value = 1 (draw)] , PAPER => [ value = 2 (win)] ] ,
     *     - this mean the first player plays 0 will lose ,
     *     - and if plays 1 will draw
     *     - and if plays 2 will win
     *     - and increase the result table for the three possibilities in the result table for each round .
     */
    private int[] resultTable=new int[3];
    public void play(Game game){
        for (int i=0;i<game.getGameRounds();i++){
            game.setFirstPlayerRandomAction();
            game.setSecondPlayerAction();
            resultTable[(game.getFirstPlayerActionValue()*game.getSecondPlayerActionValue())]++;
        }
    }

    public int[] getResultTable(){
        return this.resultTable;
    }
}
