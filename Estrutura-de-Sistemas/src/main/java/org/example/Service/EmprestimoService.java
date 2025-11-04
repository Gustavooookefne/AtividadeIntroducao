package org.example.Service;

import org.example.Model.Emprestimo;
import org.example.Repository.EmprestimoRepository;

import java.sql.SQLException;

public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository = new EmprestimoRepository();

    public void CricarEmprestimo(Emprestimo emprestimo){
        try{
            EmprestimoRepository.inserirEmprestimo(emprestimo);
        }catch (SQLException e){
            System.out.println("Falha ao Criar Emprestimo!!");
            e.printStackTrace();
        }
    }

}
