package org.example.Service;

import org.example.Model.Usuario;
import org.example.Repository.UsuarioRepository;

import java.sql.SQLException;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository = new UsuarioRepository();

    public void RegistrarEmprstimo(Usuario usuario){
        try{
            UsuarioRepository.registrarEmprestimo(usuario.getId());
        }catch (SQLException e){
            System.out.println("Falaha ao Registar Emprestimo!!");
            e.printStackTrace();
        }
    }
}
