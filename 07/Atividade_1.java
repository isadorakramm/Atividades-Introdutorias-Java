// Crie um programa que permita o usuário digitar o seu nome e idade, após mostrar as informações na tela.

import java.util.Scanner;

class Atividade_1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;

        System.out.printf("Qual é o seu nome? ");
        nome = ler.next();
        System.out.printf("Quantos anos você tem? ");
        idade = ler.nextInt();

        System.out.printf("Seu nome é %s e você tem %d anos.", nome, idade);
        System.exit(0);
    }
}