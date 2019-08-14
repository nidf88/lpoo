package com.nicolis;

public class conta {
    public String nomeCliente;
    public double saldo;
    public String conta;
    public String agencia;
    public void depositar(double valor){
    saldo = saldo + valor;
    }
    public int sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return 1;
        }
        return 0;
    }
    public void imprimir(){
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);

    }
}
