package org.example.Repository;

import org.example.Infrestrutura.Conexao;
import org.example.Model.Emprestimo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
