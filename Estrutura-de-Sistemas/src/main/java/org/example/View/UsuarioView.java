package org.example.View;

import org.example.Model.Emprestimo;
import org.example.Model.Livro;
import org.example.Service.EmprestimoService;
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

            System.out.println("Coloque o id do livro: ");
            int idLivro = sc.nextInt();

            System.out.println("Coloque o nome do Cliente: ");
            String nomeCliente = sc.next();

            System.out.println("Coloque o email do Cliente: ");
            String emailCliente = sc.next();

            System.out.println("Coloque a data de emprestimo do livro: ");
            String dataEmprestimo = sc.next();

            System.out.println("Coloque a data de devolução do livro: ");
            String dataDevocucao = sc.next();

           EmprestimoService.registrarNovoEmprestimo(idLivro, idLivro);

        }catch (Exception e){
            System.out.println("Falha ao registrar emprestimo");
        }
    }

}
