package br.edu.uniaeso.q19;

import br.edu.uniaeso.q18.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda extends Pessoa implements ListaPessoa{
    private List<Pessoa> agenda;


    public Agenda(String nome, float altura, int idade) {
        super(nome, altura, idade);
        setAgenda(new ArrayList<>());
    }

    public Agenda() {
        super();
    }

    public List<Pessoa> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Pessoa> agenda) {
        this.agenda = agenda;
    }

    @Override
    public void armazenaPessoa(String nome, float altura, int idade) {
        Pessoa pessoa = new Pessoa(nome, altura, idade);
        agenda.add(pessoa);
    }

    @Override
    public void removePessoa(String nome) {
        for(Pessoa p : agenda) {
            if(p.getNome().equals(nome)) {
                agenda.remove(agenda.indexOf(p));
            }
        }
    }

    @Override
    public int buscaPessoa(String nome) {
        Pessoa pessoa = null;
        for(Pessoa p : agenda) {
            if(p.getNome().equals(nome)) {
                pessoa = p;
            }
        }
        return agenda.indexOf(pessoa);
    }

    @Override
    public void imprimeAgenda() {
        for(Pessoa p : agenda) {
            System.out.println(p);
        }
    }

    @Override
    public void imprimePessoa(int indice) {
        System.out.println(agenda.get(indice));
    }
}
