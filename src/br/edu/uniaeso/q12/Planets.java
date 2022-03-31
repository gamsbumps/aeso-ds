package br.edu.uniaeso.q12;

public class Planets {
    private static final double mercury = 0.37;
    private static final double venus = 0.88;
    private static final double mars = 0.38;
    private static final double jupiter = 2.64;
    private static final double saturn = 1.15;
    private static final double uranus = 1.17;

    private double personsMass;
    private int planet;

    public double getPersonsMass() {
        return personsMass;
    }

    public void setPersonsMass(double personsMass) {
        this.personsMass = personsMass;
    }

    public int getPlanet() {
        return planet;
    }

    public void setPlanet(int planet) {
        this.planet = planet;
    }

    public Planets(double personsMass, int planet) {
        setPersonsMass(personsMass);
        setPlanet(planet);
    }

    public Planets() {
    }
    public double calculateWeight(){
        if(getPlanet() == 1){
            return (personsMass * 9.81) / 10 * Planets.mercury;
        } else if(getPlanet() == 2){
            return (personsMass * 9.81) / 10 * Planets.venus;
        }else if(getPlanet() == 3){
            return (personsMass * 9.81) / 10 * Planets.mars;
        }else if(getPlanet() == 4){
            return (personsMass * 9.81) / 10 * Planets.jupiter;
        }else if(getPlanet() == 5){
            return (personsMass * 9.81) / 10 * Planets.saturn;
        }else{
            return (personsMass * 9.81) / 10 * Planets.uranus;
        }
    }
}
