package org.example;

import org.example.entity.Conta;

import java.util.Scanner;

public class Main {

    static Conta cliente = new Conta("Anonimo", 100);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 0) {
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    resgate();
                    break;
                case 2:
                    deposito();
                    break;
                case 3:
                    visualizar();
                    break;
                case 4:
                    investimentoBonus();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1 - Resgate");
        System.out.println("2 - Depósito");
        System.out.println("3 - Visualizar Dados da Conta");
        System.out.println("4 - Investimento e Bonus");
        System.out.println("0 - Sair");
        System.out.println("Digite o número da opção desejada:");
    }

    public static void resgate() {
        System.out.println("Resgate");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser Resgatado: ");
        double valor = scanner.nextDouble();

        cliente.resgatar(valor);

        System.out.println("Resgate efetuado com sucesso!");

    }

    public static void deposito() {
        System.out.println("Depósito");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();

        cliente.depositar(valor);

        System.out.println("Depósito efetuado com sucesso!");
    }

    public static void visualizar() {
        System.out.println("Visualizar Dados da Conta");
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + cliente.getSaldo());
    }

    public static void investimentoBonus() {
        System.out.println("Investimento e Bonus");
        System.out.println("Bonus: 5% a cada investimento");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor para investir");
        double valor = scanner.nextDouble() * 0.05 + cliente.getSaldo();

        cliente.setSaldo(valor);

        System.out.println("Depósito efetuado com sucesso!");
    }
}
