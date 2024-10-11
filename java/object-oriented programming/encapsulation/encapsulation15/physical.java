package com.mycompany.mavenproject2;

public abstract class Fisica extends Pessoa{
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String dataNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\nPessoa fisica: " + 
               super.toString() +
               "\nSexo: " + sexo.getTexto() + 
               "\nEstado Civil: " + estadoCivil.getTexto() + 
               "\nData de Nascimento: " + dataNascimento;
    }
}