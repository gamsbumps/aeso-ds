package br.edu.uniaeso.q4;

import java.util.Scanner;

/**
 * Escreva um programa em java para ler o nome e a idade de uma pessoa,
 * e exibir quantos dias de vida ela possui. Considere sempre anos completos,
 * e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
 * veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS
 */
public class ConsoleGUI {
    private String txtName;
    private int txtAge;

    private Scanner scanner;
    private Person person;

    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getTxtAge() {
        return txtAge;
    }

    public void setTxtAge(int txtAge) {
        this.txtAge = txtAge;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void gui(){
        System.out.println("What is your name? ");
        setTxtName(getScanner().next());

        System.out.println("How old are you? ");
        setTxtAge(getScanner().nextInt());

        setPerson(new Person(getTxtName(), getTxtAge()));
        System.out.println(getTxtName() + ", you have lived " + getPerson().countingDaysLived() + " days.");
    }
}
