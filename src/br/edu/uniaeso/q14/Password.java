package br.edu.uniaeso.q14;

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
    public void guesses(Object o){

    }
    public void guessPassword(){
        int guess = 0;
        if(getPlayerOne() < 100 && getPlayerOne() > 0){
            while(guess <= 5){

            }
        }
    }
}
