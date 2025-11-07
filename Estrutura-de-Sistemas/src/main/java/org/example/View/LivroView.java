package org.example.View;

import org.example.Model.Livro;
import org.example.Service.LivroService;

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
}
