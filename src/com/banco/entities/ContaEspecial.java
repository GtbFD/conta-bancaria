package com.banco.entities;

public class ContaEspecial extends Conta{

    public ContaEspecial(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacoes() {
        System.out.println("--- [Conta Especial] ---");
        informacoesEssenciais();
    }

    @Override
    public void depositar(double saldo){
        setSaldo(getSaldo() + saldo * 1.001);
    }
}
