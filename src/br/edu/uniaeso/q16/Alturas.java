package br.edu.uniaeso.q16;

public class Alturas {
    private String sexo;
    private double altura;

    public Alturas(String sexo, double altura) {
        this.sexo = sexo;
        this.altura = altura;
    }

    public Alturas() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
