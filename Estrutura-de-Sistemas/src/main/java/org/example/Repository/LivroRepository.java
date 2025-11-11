package org.example.Repository;

import org.example.Infrestrutura.Conexao;
import org.example.Model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    public static void inserirLivro(Livro livro) throws SQLException {
        String query = """
                INSERT INTO livros
                (titulo ,autor ,ano ,disponivel)
                VALUES (?,?,?,?)
                """;

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getAno());
            stmt.setBoolean(4, livro.isDisponivel());

            stmt.executeUpdate();
        }
    }

    public List<Livro> listarTodosLivros() throws SQLException {
        String query = "SELECT id, titulo, autor, ano, disponivel FROM livros";

        List<Livro> livros = new ArrayList<>();

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) { // executeQuery() está CORRETO para SELECT

            while (rs.next()) {
                Livro livro1 = new Livro();

                livro1.setId(rs.getInt("id"));
                livro1.setTitulo(rs.getString("titulo"));
                livro1.setAutor(rs.getString("autor"));
                livro1.setAno(rs.getString("ano")); // Corrigido para getInt (pois 'ano' é INT)
                livro1.setDisponivel(rs.getBoolean("disponivel"));

                livros.add(livro1);
            }
        }

        return livros;
    }

    public Livro consultarPorId(int livroId) {
        return null;
    }

    public void atualizarStatus(int livroId, boolean b) {
    }
}
