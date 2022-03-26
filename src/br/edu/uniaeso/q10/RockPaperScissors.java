package br.edu.uniaeso.q10;

public class RockPaperScissors {
    private int computer;
    private String player;
    public static int randInt(int min, int max){
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max -min) + 1) + min;
        return randomNum;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public RockPaperScissors(String player, int computer) {
        setPlayer(player);
        setComputer(computer);
    }

    public RockPaperScissors() {
        setPlayer(" ");
        setComputer(0);
    }
    public void playRPS(){
        if(getPlayer().equals("ROCK")){
            if(computer == 2){
                System.out.println("Player win");
            }else if (computer == 1){
                System.out.println("Computer win");
            }else{
                System.out.println("Tie");
            }
        }
        if(getPlayer().equals("PAPER")){
            if (computer == 0){
                System.out.println("Player win");
            }else if (computer == 2){
                System.out.println("Compter win");
            }else{
                System.out.println("Tie");
            }
        }
        if(getPlayer().equals("SCISSORS")){
            if(computer == 1){
                System.out.println("Player win");
            }else if(computer == 0){
                System.out.println("Computer win");
            }else{
                System.out.println("Tie");
            }
        }
    }

}
