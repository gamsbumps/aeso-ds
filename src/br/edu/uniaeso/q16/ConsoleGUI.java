package br.edu.uniaeso.q16;

import java.util.Scanner;

public class ConsoleGUI {
    private String txtSexo;
    private double txtAltura;

    private Alturas alturas;
    private Scanner scanner;


    public String getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(String txtSexo) {
        this.txtSexo = txtSexo;
    }

    public double getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(double txtAltura) {
        this.txtAltura = txtAltura;
    }

    public Alturas getAlturas() {
        return alturas;
    }

    public void setAlturas(Alturas alturas) {
        this.alturas = alturas;
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
        int contadorHomem = 0;
        int contadorMulher = 0;
        double media = 0;
        double menor = 0, maior = 0;
        System.out.println("Qual seu sexo? Homem ou Mulher");
        setTxtSexo(getScanner().next().toLowerCase());
        System.out.println("Qual sua altura? ");
        setTxtAltura(getScanner().nextFloat());
        setAlturas(new Alturas(getTxtSexo(), getTxtAltura()));
        for (int i = 0; i <= 9; i++) {

            if (menor == 0 && maior == 0) {
                menor = getTxtAltura();
                maior = getTxtAltura();
            }
            if (getTxtAltura() > maior) {
                maior = getTxtAltura();
            }
            if (getTxtAltura() < menor) {
                menor = getTxtAltura();
            }
            if (getTxtSexo().equals("homem")) {
                media += getTxtAltura();
            } else {
                contadorMulher += 1;
            }
            System.out.println("Qual seu sexo? Homem ou Mulher");
            setTxtSexo(getScanner().next().toLowerCase());
            System.out.println("Qual sua altura? ");
            setTxtAltura(getScanner().nextFloat());
        }

        if (contadorHomem > 0) {
            System.out.println("a média da altura dos homens é: " + (media / contadorHomem));
        }
        if (contadorMulher > 0) {
            System.out.println("Há " + contadorMulher + "mulheres no total");
        }

    }
}
