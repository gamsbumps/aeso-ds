package br.edu.uniaeso.q9;

import java.util.Scanner;

public class ConsoleGUI {
    private int txtA, txtB, txtC;

    private Scanner scanner;
    private Triangles triangles;

    public int getTxtA() {
        return txtA;
    }

    public void setTxtA(int txtA) {
        this.txtA = txtA;
    }

    public int getTxtB() {
        return txtB;
    }

    public void setTxtB(int txtB) {
        this.txtB = txtB;
    }

    public int getTxtC() {
        return txtC;
    }

    public void setTxtC(int txtC) {
        this.txtC = txtC;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Triangles getTriangles() {
        return triangles;
    }

    public void setTriangles(Triangles triangles) {
        this.triangles = triangles;
    }
}
