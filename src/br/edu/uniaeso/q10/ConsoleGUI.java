package br.edu.uniaeso.q10;

import java.util.Scanner;

public class ConsoleGUI {
    private String txtPlayer;
    private int txtComputer;

    private Scanner scanner;
    private RockPaperScissors rockPaperScissors;

    public static int randInt(int min, int max){
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max -min) + 1) + min;
        return randomNum;
    }

    public String getTxtPlayer() {
        return txtPlayer;
    }

    public void setTxtPlayer(String txtPlayer) {
        this.txtPlayer = txtPlayer;
    }

    public int getTxtComputer() {
        return txtComputer;
    }

    public void setTxtComputer(int txtComputer) {
        this.txtComputer = txtComputer;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public RockPaperScissors getRockPaperScissors() {
        return rockPaperScissors;
    }

    public void setRockPaperScissors(RockPaperScissors rockPaperScissors) {
        this.rockPaperScissors = rockPaperScissors;
    }
    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }
    public void gui(){
        System.out.println("ROCK, PAPER OR SCISSORS? ");
        setTxtPlayer(getScanner().next().toUpperCase());

        setTxtComputer(randInt(0, 2));
    }
}
