package br.edu.uniaeso.q18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private  int idade;
    private String nome;
    private float altura;
    private LocalDate dataNascimento;

    public Pessoa(String nome, float altura, LocalDate dataNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }
    public Pessoa(String nome, float altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calculoDataNascimento(LocalDate aniversario) {
        return Period.between(getDataNascimento(), LocalDate.now()).getYears();
    }
}
