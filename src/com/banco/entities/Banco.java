package com.banco.entities;

import com.banco.interfaces.IConta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    private String nome;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
