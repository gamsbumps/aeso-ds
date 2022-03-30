package br.edu.uniaeso.q12;

public class Planets {
    private double mercury = 0.37;
    private double venus = 0.88;
    private double mars = 0.38;
    private double jupiter = 2.64;
    private double saturn = 1.15;
    private double uranus = 1.17;

    public double getMercury() {
        return mercury;
    }

    public void setMercury(double mercury) {
        this.mercury = mercury;
    }

    public double getVenus() {
        return venus;
    }

    public void setVenus(double venus) {
        this.venus = venus;
    }

    public double getMars() {
        return mars;
    }

    public void setMars(double mars) {
        this.mars = mars;
    }

    public double getJupiter() {
        return jupiter;
    }

    public void setJupiter(double jupiter) {
        this.jupiter = jupiter;
    }

    public double getSaturn() {
        return saturn;
    }

    public void setSaturn(double saturn) {
        this.saturn = saturn;
    }

    public double getUranus() {
        return uranus;
    }

    public void setUranus(double uranus) {
        this.uranus = uranus;
    }

    public Planets() {
        setMercury(getMercury());
        setVenus(getVenus());
        setMars(getMars());
        setJupiter(getJupiter());
        setSaturn(getSaturn());
        setUranus(getUranus());
    }
    public double getPlanet(double number){
        if(number == 1){
           return getMercury();
        }
        if(number == 2){
            return getVenus();
        }
        if(number == 3){
            return getMars();
        }
        if(number == 4){
            return getJupiter();
        }
        if(number == 5){
            return getSaturn();
        }
        if(number == 6){
            return getUranus();
        }
        return 0;
    }
}
