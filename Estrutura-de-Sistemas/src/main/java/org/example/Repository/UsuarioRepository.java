package org.example.Repository;

import org.example.Infrestrutura.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioRepository {
    public static boolean devolverLivro (int idLivro)throws SQLException{
        String query = """
                UPDATE livro
                SET status = 0
                WHERE id = ? AND status = 1
                """;

        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1,idLivro);

            int rowsUpadated = stmt.executeUpdate();

            return rowsUpadated > 0;

        }

    }

    public static boolean registrarEmprestimo(int idEmprestimo)throws SQLException{
        String query = """
                UPDATE emprestimos
                SET status = 0
                WHERE id = ? AND status = 1
                """;

        try(Connection conn = Conexao.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1, idEmprestimo);

            int rowsUpadated = stmt.executeUpdate();

            return rowsUpadated > 0;
        }
    }

}
