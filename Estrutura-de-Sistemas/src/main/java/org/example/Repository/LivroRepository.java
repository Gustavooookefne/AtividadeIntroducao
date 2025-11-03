package org.example.Repository;

import org.example.Infrestrutura.Conexao;
import org.example.Model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroRepository {
    public static void inserirLivro(Livro livro)throws SQLException{
        String query = """
                INSERT INTO livros
                (titulo ,autor ,ano ,disponivel)
                VALUES (?,?,?,?)
                """;
        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1,livro.getTitulo());
            stmt.setString(2,livro.getAutor());
            stmt.setString(3,livro.getAno());
            stmt.setBoolean(4,livro.isDisponivel());
            stmt.executeUpdate();
        }
    }
}
