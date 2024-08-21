package com.mycompany.mavenproject2;

public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String cpf, String rg, String dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa fisica: " +
               super.toString() +
               "\nCPF: " + cpf + 
               "\nRG: " + rg + 
               "\nData de nascimento: " + dataNascimento;
    }
}