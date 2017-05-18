package com.company;

/**
 * Created by Vitor on 18/05/2017.
 */

import java.util.Scanner;

public class Consulta {
    private int Ano;
    private int Mes;
    private int Dia;
    private String NomeMed;
    private int Crm;
    private String NomePac;
    private int Cpf;
    private String Sexo;
    private String Especialidade;
    private String Diagnostico;
    private String Receita;

    Scanner s1 = new Scanner(System.in);

    public Consulta(String vazio) {

    }


    public Consulta() {

        System.out.println("Digite o Nome do médico: ");
        this.NomeMed = s1.nextLine();

        System.out.println("Digite o Crm do médico: ");
        this.Crm = s1.nextInt();

        System.out.println("Digite o Nome do paciente: ");
        this.NomePac = s1.next();

        System.out.println("Digite o Sexo do paciente: ");
        this.Sexo = s1.next();

        System.out.println("Digite o cpf do paciente: ");
        this.Cpf = s1.nextInt();

        System.out.println("Digite a Especialidade do médico: ");
        this.Especialidade = s1.next();

        System.out.println("Digite o dia da consulta: ");
        this.Dia = s1.nextInt();
        System.out.println("Digite o mes da consulta: ");
        this.Mes = s1.nextInt();
        System.out.println("Digite o ano da consulta: ");
        this.Ano = s1.nextInt();

        System.out.println("Diagnóstico: ");
        this.Diagnostico = s1.next();

        System.out.println("Digite a Receita: ");
        this.Receita = s1.next();

        System.out.println("Consulta registrada com sucesso!\n");

    }

    public int getAno() {
        return Ano;
    }

    public int getMes() {
        return Mes;
    }

    public int getDia() {
        return Dia;
    }

    public String getNomeMed() {
        return NomeMed;
    }

    public int getCrm() {
        return Crm;
    }

    public String getNomePac() {
        return NomePac;
    }

    public int getCpf() {
        return Cpf;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public String getReceita() {
        return Receita;
    }

    public String getSexo() {
        return Sexo;
    }

    //--------------------------

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public void setNomeMed(String NomeMed) {
        this.NomeMed = NomeMed;
    }

    public void setCrm(int Crm) {
        this.Crm = Crm;
    }

    public void setNomePac(String NomePac) {
        this.NomePac = NomePac;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public void setReceita(String Receita) {
        this.Receita = Receita;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    //-------------------------------------

    public void ChecarConsulta() {
        int checar;
        System.out.println("Digite o CPF do Paciente? ");
        checar = s1.nextInt();
        if (this.Cpf == checar)
            System.out.println(this);
        else
            System.out.println("Digite um cpf válido!");


    }


    @Override
    public String toString() {
        return "Consulta: " + "Data: " + Dia + "/" + Mes + "/" + Ano +
                "\nNome do médico: " + NomeMed +
                "\nCrm=" + Crm +
                "\nNomePac=" + NomePac +
                "\nCpf=" + Cpf +
                "\nEspecialidade=" + Especialidade + "\nDiagnostico=" + Diagnostico + "\nReceita=" + Receita +
                "-----------------------------------------";
    }


}