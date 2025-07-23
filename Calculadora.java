// Crie um programa que permita o usuário digitar dois valores e o operador, após retornar o valor conforme o tipo de calculo.

import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y, operador;
        double resultado = 0;
        
        // entrada de dados
        System.out.printf("Vamos calcular?\n(1) - adição;\n(2) - subtração;\n(3) - multiplicação;\n(4) - divisão.\nInsira o tipo de operação que deseja realizar: ");
        operador = ler.nextInt();
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        // processamento
        switch (operador) {
            case 1:
            resultado = x + y;
            break;
            case 2:
            resultado = x - y;
            break;
            case 3:
            resultado = x * y;
            break;
            case 4:
            if (y != 0) {
                resultado = (double) x / y;
            } else {
                System.out.println("ERRO! A divisão por zero é indeterminada.");
                System.exit(1);
            }
            break;
        }
        // saída
        System.out.printf("O resultado do cálculo é igual a %.1f.", resultado);
        System.exit(0);
    }
}