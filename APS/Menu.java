package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Vitor on 18/05/2017.
 */
public class Menu {

    public int Menu() throws IOException

    {
        Scanner s1 = new Scanner(System.in);
        int i = 0;

        ListaConsulta LC1 = new ListaConsulta();

        int check = 0;

        do {
            System.out.println("-----------------------------------------");
            System.out.println("-----------------Main--------------------");
            System.out.println("1 - Cadastrar Médico");
            System.out.println("2 - Cadastrar Paciente");
            System.out.println("3 - Cadastrar Consulta");
            System.out.println("4 - Listar Consultas");
            System.out.println("5 - Buscar Consulta");
            System.out.println("6 - Encerrar");
            System.out.print("\n Digite a Opção: ");
            check = s1.nextInt();
            System.out.println("-----------------------------------------");


            switch (check) {
                case 1:
                    Medico M1 = new Medico();
                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;
                case 2:

                    Paciente P1 = new Paciente();
                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;

                case 3:
                    Consulta C1 = new Consulta();
                    LC1.AddConsulta(C1);

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();


                    break;
                case 4:
                    LC1.imprimirConsultas();

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;

                case 5:
                    System.out.println("Digite o CPF do paciente: ");
                    int checar = s1.nextInt();

                    LC1.imprimirConsultas(checar);

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;

                case 6:
                    i = 1;
                    break;

                default:
                    System.out.println("Esta não é uma opção válida!");
                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();

            }


        } while (check != 6);
        return i;
    }
}
