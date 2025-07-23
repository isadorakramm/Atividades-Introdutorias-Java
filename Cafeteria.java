// Crie um Menu de uma máquina de café que exiba os tipos de café e permita o usuário escolher qual café ele deseja que a máquina faça.
import java.util.Scanner;

class Cafeteria {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        // variáveis
        int escolhaCafe, escolhaComida;
        String cafe = "", comida = "";
        double total = 0.0;

        
        // entrada de dados
        System.out.println("Bem-Vindo(a) à Cafeteria Java!\n\n-- Cardápio --\nBebidas:\n(1) Espresso          R$7,50\n(2) Espresso duplo    R$11,00\n(3) Pingadinho        R$7,50\n(4) Capuccino         R$12,00\n(5) Carioca           R$6,00\n(6) Café com Leite    R$8,00\n(7) Chocolate Quente  R$12,50\nLanches:\n(1) Sanduíche         R$12,00\n(2) Pão de Queijo     R$6,00\n(3) Quiche            R$16,00\n(4) Bolo              R$12,00\n(5) Cookie            R$8,00\n(6) Cheesecake        R$17,00");
        System.out.printf("\nO que você deseja beber? ");
        escolhaCafe = ler.nextInt();

        switch (escolhaCafe) {
            case 1:
                cafe = "Espresso";
                total += 7.50;
                break;
            case 2:
                cafe = "Espresso duplo";
                total += 11.00;
                break;
            case 3:
                cafe = "Pingadinho";
                total += 7.50;
                break;
            case 4:
                cafe = "Capuccino";
                total += 12.00;
                break;
            case 5:
                cafe = "Carioca";
                total += 6.00;
                break;
            case 6:
                cafe = "Café com Leite";
                total += 8.00;
                break;
            case 7:
                cafe = "Chocolate Quente";
                total += 12.50;
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        System.out.printf("\nAlguma comida? (s/n) ");
        String querComida = ler.next();

        if (querComida != "n") {
            System.out.println("O que você deseja comer? ");
            escolhaComida = ler.nextInt();

            switch (escolhaComida) {
                case 1:
                    comida = "Sanduíche";
                    total += 12.00;
                    break;
                case 2:
                    comida = "Pão de Queijo";
                    total += 6.00;
                    break;
                case 3:
                    comida = "Quiche";
                    total += 16.00;
                    break;
                case 4:
                    comida = "Bolo";
                    total += 12.00;
                    break;
                case 5:
                    comida = "Cookie";
                    total += 8.00;
                    break;
                case 6:
                    comida = "Cheesecake";
                    total += 17.00;
                    break;
                default:
                    System.out.println("Opção de comida inválida.");
                    System.exit(0);
            }
            System.out.printf("\nCerto! Você pediu um %s e um %s, o valor total do pedido é igual a R$%.2f.\n", cafe, comida, total);
        } else {
            System.out.printf("\nCerto! Você pediu um %s, o valor total do pedido é igual a R$%.2f.\n", cafe, total);
        }
        System.exit(0);
        }
}