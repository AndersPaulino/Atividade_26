package org.example;

import org.example.entity.Conta;

public class Main {
    public static void main(String[] args) {
        Conta cliente = new Conta("Nome do Cliente", 100);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());

        // Realizando operações de depósito e resgate
        cliente.depositar(50);
        cliente.resgatar(30);

        System.out.println("Saldo atual: " + cliente.getSaldoDisponivel());
    }
}