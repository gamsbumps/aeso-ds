package br.edu.uniaeso.q6;

import java.util.Scanner;

public class ConsoleGUI {
    private float txtSalary;

    private Scanner scanner;
    private MinimumWage minimumWage;

    public float getTxtSalary() {
        return txtSalary;
    }

    public void setTxtSalary(float txtSalary) {
        this.txtSalary = txtSalary;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public MinimumWage getMinimumWage() {
        return minimumWage;
    }

    public void setMinimumWage(MinimumWage minimumWage) {
        this.minimumWage = minimumWage;
    }
}
