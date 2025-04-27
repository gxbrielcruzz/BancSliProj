package com.mycompany.main;
public class Main {
    public static void main(String[] args) {
        
        ContaPoupanca p = new ContaPoupanca("77777", "333", 1000.0); //Passando os valores direto no novo objeto
        ContaCorrente c = new ContaCorrente("88888", "444", 2000.0); 

        System.out.println("Saldo inicial Poupanca: R$" + p.getSaldo()); // Mostrando o Saldo inicial na poupanca
        System.out.println("Saldo inicial Corrente: R$" + c.getSaldo()); // MOstrando o Saldo inicial na Corrente

        p.depositar(500); // Teste 1/ Deposito
        c.depositar(1000);

        System.out.println(""); 
        System.out.println("Teste 1/Deposito");
        System.out.println("Saldo Poupanca: R$" + p.getSaldo());
        System.out.println("Saldo Corrente: R$" + c.getSaldo());

        p.sacar(200); //Teste 2, saque
        c.sacar(500);

        System.out.println(""); 
        System.out.println("Teste 2/Saque");
        System.out.println("Saldo Poupanca: R$" + p.getSaldo());
        System.out.println("Saldo Corrente: R$" + c.getSaldo());
    }
}
