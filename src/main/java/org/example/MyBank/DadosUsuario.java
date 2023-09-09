package org.example.MyBank;

public class DadosUsuario {
    private String nome;
    private String tipoConta;
    private double saldoInicial;

    public String getTipoConta() {
        return tipoConta;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldoInicial(){
        return saldoInicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

}
