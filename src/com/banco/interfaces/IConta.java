package com.banco.interfaces;

public interface IConta {
    void sacar(double saldo);
    void depositar(double saldo);
    void transferir(double saldo, IConta conta);

    void informacoes();
}
