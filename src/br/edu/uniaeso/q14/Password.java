package br.edu.uniaeso.q14;

import java.util.InputMismatchException;

public class Password {
    private int playerOne, playerTwo;

    public int getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(int playerOne) {
        this.playerOne = playerOne;
    }

    public int getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(int playerTwo) {
        this.playerTwo = playerTwo;
    }

    public Password() {
    }

    public Password(int playerOne, int playerTwo) {
        setPlayerOne(playerOne);
        setPlayerTwo(playerTwo);
    }
}
