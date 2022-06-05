package br.edu.uniaeso.q23;

import java.util.Scanner;

public class LampadaTeste {
    public static void menu() {
        System.out.println("1 - Cadastrar lampada");
        System.out.println("2 - Exibir todas as lampadas");
        System.out.println("3 - Exibir quantidade de lampadas cadastradas");
        System.out.println("4 - Consultar quantidade de lampadas de uma determinada potencia");
        System.out.println("5 - Exibir os dados das lampadas com preco menor do que o preco medio das lampadas");
        System.out.println("6 - Exibir a quantidade de lampadas acesas e apagadas");
        System.out.println("0 Sair");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada[] lamp = new Lampada[30];

        int op, qtdLamps = 0;
        do {
            menu();
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    if (qtdLamps > 30) {
                        System.out.println("Total de lampadas preenchidas");
                    } else {
                        String tipo, cor, marca, resposta;
                        int voltagem, potencia;
                        float preco;
                        boolean status;

                        System.out.println("Qual o tipo da lampada?");
                        tipo = scanner.next();
                        System.out.println("Voltagem: ");
                        voltagem = scanner.nextInt();
                        System.out.println("Cor: ");
                        cor = scanner.next();
                        System.out.println("Marca: ");
                        marca = scanner.next();
                        System.out.println("Preço: ");
                        preco = scanner.nextFloat();
                        System.out.println("Potencia: ");
                        potencia = scanner.nextInt();
                        System.out.println("Esta ligada? ");
                        resposta = scanner.next().toUpperCase();
                        if(resposta.equals("SIM")){
                            status = true;
                        }else{
                            status = false;
                        }

                        lamp[qtdLamps] = new Lampada(tipo, cor, marca, voltagem, potencia, preco, status);
                        qtdLamps++;

                    }
                    break;
                case 2:
                    for (int i = 0; i < qtdLamps; i++) {
                        System.out.println(lamp[i].toString());
                    }
                    break;
                case 3:
                    System.out.println("Existem " + qtdLamps + " lampadas cadastradas.");
                    break;
                case 4:
                    System.out.println("Qual a potencia que deseja procurar? ");
                    int potencia = scanner.nextInt();
                    int qtdLampPot = 0;

                    for (int i = 0; i < qtdLamps; i++) {
                        if (lamp[i].getPotencia() == potencia) {
                            qtdLampPot++;
                        }
                    }

                    System.out.println(qtdLampPot + " da mesma potencia!");
                    break;
                case 5:
                    double sum = 0;

                    for (int i = 0; i < qtdLamps; i++) {
                        sum += lamp[i].getPreco();
                    }
                    double media = sum / qtdLamps;
                    for (int i = 0; i < qtdLamps; i++) {
                        if (lamp[i].getPreco() < media) {
                            System.out.println(lamp[i].toString());
                        }
                    }
                    break;
                case 6:
                    int qtdAcesas = 0;
                    int qtdApagadas = 0;
                    for (int i = 0; i < qtdLamps; i++) {
                        if (lamp[i].isStatus()) {
                            qtdAcesas++;
                        } else {
                            qtdApagadas++;
                        }
                    }
                    System.out.println("Há " + qtdAcesas + " lampadas acesas e " + qtdApagadas + " lampadas apagadas");
                    break;
                default:
                    System.out.println("Até mais");
                    break;
            }
        } while (op != 0);
    }
}
