// Crie um programa que permita o usuário digitar dois valores, após deve mulCplicar os valores e informar o resultado na tela

import java.util.Scanner;

class Atividade_4 {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y, multiplicacao;
        
        // entrada de dados
        System.out.printf("Vamos multiplicar números!\n");
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        
        // processamento
        multiplicacao = x * y;
        // saída
        System.out.printf("O resultado da multiplicação é igual a %d.", multiplicacao);
        System.exit(0);
    }
}