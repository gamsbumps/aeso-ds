package br.edu.uniaeso.q15;

import java.util.Scanner;

public class ConsoleGUI {
    private float txtGrau;

    private Grau grau;
    private Scanner scanner;

    public float getTxtGrau() {
        return txtGrau;
    }

    public void setTxtGrau(float txtGrau) {
        this.txtGrau = txtGrau;
    }

    public Grau getGrau() {
        return grau;
    }

    public void setGrau(Grau grau) {
        this.grau = grau;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public ConsoleGUI() {
        setScanner(new Scanner(System.in));
    }

    public void gui() {
        System.out.println("Qual a temperatura em Cº?");
        setTxtGrau(getScanner().nextFloat());

        setGrau(new Grau(getTxtGrau()));
        getGrau().printConversao();
    }
}
