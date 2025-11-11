package org.example.Service;

import org.example.Model.Emprestimo;
import org.example.Model.Livro;
import org.example.Repository.EmprestimoRepository;
import org.example.Repository.LivroRepository;

import java.sql.SQLException;
import java.time.LocalDate;

public class EmprestimoService {

    private static LivroRepository livroRepository;
    private static EmprestimoRepository emprestimoRepository;

    public EmprestimoService(LivroRepository lr, EmprestimoRepository er) {
        this.livroRepository = lr;
        this.emprestimoRepository = er;
    }

    public EmprestimoService() {

    }

    public static void registrarNovoEmprestimo(int livroId, int usuarioId) throws Exception {

        Livro livro = livroRepository.consultarPorId(livroId);

        if (livro == null) {
            throw new Exception("Livro não encontrado.");
        }

        if (!livro.isDisponivel()) {
            throw new Exception("Livro não está disponível no momento.");
        }

        livroRepository.atualizarStatus(livroId, false);

        LocalDate dataHoje = LocalDate.now();
        emprestimoRepository.registrarEmprestimo(livroId, usuarioId, dataHoje);
    }

    public static void registrarDevolucao(int emprestimoId, String dataDevolucao) throws Exception {

        int livroId = EmprestimoRepository.buscarLivroIdDoEmprestimo(emprestimoId);

        if (livroId == 0) {
            throw new Exception("Empréstimo não encontrado.");
        }
        EmprestimoRepository.registrarDevolucao(emprestimoId, dataDevolucao);
        LivroRepository.atualizarStatus(livroId, true);
    }
}


