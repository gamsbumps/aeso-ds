package br.edu.uniaeso.q5;

import java.util.Scanner;

/**
 * Faça um programa em java que receba o valor dos catetos a e b de um triângulo,
 * calcule e mostre o valor da hipotenusa. Fórmula (h = )
 */
public class ConsoleGUI {
    private float txtA, txtB, txtH;

    private Scanner scanner;
    private Triangle triangle;

    public float getTxtA() {
        return txtA;
    }

    public void setTxtA(float txtA) {
        this.txtA = txtA;
    }

    public float getTxtB() {
        return txtB;
    }

    public void setTxtB(float txtB) {
        this.txtB = txtB;
    }

    public float getTxtH() {
        return txtH;
    }

    public void setTxtH(float txtH) {
        this.txtH = txtH;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }

}
