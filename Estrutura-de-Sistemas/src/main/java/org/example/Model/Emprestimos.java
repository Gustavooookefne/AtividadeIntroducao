package org.example.Model;

public class Emprestimos {
    private int id;
    Livro livro;
    Usuario usuarioModel;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimos(int id, Livro livro, Usuario usuarioModel, String dataEmprestimo, String dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.usuarioModel = usuarioModel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimos(Livro livro, Usuario usuarioModel, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
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

    public Livro getLivroModel() {
        return livro;
    }

    public void setLivroModel(Livro livroModel) {
        this.livro = livroModel;
    }

    public Usuario getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(Usuario usuarioModel) {
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
