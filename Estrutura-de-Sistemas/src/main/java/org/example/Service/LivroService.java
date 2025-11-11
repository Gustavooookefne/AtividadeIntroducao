package org.example.Service;

import org.example.Model.Livro;
import org.example.Repository.LivroRepository;

import java.sql.SQLException;
import java.util.List;

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

    public List<Livro> consultarTodosLivros() {
        return List.of();
    }
}
