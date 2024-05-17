package com.banco.entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacoes() {
        System.out.println("--- [Conta Poupança] ---");
        informacoesEssenciais();
    }
}
