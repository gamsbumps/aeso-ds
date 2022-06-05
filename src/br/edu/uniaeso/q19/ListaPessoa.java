package br.edu.uniaeso.q19;

import java.time.LocalDate;

public interface ListaPessoa {


    public void armazenaPessoa(String nome, float altura, int idade);

    public void removePessoa(String nome);

    public int buscaPessoa(String nome);

    public void imprimeAgenda();

    public void imprimePessoa(int indice);
}
