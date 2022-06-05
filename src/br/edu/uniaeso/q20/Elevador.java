package br.edu.uniaeso.q20;

import java.util.Stack;

import static java.lang.Integer.parseInt;

public class Elevador extends Pessoa{
    private float pesoMaximo;
    private int numAndares, qtdPessoas;
    private Stack<Pessoa> pessoas;

    public Elevador() {
    }

    public Elevador(float peso, float pesoMaximo, int numAndares, int qtdPessoas) {
        super(peso);
        this.pesoMaximo = pesoMaximo;
        this.numAndares = numAndares;
        this.qtdPessoas = qtdPessoas;
        setPessoas(new Stack<>());
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public Stack<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Stack<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void entra() {
        float soma = 0;
        for(int i = 0; i < pessoas.size(); i++) {
            soma += parseInt(String.valueOf(getPessoas().get(i))) ;
        }
        if (soma <= getPesoMaximo()) {

        }
    }
}
