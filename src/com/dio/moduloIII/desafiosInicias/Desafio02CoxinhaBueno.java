package com.dio.moduloIII.desafiosInicias;

import java.util.Scanner;

public class Desafio02CoxinhaBueno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] inputSplit = input.split(" "); //gera um array de strings
        //System.out.println(Double.parseDouble(inputSplit[0]));
        double media = Double.parseDouble(inputSplit[0])/Double.parseDouble(inputSplit[1]);
        System.out.printf("%.2f", media);


    }
}
