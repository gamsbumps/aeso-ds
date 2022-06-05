package br.edu.uniaeso.q17;

import java.util.Scanner;

public class ConsoleGUI {
    private double txtSalarios;
    private int n;

    Salarios salarios;
    Scanner scanner;

    Salarios[] salarioFuncionario = new Salarios[n];

    public ConsoleGUI() {
        setScanner(new Scanner(System.in));
    }
    public double getTxtSalarios() {
        return txtSalarios;
    }

    public void setTxtSalarios(double txtSalarios) {
        this.txtSalarios = txtSalarios;
    }

    public Salarios getSalarios() {
        return salarios;
    }

    public void setSalarios(Salarios salarios) {
        this.salarios = salarios;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void gui() {
        int resposta;
        double sum = 0;
        int contador = 0;


        while(true) {
            System.out.println("Digite seu salário");
            setTxtSalarios(getScanner().nextDouble());
            setSalarios(new Salarios(getTxtSalarios()));

            sum += getSalarios().getSalario();
            contador++;

            System.out.println("Deseja continuar? 1 - SIM 2 - NÃO");
            resposta = getScanner().nextInt();
            if(resposta == 2) {
                break;
            }
        }
        double mediaSalarios = sum / contador;
        System.out.println("Média de salários: R$" + mediaSalarios);

    }
}
