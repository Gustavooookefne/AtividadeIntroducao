package org.example.Model;

public class Emprestimos {
    private int id;
    LivroModel livroModel;
    UsuarioModel usuarioModel;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimos(int id, LivroModel livroModel, UsuarioModel usuarioModel, String dataEmprestimo, String dataDevolucao) {
        this.id = id;
        this.livroModel = livroModel;
        this.usuarioModel = usuarioModel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimos(LivroModel livroModel, UsuarioModel usuarioModel, String dataEmprestimo, String dataDevolucao) {
        this.livroModel = livroModel;
        this.usuarioModel = usuarioModel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LivroModel getLivroModel() {
        return livroModel;
    }

    public void setLivroModel(LivroModel livroModel) {
        this.livroModel = livroModel;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
