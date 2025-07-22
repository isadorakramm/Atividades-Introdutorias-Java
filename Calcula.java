import java.util.Scanner;

class Calcula {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int x, y, soma;
        
        // entrada de dados
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        y = ler.nextInt();
        
        // processamento
        soma = x + y;
        // saída
        System.out.print(soma);
        System.exit(0);
    }
}