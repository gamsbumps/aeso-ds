package br.edu.uniaeso.q14;

import java.util.Scanner;

public class ConsoleGUI {
    private int guess = 1;
    private int txtPlayerOne, txtPlayerTwo;
    private int txtOption;

    private Scanner scanner;
    private Password pw;

    public int getTxtPlayerOne() {
        return txtPlayerOne;
    }

    public void setTxtPlayerOne(int txtPlayerOne) {
        this.txtPlayerOne = txtPlayerOne;
    }

    public int getTxtPlayerTwo() {
        return txtPlayerTwo;
    }

    public void setTxtPlayerTwo(int txtPlayerTwo) {
        this.txtPlayerTwo = txtPlayerTwo;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Password getPw() {
        return pw;
    }

    public void setPw(Password pw) {
        this.pw = pw;
    }

    public int getTxtOption() {
        return txtOption;
    }

    public void setTxtOption(int txtOption) {
        this.txtOption = txtOption;
    }

    public ConsoleGUI() {
        setScanner(new Scanner(System.in));
    }

  

    public void gui() {
        setPw(new Password(getTxtPlayerOne(), getTxtPlayerTwo()));
        
        while (true) {
            if(guess == 1) {
                System.out.println("Digite um número entre 0 e 100");
                setTxtPlayerOne(getScanner().nextInt());
                System.out.println("Jogador 2: Digite a senha entre 0 e 100");
                setTxtPlayerTwo(getScanner().nextInt());
            }
            if (getTxtPlayerTwo() == getTxtPlayerOne()) {
                System.out.println("Parabéns! Você acertou a senha.");
                System.out.println("Deseja continuar? 1-Sim 2-Não");
                setTxtOption(getScanner().nextInt());
                if (getTxtOption() == 1) {
                    guess = 1;
                } else if (getTxtOption() == 2) {
                    break;
                }
            } else if (getTxtPlayerTwo() == getTxtPlayerOne() + 1 || getTxtPlayerTwo() == getTxtPlayerOne() - 1) {
                System.out.println("TÁ QUENTE");
                System.out.println((guess + 1) + "ª tentativa. Digite uma senha entre 0 e 100");
                guess += 1;
                setTxtPlayerTwo(getScanner().nextInt());

            } else {
                System.out.println("Você errou. Tente novamente");
                System.out.println((guess + 1) + "ª tentativa. Digite uma senha entre 0 e 100");
                guess += 1;
                setTxtPlayerTwo(getScanner().nextInt());
            }
            if (guess == 5 && getTxtPlayerTwo() == getTxtPlayerOne()) {
                System.out.println("Voce ganhou.");
                if (getTxtOption() == 1) {
                    guess = 1;
                } else if (getTxtOption() == 2) {
                    break;
                }

            } else if (guess == 5 && getTxtPlayerTwo() != getTxtPlayerOne()) {
                System.out.println("Você perdeu. Tente novamente depois.");
                if (getTxtOption() == 1) {
                    guess = 1;
                } else if (getTxtOption() == 2) {
                    break;
                }
            }

        }
    }
}
