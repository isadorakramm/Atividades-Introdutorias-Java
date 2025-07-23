// Crie um programa pergunte o nome do aluno e 3 notas, após calcular a média e informar se o aluno está aprovado ou reprovado, sendo que a média da escola é 6.

import java.util.Scanner;

class VerificarMedia {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int nota1, nota2, nota3;
        double media;

        System.out.printf("Vamos verificar se o aluno foi aprovado ou reprovado.\n- Nome do aluno: ");
        nome = ler.nextLine();
        System.out.printf("- Nota na primeira prova: ");
        nota1 = ler.nextInt();
        System.out.printf("- Nota na segunda prova: ");
        nota2 = ler.nextInt();
        System.out.printf("- Nota na terceira prova: ");
        nota3 = ler.nextInt();

        media = (double) (nota1 + nota2 + nota3)/3;

        if (media >= 6) {
            System.out.printf("A média escolar de %s é igual a %.1f. O aluno foi aprovado!", nome, media);
        } else {
            System.out.printf("A média escolar de %s é igual a %.1f. O aluno foi reprovado!", nome, media);
        }

        System.exit(0);
    }
}