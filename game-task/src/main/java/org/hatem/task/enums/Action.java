package org.hatem.task.enums;

/**
 * this enum is presenting all possibilities for the game ,
 * we set Rock play for the second player , so the action value will be always 1 for second player .
 * for example if the first player :
 *          1- play rock --> value should be 1 => draw .
 *          2- play paper --> value should be 2 => win
 *          3- play scissor --> vale should be 0 => lose
 * So we have three possibilities for first player [0 (lose) , 1 ( draw ) , 2 ( win ) ] =>  ** this will be result table ** .
 */
public enum Action {
    ROCK(1),
    PAPER(2),
    SCISSOR(0);

    private final int value;
    Action(int value ){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
