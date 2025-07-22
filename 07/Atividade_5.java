// Crie um programa que permita o usuário digitar dois valores, após deve dividir os valores e informar o resultado na tela.

import java.util.Scanner;

class Atividade_5 {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y, divisao;
        
        // entrada de dados
        System.out.printf("Vamos dividir números!\n");
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        
        // processamento
        divisao = x / y;
        // saída
        System.out.printf("O resultado da divisão é igual a "+divisao+".");
        System.exit(0);
    }
}