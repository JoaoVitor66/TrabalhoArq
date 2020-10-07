package br.unifor.t200.model;

public class Produtos {

    private String nome;
    private String ID;
    private int quantidade;
    private double preco;

    public Produtos(String modelo, String ID, int quantidade, double preco ){
        this.nome = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.ID = ID;
    }

    public String getModelo() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
