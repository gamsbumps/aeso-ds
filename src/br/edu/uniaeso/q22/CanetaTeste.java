package br.edu.uniaeso.q22;

import java.util.Scanner;

public class CanetaTeste {
    private String txtTipo, txtCor;
    private int txtTamanho;

    private Scanner scanner;
    private Caneta caneta;

    public String getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(String txtTipo) {
        this.txtTipo = txtTipo;
    }

    public String getTxtCor() {
        return txtCor;
    }

    public void setTxtCor(String txtCor) {
        this.txtCor = txtCor;
    }

    public int getTxtTamanho() {
        return txtTamanho;
    }

    public void setTxtTamanho(int txtTamanho) {
        this.txtTamanho = txtTamanho;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Caneta getCaneta() {
        return caneta;
    }

    public void setCaneta(Caneta caneta) {
        this.caneta = caneta;
    }

    public CanetaTeste() {
        setScanner(new Scanner(System.in));
    }

    public void gui() {
        System.out.println("Digite o tipo da caneta:");
        setTxtTipo(getScanner().next());
        System.out.println("Digite a cor da caneta");
        setTxtCor(getScanner().next());
        System.out.println("Digite o tamanho da caneta");
        setTxtTamanho(getScanner().nextInt());
        setCaneta(new Caneta(getTxtTipo(), getTxtCor(), getTxtTamanho()));
        getCaneta().toString();
    }
}
