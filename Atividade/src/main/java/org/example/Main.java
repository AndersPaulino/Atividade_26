package org.example;

import org.example.entity.Conta;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta cliente = new Conta("Anonimo", 100);

        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while (opcao > 0){
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    resgate();
                    continue;
                case 2:
                    deposito();
                    continue;
                case 3:
                    visualizar();
                    continue;
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
        }

        scanner.close();
    }
    public static void menu() {
        System.out.println("Menu" + "\n");
    }
    public static void resgate() {
        System.out.println("Resgate" + "\n");

    }
    public static void deposito() {
        System.out.println("Deposito" + "\n");
    }
    public static void visualizar() {
        System.out.println("Visualizar Dados da Conta" + "\n");
    }
    public static void exibirsaldo() {
        System.out.println("Saldo" + "\n");
    }
    public static void investimento() {
        System.out.println("Investimento" + "\n");
    }
    public static void bonus() {
        System.out.println("Bonus" + "\n");
    }

      /*  Conta cliente = new Conta("Nome do Cliente", 100);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());

        // Realizando operações de depósito e resgate
        cliente.depositar(40);
        cliente.resgatar(30);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());*/
    }