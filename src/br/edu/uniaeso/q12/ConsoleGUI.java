package br.edu.uniaeso.q12;

import java.util.Scanner;

public class ConsoleGUI {
    private double txtWeight;
    private int txtPlanet;

    private Scanner scanner;
    private Planets planets;

    public double getTxtWeight() {
        return txtWeight;
    }

    public void setTxtWeight(double txtWeight) {
        this.txtWeight = txtWeight;
    }

    public int getTxtPlanet() {
        return txtPlanet;
    }

    public void setTxtPlanet(int txtPlanet) {
        this.txtPlanet = txtPlanet;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Planets getPlanets() {
        return planets;
    }

    public void setPlanets(Planets planets) {
        this.planets = planets;
    }

    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }

    public void gui(){
        System.out.println("How much do you weight? ");
        setTxtWeight(getScanner().nextDouble());

        System.out.println("Which planet you chose?");
        System.out.println("1 - Mercury" +
                "\n2 - Venus" +
                "\n3 - Mars" +
                "\n4 - Jupiter" +
                "\n5 - Saturn" +
                "\n6 - Uranus");
        setTxtWeight(getScanner().nextInt());
        setPlanets(new Planets(getTxtWeight(), getTxtPlanet()));
        System.out.println(planets.calculateWeight());


    }
}
