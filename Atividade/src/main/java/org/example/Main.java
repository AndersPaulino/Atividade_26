package org.example;

import org.example.entity.Conta;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao == 0){
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarResgate();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    visualizarDadosDaConta();
                    break;
                case 4:
                    exibirSaldo();
                    break;
                case 5:
                    realizarInvestimento();
                    break;
                case 6:
                    receberBonus();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        };

        scanner.close();
    }
    public static void menu() {
        System.out.println("Menu" + "\n");
    }

      /*  Conta cliente = new Conta("Nome do Cliente", 100);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());

        // Realizando operações de depósito e resgate
        cliente.depositar(40);
        cliente.resgatar(30);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());*/
    }
}