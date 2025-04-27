package com.mycompany.main;
public class ContaCorrente extends Conta {
    
    public ContaCorrente(String numero, String agencia, double saldoInicial) {
        super(numero, agencia, saldoInicial);
    }// chama o construtor com o super da classe Conta (pai) para a ContaCorrente

    @Override // mesmo metodo da ContaPoupanca, porém, cobrando 10% 
    public void sacar(double valor) {
        double taxa = valor * 0.10; // 10%
        double total = valor + taxa;
        if (saldo >= total) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente para saque na corrente.");
        }
    }
}
