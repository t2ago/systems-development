package com.mycompany.mavenproject2;

public class PrestacaoServico extends Juridica{
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    @Override
    public String toString() {
        return "\nPrestador de Servico." + 
               super.toString() +
               "\nContrato Inicio: " + contratoInicio + 
               "\nContrato Fim: " + contratoFim;
    }

}