package br.edu.uniaeso.q12;

import java.util.Scanner;

public class ConsoleGUI {
    private double txtMass, txtGravity;

    private Scanner scanner;
    private Person person;

    public double getTxtMass() {
        return txtMass;
    }

    public void setTxtMass(double txtMass) {
        this.txtMass = txtMass;
    }

    public double getTxtGravity() {
        return txtGravity;
    }

    public void setTxtGravity(double txtGravity) {
        this.txtGravity = txtGravity;
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
    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }
    public void gui(){
        double number;
        System.out.println("What is your mass? ");
        setTxtMass(getScanner().nextDouble());

        System.out.println("Which planet you chose?");
        System.out.println("1 - Mercury" +
                "2 - Venus" +
                "3 - Mars" +
                "4 - Jupiter" +
                "5 - Saturn" +
                "6 - Uranus");
        number = scanner.nextDouble();
       // setPerson(new Person(getTxtMass(), getTxtGravity(),getPerson().getPlanets().getPlanet(number)));
        getPerson().getPlanets().getPlanet(number);

        System.out.println(getPerson().calculateWeight());

    }
}
