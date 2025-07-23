
import java.util.Scanner;

class Cadastra {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;

        System.out.printf("Bem vindo ao menu ");
        nome = ler.nextLine();

        System.out.printf("Seu nome é %s e você tem %d anos.", nome, idade);
        System.exit(0);
    }
}