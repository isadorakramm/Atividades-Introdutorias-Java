// Crie um programa pergunte o nome do aluno, suas 3 notas e a frequência, após calcular a média e informar se o aluno está aprovado ou reprovado, sendo que a média da escola é 6 e a frequência mínima é de 75%.

import java.util.Scanner;

class VerificarAprovacao {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int nota1, nota2, nota3;
        double media, frequencia;

        System.out.printf("Vamos verificar se o aluno foi aprovado ou reprovado.\n- Nome do aluno: ");
        nome = ler.nextLine();
        System.out.printf("- Porcentagem da frequência: ");
        frequencia = ler.nextDouble();
        System.out.printf("- Nota na primeira prova: ");
        nota1 = ler.nextInt();
        System.out.printf("- Nota na segunda prova: ");
        nota2 = ler.nextInt();
        System.out.printf("- Nota na terceira prova: ");
        nota3 = ler.nextInt();

        media = (double) (nota1 + nota2 + nota3)/3;

        if (media >= 6 && frequencia >= 75) {
            System.out.printf("A média escolar de %s é igual a %.1f e sua frequência é igual a %.1f%%. O aluno foi aprovado!", nome, media, frequencia);
        } else if (media >= 6 && frequencia < 75){
            System.out.printf("A média escolar de %s é igual a %.1f, mas sua frequência é igual a %.1f%%. O aluno foi reprovado!", nome, media, frequencia);
        } else if (media < 6 && frequencia >= 75) {
            System.out.printf("A frequência de %s é igual a %.1f%%, mas sua média escolar é igual a %.1f. O aluno foi reprovado!", nome, frequencia, media);
        } else {
            System.out.printf("A média escolar de %s é igual a %.1f e sua frequência é igual a %.1f%%. O aluno foi reprovado!", nome, media, frequencia);
        }

        System.exit(0);
    }
}