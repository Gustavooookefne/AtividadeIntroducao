package org.example.View;

import org.example.Model.Livro;
import org.example.Service.EmprestimoService;
import org.example.Service.LivroService;

import java.util.List;
import java.util.Scanner;

public class LivroView {
    private LivroService livroService;
    private Scanner sc;

    public LivroView(LivroService livroService){
        this.livroService = livroService;
        this.sc = new Scanner(System.in);
    }

    public void CadastrarLivro(){
        try{
            System.out.println("--------- Sistema da Biblioteca ---------\n");

            System.out.println("Coloque o Titulo do Livro: ");
            String titulo = sc.next();

            System.out.println("Coloque o Autor do Livro: ");
            String autor = sc.next();

            System.out.println("Coloque o Ano que o Livro foi publicado: ");
            String ano = sc.next();

            System.out.println("O Livro Esta disponivel?: ");
            boolean disponivel = sc.nextBoolean();

            Livro livro = new Livro(0,titulo,autor,ano,disponivel);
            livroService.cadastrarLivro(livro);

        }catch (Exception e){
            System.out.println("Falha ao cadastrar Livro");
            e.printStackTrace();
        }
    }

    public void listarTodosLivros() {
        try {
            System.out.println("\n---------  Lista de Todos os Livros ---------");

            List<Livro> livros = livroService.consultarTodosLivros();


            if (livros.isEmpty()) {
                System.out.println("Nenhum livro cadastrado no sistema.");
            } else {
                // 3. Imprime o cabeçalho
                System.out.println("ID | TÍTULO | AUTOR | ANO | STATUS");
                System.out.println("-----------------------------------------------------");



                for (Livro livro : livros) {
                    String status = livro.isDisponivel() ? "Disponível" : "Emprestado";

                    System.out.println(
                            livro.getId() + " | " +
                                    livro.getTitulo() + " | " +
                                    livro.getAutor() + " | " +
                                    livro.getAno() + " | " +
                                    status
                    );
                }
            }
            System.out.println("-----------------------------------------------------\n");

        } catch (Exception e) {


            System.out.println("Falha ao listar Livros.");
            e.printStackTrace();
        }
    }

    public void registrarDevolucao() {
        try {
            System.out.println("--------- Devolução de Livro ---------");

            // 1. Pede o ID do Empréstimo
            System.out.println("Digite o ID do Empréstimo:");
            int emprestimoId = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            // 2. Pede a Data
            System.out.println("Digite a data da devolução (AAAA-MM-DD):");
            String dataDevolucao = sc.nextLine();

            // 3. Chama o Service
            EmprestimoService.registrarDevolucao(emprestimoId, dataDevolucao);

            System.out.println("\n Devolução registrada com sucesso!");

        } catch (Exception e) {
            System.err.println("\n Falha ao devolver: " + e.getMessage());
        }
    }
}

