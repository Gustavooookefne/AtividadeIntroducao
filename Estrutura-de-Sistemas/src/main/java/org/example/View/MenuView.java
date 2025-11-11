package org.example.View;

import org.example.Repository.LivroRepository;
import org.example.Service.EmprestimoService;
import org.example.Service.LivroService;
import org.example.Service.UsuarioService;

import java.util.Scanner;

public class MenuView {
    Scanner sc = new Scanner(System.in);


    LivroService livroService = new LivroService();
    LivroService livroServiceListagem = new LivroService();
    UsuarioService usuarioService = new UsuarioService();
    EmprestimoService emprestimoService = new EmprestimoService();



    LivroView livroView = new LivroView(livroService);
    LivroView livroViewListagem = new LivroView(livroServiceListagem);
    UsuarioView usuarioView = new UsuarioView(usuarioService);

    public void exibirMenu(){
        int opcao;

        do{
            System.out.println("--------- Sistema da Biblioteca ---------\n");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Consultar todos os livros cadastrados");
            System.out.println("3 - Registrar Emprestimo de Livro");
            System.out.println("4 - Registrar Devolução de Livro");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:{
                    livroView.CadastrarLivro();
                    break;
                }

                case 2:{
                    livroServiceListagem.consultarTodosLivros();
                    break;
                }

                case 3:{
                    usuarioView.RegistrarEmprestimo();
                    break;
                }

                case 4:{
                    // Registrar devocução
                    break;
                }

                case 5:{
                    System.out.println("Saindo do Sistema da Biblioteca...");
                    break;
                }

                default:
                    System.out.println("Opção Invalida. Tente Novamente!");
                    break;
            }

        }while (opcao != 0);
    }
}
