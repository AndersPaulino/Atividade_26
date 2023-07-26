package org.example.entity;

public class Conta {
    private String nome;
    private Integer saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, Integer saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
}
