
import java.util.Scanner;

class Cadastro {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;

        System.out.printf("Bem vindo ao menu, qual é o seu nome? ");
        nome = ler.nextLine();
        System.out.printf("Quantos anos você tem? ");
        idade = ler.nextInt();

        System.out.printf("Seu nome é %s e você tem %d anos.", nome, idade);
        System.exit(0);
    }
}