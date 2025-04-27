package com.mycompany.main;
//Conta com número, agência e saldo
public abstract class Conta implements IOperacao { // recebendo a interface IOperação
    private String numero;
    private String agencia;
    protected double saldo; // somente a classe pai e filhos podem acessar essa variavel e o valor atribuido

    public Conta (String numero, String agencia, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }// Construtor simples

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    @Override // Metodo de deposito 
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}

