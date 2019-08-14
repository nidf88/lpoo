package com.nicolis;

import java.util.Scanner;

public class CompTeste {


        public static void main(String[] args) {
            Comp peca = new Comp();
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual é a marca?");
            peca.marca = sc.nextLine();
            System.out.println("Qual é a cor?");
            peca.cor = sc.nextLine();
            System.out.println("Qual é o modelo?");
            peca.modelo = sc.nextLine();
            System.out.println("Qual é o numero de serie?");
            peca.numeroSerie = Long.parseLong(sc.nextLine());
            System.out.println("Qual é o preço?");
            peca.preco = Double.parseDouble(sc.nextLine());
            peca.imprimir();
            peca.calcularValor();
            peca.alterarValor(5000.0);
            peca.imprimir();


        }
    }