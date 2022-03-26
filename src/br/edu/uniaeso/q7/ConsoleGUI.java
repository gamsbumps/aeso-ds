package br.edu.uniaeso.q7;

import java.util.Scanner;

public class ConsoleGUI {
    private float txtDiagonal1, txtDiagonal2;

    private Scanner scanner;
    private Rhombus rhombus;

    public float getTxtDiagonal1() {
        return txtDiagonal1;
    }

    public void setTxtDiagonal1(float txtDiagonal1) {
        this.txtDiagonal1 = txtDiagonal1;
    }

    public float getTxtDiagonal2() {
        return txtDiagonal2;
    }

    public void setTxtDiagonal2(float txtDiagonal2) {
        this.txtDiagonal2 = txtDiagonal2;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Rhombus getRhombus() {
        return rhombus;
    }

    public void setRhombus(Rhombus rhombus) {
        this.rhombus = rhombus;
    }

}
