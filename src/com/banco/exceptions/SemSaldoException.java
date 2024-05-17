package com.banco.exceptions;

public class SemSaldoException extends RuntimeException {
    public SemSaldoException(){
        super("Não foi possível completar esta ação, conta sem saldo disponível!");
    }
}
