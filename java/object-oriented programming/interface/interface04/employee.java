package com.mycompany.mavenproject4;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimemto;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimemto, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimemto = dataNascimemto;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimemto() {
        return dataNascimemto;
    }

    public void setDataNascimemto(String dataNascimemto) {
        this.dataNascimemto = dataNascimemto;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double getSalarioFinal();
    
    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nData de Nascimemto: " + dataNascimemto + 
               "\nSexo: " + sexo.getTexto() + 
               "\nSetor: " + setor.getNome() + 
               "\nSalário Base: " + salarioBase +
               "\nSalário Final: " + getSalarioFinal();
    }
}
