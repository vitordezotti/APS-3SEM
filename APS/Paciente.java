package com.company;

/**
 * Created by Vitor on 18/05/2017.
 */

import java.util.Scanner;

public class Paciente extends Usuario {
    private String Nome;
    private int Cpf;
    private int Idade;
    private String Sexo;

    public Paciente() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Digite o Nome do paciente: ");
        this.Nome = s1.nextLine();

        System.out.println("Digite o Cpf do paciente: ");
        this.Cpf = s1.nextInt();

        System.out.println("Digite o sexo do paciente: ");
        this.Sexo = s1.next();

        System.out.println("Digite a Idade do paciente: ");
        this.Idade = s1.nextInt();
    }

    //-------------------------------

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public int getCpf() {
        return Cpf;
    }

    public String getSexo() {
        return Sexo;
    }

    //-------------------------------

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void setCpf(int cpf) {
        Cpf = cpf;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    //--------------------------------

    public String toString() {
        return "Paciente: " + Nome + "\n CPF: " + Cpf + "\n Sexo: " + Sexo + "\n Idade: " + Idade ;
    }



}