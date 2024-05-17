package com.banco.entities;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacoes(){
        System.out.println("--- [Conta Corrente] ---");
        informacoesEssenciais();
    }

}
