package org.example.entity;

public class Conta {
    private String nome;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " unidades realizado com sucesso.");
    }

    public void resgatar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Resgate de " + valor + " unidades realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o resgate.");
        }
    }

    public double getSaldoDisponivel() {
        // Simulando investimentos com um rendimento de 5% ao mês
        double rendimentoMensal = saldo * 0.05;
        return saldo + rendimentoMensal;
    }
}
