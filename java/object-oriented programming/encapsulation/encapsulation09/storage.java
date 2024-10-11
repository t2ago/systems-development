package com.mycompany.mavenproject2;

public class Armazenamento extends Produto {
    private String tipoConexao;

    public Armazenamento(String tipoConexao, String marca, String Modelo) {
        super(marca, Modelo);
        this.tipoConexao = tipoConexao;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
}
