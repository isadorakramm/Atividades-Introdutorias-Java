// Crie um programa que permita o usuário digitar dois valores, após deve dividir os valores e informar o resultado na tela.

import java.util.Scanner;

class Dividir {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y;
        double divisao;
        
        // entrada de dados
        System.out.printf("Vamos dividir números!\n");
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        
        // saída
        if (y != 0) {
            divisao = (double) x / y;
            System.out.printf("O resultado da divisão é igual a %.1f.", divisao);
            System.exit(0);
        } else {
            System.out.println("A divisão por zero é indeterminada.");
            System.exit(1);
        }
        
    }
}