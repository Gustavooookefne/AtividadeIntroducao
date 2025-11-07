package org.example.View;

import org.example.Service.UsuarioService;

import java.util.Scanner;

public class UsuarioView {
    private UsuarioService usuarioService;
    private Scanner sc;

    public UsuarioView(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
        this.sc = new Scanner(System.in);
    }

    public void RegistrarEmprestimo(){
        try{
            System.out.println("--------- Registro Emprestimo ---------");

            System.out.println("");

        }
    }

}
