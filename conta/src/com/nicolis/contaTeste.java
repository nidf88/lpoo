package com.nicolis;

import java.util.Scanner;

public class contaTeste {
    public conta cC = new conta();

    public static void main(String[] args) {
        int opt = 0;
        Scanner sc = new Scanner(System.in);
        contaTeste ct = new contaTeste();
        do {
            System.out.println("Menu");
            System.out.println("1...Cadastrar");
            System.out.println("2...Depositar");
            System.out.println("3...Sacar");
            System.out.println("4...Consultar");
            System.out.println("5...sair");
            System.out.println("Escolha um:");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 1:
                    ct.execCadastra();
                    break;
                case 2:
                    ct.execDeposita();
                    break;
                case 3:
                    ct.execSaca();
                    break;
                case 4:
                    ct.execConsulta();
                    break;
                case 5:
                    System.out.println("Finished");
                    break;
                default:
                    System.out.println("Não possuimos essa opção!!");
            }
        }while(opt!=5);
    }
    public void execCadastra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do cliente:");
        cC.nomeCliente = sc.nextLine();
        System.out.println("Informação da conta:");
        System.out.println("Numero da conta:");
        cC.conta = sc.nextLine();
        System.out.println("Agencia:");
        cC.agencia = sc.nextLine();
    }
    public void execSaca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("valor saque:");
        double valor = Double.parseDouble(sc.nextLine());
        int retorno = cC.sacar(valor);
        if(retorno == 1){
            System.out.println("sucess!!");
        }else{
            System.out.println("fail!");
        }
    }
    public void execDeposita(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor deposito:");
        double valor = Double.parseDouble(sc.nextLine());
        cC.depositar(valor);
    }
    public void execConsulta(){
        cC.imprimir();
    }
}
