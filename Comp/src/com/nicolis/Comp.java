package com.nicolis;

public class Comp {
        public String marca;
        public String cor;
        public String modelo;
        public long numeroSerie;
        public double preco;


        public void imprimir(){
            System.out.println("Marca = " + marca);
            System.out.println("Cor = " + cor);
            System.out.println("Modelo = " + modelo);
            System.out.println("Numero de Serie = " + numeroSerie);
            System.out.println("Preço = " + preco);
        }
        public void calcularValor(){
            if(marca == "HP" ) {
                preco = preco + preco*30/100;
            }else{
                if(marca == "IBM"){
                    preco = preco + preco*50/100;
                }else{
                    preco = preco;
                }
            }
        }
        public int alterarValor(double valor){
            if(valor > 0){
                preco = valor;
                return 1;
            }else{
                return 0;
            }
        }
    }

