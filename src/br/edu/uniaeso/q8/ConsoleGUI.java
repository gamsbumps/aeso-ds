package br.edu.uniaeso.q8;

import java.util.Scanner;

public class ConsoleGUI {
    private float txtX1, txtX2, txtY1, txtY2;

    private Scanner scanner;
    private DistancePoints distancePoints;

    public float getTxtX1() {
        return txtX1;
    }

    public void setTxtX1(float txtX1) {
        this.txtX1 = txtX1;
    }

    public float getTxtX2() {
        return txtX2;
    }

    public void setTxtX2(float txtX2) {
        this.txtX2 = txtX2;
    }

    public float getTxtY1() {
        return txtY1;
    }

    public void setTxtY1(float txtY1) {
        this.txtY1 = txtY1;
    }

    public float getTxtY2() {
        return txtY2;
    }

    public void setTxtY2(float txtY2) {
        this.txtY2 = txtY2;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public DistancePoints getDistancePoints() {
        return distancePoints;
    }

    public void setDistancePoints(DistancePoints distancePoints) {
        this.distancePoints = distancePoints;
    }
}
