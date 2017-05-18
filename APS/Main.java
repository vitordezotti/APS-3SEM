package com.company;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws IOException, InputMismatchException {
        int i = 0;

        Menu A = new Menu();

        do {
            try {
                 i = A.Menu();
            } catch (InputMismatchException E) {
                System.out.println("Digite um Valor valido!");
                System.out.println("Pressione Enter para continuar.");
                System.in.read();

            }
        } while (i == 0);


    }


}

