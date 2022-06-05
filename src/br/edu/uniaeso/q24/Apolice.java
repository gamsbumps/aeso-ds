package br.edu.uniaeso.q24;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float premio;

    public Apolice() {
    }

    public Apolice(String nomeSegurado, int idade, float premio) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.premio = premio;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPremio() {
        return premio;
    }

    public void setPremio(float premio) {
        this.premio = premio;
    }

    public void calcularPremio() {
        if(idade <= 18 || idade == 25) {
            setPremio((getPremio()*20)/100);
        } else if(idade > 25 && idade <= 36) {
            setPremio((getPremio() * 15)/100);
        } else {
            setPremio((getPremio() * 10)/100);
        }
    }

    public void oferecerDesconto(String cidade) {
        switch (cidade) {
            case "Curitiba" -> setPremio((float) (getPremio() * 0.8));
            case "Rio de Janeiro" -> setPremio((float) (getPremio() * 0.75));
            case "São Paulo" -> setPremio((float) (getPremio() * 0.90));
            case "Belo Horizonte" -> setPremio((float) (getPremio() * 0.95));
            default -> System.out.println("Digite uma cidade");
        }
    }

    @Override
    public String toString() {
        return "Apolice{" +
                "nomeSegurado='" + nomeSegurado + '\'' +
                ", idade=" + idade +
                ", premio=" + premio +
                '}';
    }
}
