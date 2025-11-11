package org.example.Repository;

import org.example.Infrestrutura.Conexao;
import org.example.Model.Emprestimo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class EmprestimoRepository {
    public static void inserirEmprestimo (Emprestimo emprestimo) throws SQLException{
        String query = """
                INSERT INTO emprestimo
                (livro, usuario ,dataEmprestimo ,dataDevolucao)
                VALUES (?,?,?,?)
                """;

        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1, emprestimo.getLivro().getId());
            stmt.setInt(2,emprestimo.getUsuario().getId());
            stmt.setString(3,emprestimo.getDataEmprestimo());
            stmt.setString(4,emprestimo.getDataDevolucao());

            stmt.executeUpdate();
        }
    }

    public static int buscarLivroIdDoEmprestimo(int emprestimoId) throws SQLException {
        String sql = "SELECT livro_id FROM emprestimos WHERE id = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, emprestimoId);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("livro_id"); // Retorna o ID do livro
                }
            }
        }
        return 0; // Se não achou
    }

    public static void registrarDevolucao(int emprestimoId, String data) throws SQLException {
        String sql = "UPDATE emprestimos SET data_devolucao = ? WHERE id = ?";

        try (Connection conn = Conexao.getConnection(); // Sua conexão
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, data);
            stmt.setInt(2, emprestimoId);
            stmt.executeUpdate();
        }
    }

    public void registrarEmprestimo(int livroId, int usuarioId, LocalDate dataHoje) {
    }

}
