/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, String agencia, double saldoInicial) {
        super(numero, agencia, saldoInicial);
    }// chama o construtor com o super da classe Conta (pai) para a ContaPoupanca

    @Override // metodo de saque com os 5% cobrado
    public void sacar(double valor) {
        double taxa = valor * 0.005; // 0,5%
        double total = valor + taxa;
        if (saldo >= total) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente para saque na poupança.");
        }
    }
}