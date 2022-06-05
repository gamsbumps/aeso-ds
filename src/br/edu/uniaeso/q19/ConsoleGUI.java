package br.edu.uniaeso.q19;

import java.util.Scanner;

public class ConsoleGUI {
    private String nome;
    private int idade;
    private float altura;
    private int op;

    private Agenda agenda;
    private Scanner scanner;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
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

    public void menu() {
        System.out.println("AGENDA");
        System.out.println(
                "1 - Armazenar pessoa\n" +
                "2 - Remover pessoa\n" +
                "3 - Buscar pessoa\n" +
                "4 - Imprimir agenda" +
                "5 - Imprimir dados da pessoa"
        );

        setOp(getScanner().nextInt());

        switch (getOp()) {
            case 1:
                armazenaPessoa();
                break;
            case 2:
                removePessoa();
                break;
            case 3:
                buscaPessoa();
                break;
            case 4:
                imprimeAgenda();
                break;
            case 5:
                imprimePessoa();
                break;
        }
    }

    public void armazenaPessoa() {
        System.out.println("Digite seu nome");
        setNome(getScanner().next());
        System.out.println("Digite sua altura");
        setAltura(getScanner().nextFloat());
        System.out.println("Digite sua idade");
        setIdade(getScanner().nextInt());

        setAgenda(new Agenda(getNome(), getAltura(), getIdade()));
        getAgenda().armazenaPessoa(getNome(), getAltura(), getIdade());

    }

    public void removePessoa() {
        System.out.println("Digite o nome da pessoa que deseja remover");
        setNome(getScanner().next());
        getAgenda().removePessoa(getNome());
    }
    public int buscaPessoa() {
        System.out.println("Digite quem deseja procurar");
        setNome(getScanner().next());
        return getAgenda().buscaPessoa(getNome());
    }

    public void imprimeAgenda() {
        getAgenda().imprimeAgenda();
    }

    public void imprimePessoa() {
        getAgenda().imprimePessoa(buscaPessoa());
    }
}
