package com.dio.moduloIII.desafiosInicias;

import java.util.Scanner;

public class Desafio01Multiplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, PROD;

        A = scan.nextInt();
        B = scan.nextInt();

        PROD = A*B;

        System.out.println("PROD = " + PROD);
    }
}
