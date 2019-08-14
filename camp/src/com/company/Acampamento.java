package com.company;

public class Acampamento {

    public String nome;
    public int idade;
    public char equipe;

    public void imprimir() {
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
        System.out.println("Equipe = " + equipe);
    }

    public void separarGrupo() {
        if (idade <= 5) {
            equipe = ' ';
        }else{
            if(idade <=10){
                equipe = 'A';
            }else{
                if (idade <=20){
                    equipe = 'B';
                }else{
                    equipe= 'C';
                }
            }
        }

    }
}
