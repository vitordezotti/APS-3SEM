package com.company;

/**
 * Created by Vitor on 18/05/2017.
 */

import java.util.Scanner;

public class Medico extends Usuario {
    private String Nome;
    private int Crm;
    private String Especialidade;
    private int Idade;

    public Medico() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Digite o Nome do médico: ");
        this.Nome = s1.nextLine();

        System.out.println("Digite o Crm do médico: ");
        this.Crm = s1.nextInt();

        System.out.println("Digite a Especialidade do médico: ");
        this.Especialidade = s1.next();

        System.out.println("Digite a Idade do médico: ");
        this.Idade = s1.nextInt();

    }

    //-------------------------------
    public int getCrm() {
        return Crm;
    }

    public void setCrm(int crm) {
        Crm = crm;
    }

//-------------------------------

    public String getEspecialidade() {
        return Especialidade;
    }


    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

//-------------------------------

    public int getIdade() {
        return Idade;
    }


    public void setIdade(int idade) {
        Idade = idade;
    }

//-------------------------------

    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        Nome = nome;
    }

//-------------------------------

}