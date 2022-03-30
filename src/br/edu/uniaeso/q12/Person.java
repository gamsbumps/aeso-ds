package br.edu.uniaeso.q12;

public class Person {
    private double mass, gravity = 9.81;
    private Planets planets;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public Planets getPlanets() {
        return planets;
    }

    public void setPlanets(Planets planets) {
        this.planets = planets;
    }

    public Person(double mass, double gravity, Planets planets) {
        setMass(mass);
        setGravity(gravity);
        setPlanets(planets);
    }
    public double calculateWeight(){
        double number = 0;
        double planet = planets.getPlanet(number);
        double weight = (mass * gravity) * planet / 10;
        return weight;
    }

}
