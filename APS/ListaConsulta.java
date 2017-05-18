package com.company;

/**
 * Created by Vitor on 18/05/2017.
 */

import java.util.ArrayList;

public class ListaConsulta {

    private ArrayList<Consulta> Lista;


    public ListaConsulta() {
        Lista = new ArrayList<>();
    }

    public void AddConsulta(Consulta C) {
        Lista.add(C);
    }

    public void imprimirConsultas() {
        for (Consulta C : Lista) {
            System.out.println("-----------------------------------------" +
                    "\n- Data: " + C.getDia() + "/" + C.getMes() + "/" + C.getAno() +
                    "\n- Nome do Médico: " + C.getNomeMed() +
                    "\n- CRM: " + C.getCrm() +
                    "\n- Nome do Paciente: " + C.getNomePac() +
                    "\n- CPF: " + C.getCpf() +
                    "\n- Diagnostico: " + C.getDiagnostico() +
                    "\n- Receita: " + C.getReceita());

        }

    }

    public void imprimirConsultas(int cpf) {
        for (Consulta C : Lista) {
            if (C.getCpf() == cpf)
                System.out.println("\n- Data: " + C.getDia() + "/" + C.getMes() + "/" + C.getAno() +
                        "\n- Nome do Médico: " + C.getNomeMed() +
                        "\n- CRM: " + C.getCrm() +
                        "\n- Nome do Paciente: " + C.getNomePac() +
                        "\n- Sexo: " + C.getSexo() +
                        "\n- CPF: " + C.getCpf() +
                        "\n- Diagnostico: " + C.getDiagnostico() +
                        "\n- Receita: " + C.getReceita());

        }

    }

}
