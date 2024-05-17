package com.banco.entities;

import com.banco.exceptions.SemSaldoException;
import com.banco.interfaces.IConta;

import java.util.Random;

public abstract class Conta implements IConta {

    private Cliente cliente;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = new Random().nextInt(1000000);
        this.numero = new Random().nextInt(1000000);
    }

    @Override
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void transferir(double saldo, IConta conta) {
        if (this.saldo >= saldo) {
            this.sacar(saldo);
            conta.depositar(saldo);
        }else {
            throw new SemSaldoException();
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void informacoesEssenciais(){
        System.out.println("Proprietário = " + cliente.getNome());
        System.out.println("Agência = " + agencia);
        System.out.println("Número = " + numero);
        System.out.println("Saldo = " + saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
