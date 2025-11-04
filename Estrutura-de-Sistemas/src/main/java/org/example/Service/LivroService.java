package org.example.Service;

import org.example.Model.Livro;
import org.example.Repository.LivroRepository;

import java.sql.SQLException;

public class LivroService {

    private final LivroRepository livroRepository = new LivroRepository();

    public void cadastrarLivro(Livro livro){
        try{
            LivroRepository.inserirLivro(livro);
        } catch (SQLException e) {
            System.out.println("Falha ao cadastrar Livro!!");
            e.printStackTrace();
        }
    }
}
