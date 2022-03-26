package br.edu.uniaeso.q10;

import java.util.Scanner;

public class ConsoleGUI {
    private String txtPlayer;
    private int txtComputer;

    private Scanner scanner;
    private RockPaperScissors rockPaperScissors;

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
}
