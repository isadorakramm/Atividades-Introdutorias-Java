// Crie um programa que permita o usuário digitar dois valores, após deve subtrair os valores e informar o resultado na tela.

import java.util.Scanner;

class Atividade_3 {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y, subtracao;
        
        // entrada de dados
        System.out.printf("Vamos subtrair números!\n");
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        
        // processamento
        subtracao = x - y;
        // saída
        System.out.printf("O resultado da suntração é igual a %d", subtracao);
        System.exit(0);
    }
}