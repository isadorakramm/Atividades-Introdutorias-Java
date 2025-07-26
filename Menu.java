// Cria um menu que permite o usuário escolher uma das seguintes opções: Cadastrar usuário, Atualizar Cadastro, Cadastrar Produto, Excluir Produto e Sair, quando o usuário escolher a opção ele deve exibir na tela o recurso e permitir voltar ao menu principal, quando o usuário escolher o sair ele deve encerrar o programa.

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        // instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();
        ArrayList<String> produtos = new ArrayList<>();
        int opcao;

        while (true) {
            System.out.println("\n- Bem-Vindo(a) ao menu! -\n\n(1) Cadastrar usuário\n(2) Atualizar cadastro\n(3) Cadastrar produto\n(4) Excluir produto\n(5) Sair\n\n- Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            ler.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n- Cadastrar usuário -\n");
                    System.out.print("Digite o nome do usuário: ");
                    String novoUsuario = ler.nextLine();
                    usuarios.add(novoUsuario);
                    System.out.println("Usuário cadastrado: " + novoUsuario);
                    break;
                case 2:
                    System.out.println("\n- Atualizar cadastro -\n");
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário foi cadastrado no momento.");
                        break;
                    }
                    System.out.println("Usuários:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println((i + 1) + " - " + usuarios.get(i));
                    }
                    System.out.print("Qual usuário você deseja atualizar? ");
                    int listaUsuarios = ler.nextInt() - 1;
                    ler.nextLine();
                    if (listaUsuarios >= 0 && listaUsuarios < usuarios.size()) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = ler.nextLine();
                        usuarios.set(listaUsuarios, novoNome);
                        System.out.println("Usuário atualizado com sucesso!");
                    } else {
                        System.out.println("Número inválido...");
                    }
                    break;
                case 3:
                    System.out.println("\n- Cadastrar Produto -\n");
                    System.out.print("Escolha um nome para o produto: ");
                    String novoProduto = ler.nextLine();
                    produtos.add(novoProduto);
                    System.out.println("Produto cadastrado: " + novoProduto);
                    break;
                case 4:
                    System.out.println("\n- Excluir produto -\n");
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto foi cadastrado no momento.");
                        break;
                    }
                    System.out.println("Produtos:");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println((i + 1) + " - " + produtos.get(i));
                    }
                    System.out.print("Qual produto você deseja excluir? ");
                    int listaProdutos = ler.nextInt() - 1;
                    ler.nextLine();
                    if (listaProdutos >= 0 && listaProdutos < produtos.size()) {
                        produtos.remove(listaProdutos);
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Número inválido...");
                    }
                    break;
                case 5:
                    System.out.println("\nEncerrando o programa... Até mais!");
                    break;
                default:
                    System.out.println("\nOpção inválida... Tente novamente!");
            }

        }
    }
}