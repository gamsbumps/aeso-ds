package br.edu.uniaeso.q15;

public class Grau {
    private float grau;

    public Grau(float grau) {
        this.grau = grau;
    }

    public Grau() {
    }

    public float getGrau() {
        return grau;
    }

    public void setGrau(float grau) {
        try {
            this.grau = grau;
        } catch (IllegalArgumentException e) {
            System.out.println("Por favor, digite apenas números");
        }
    }
    public void printConversao() {
        System.out.println("F = " + (getGrau() * 1.8 + 32));
        System.out.println("K = " + (getGrau() + 273.15));
        System.out.println("Re = " + (getGrau() * 0.8));
        System.out.println("Ra = " + (getGrau() * 1.8 + 32 + 459.67));
    }
}
