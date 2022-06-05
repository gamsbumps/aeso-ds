package br.edu.uniaeso.q18;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Scanner;

public class ConsoleGUI {
    private String nome;
    private ChronoLocalDate dataNascimento;
    private float altura;
    private int dia, mes, ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    Pessoa pessoa;
    Scanner scanner;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ChronoLocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(ChronoLocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public ConsoleGUI() {
        setScanner(new Scanner(System.in));
    }

    public void gui() {

        System.out.println("Digite seu nome");
        setNome(getScanner().next());
        System.out.println("Digite sua altura");
        setAltura(getScanner().nextFloat());
        System.out.println("Digite o dia do seu aniversario");
        setDia(getScanner().nextInt());
        System.out.println("Digite o mês do seu aniversario");
        setMes(getScanner().nextInt());
        System.out.println("Digite o ano do seu aniversario");
        setAno(getScanner().nextInt());
        setDataNascimento(LocalDate.of(getAno(), getMes(), getDia()));

        setPessoa(new Pessoa(getNome(), getAltura(), (LocalDate) getDataNascimento()));
        System.out.println(getPessoa().calculoDataNascimento((LocalDate) getDataNascimento()));
    }
}
