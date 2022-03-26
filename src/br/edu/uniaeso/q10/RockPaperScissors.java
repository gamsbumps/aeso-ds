package br.edu.uniaeso.q10;

public class RockPaperScissors {
    private int player;
    public static int randInt(int min, int max){
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max -min) + 1) + min;
        return randomNum;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public RockPaperScissors(int player) {
        setPlayer(player);
    }

    public RockPaperScissors() {
        setPlayer(0);
    }

}
