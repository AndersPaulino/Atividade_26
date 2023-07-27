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
                    resgate();
                    return;
                case 2:
                    deposito();
                    break;
                case 3:
                    visualizar();
                    break;
                case 4:
                    exibirsaldo();
                    break;
                case 5:
                    investimento();
                    break;
                case 6:
                    bonus();
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
    public static void resgate() {
        System.out.println("Resgate" + "\n");

    }
    public static void deposito() {
        System.out.println("Menu" + "\n");
    }
    public static void visualizar() {
        System.out.println("Menu" + "\n");
    }
    public static void exibirsaldo() {
        System.out.println("Menu" + "\n");
    }
    public static void investimento() {
        System.out.println("Menu" + "\n");
    }
    public static void bonus() {
        System.out.println("Menu" + "\n");
    }

      /*  Conta cliente = new Conta("Nome do Cliente", 100);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());

        // Realizando operações de depósito e resgate
        cliente.depositar(40);
        cliente.resgatar(30);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());*/
    }