// Crie um programa que permita o usuário digitar dois valores, após deve somar os valores e informar o resultado na tela

import java.util.Scanner;

class Calcula {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y, soma;
        
        // entrada de dados
        System.out.printf("Vamos somar números!\n");
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        
        // processamento
        soma = x + y;
        // saída
        System.out.printf("O resultado da soma é igual a %d", soma);
        System.exit(0);
    }
}