package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner cuenta =new Scanner(System.in);

    System.out.println("Ingrese  el   valor   de  la  cuenta  + IVA: ");
    double  valorCuenta=  cuenta.nextDouble();

    System.out.println( "ingrese  el  procentaje de la  propina de la propina  entre  10%  y  15 %: ");

    int porcentajePropina = cuenta.nextInt();

        double valorPropina = porcentajePropina ;
                valorPropina /=100;
                valorPropina *= valorCuenta;
        double  valorTotal = (valorCuenta + valorPropina);

        cuenta.close();
        System.out.println("Valor de la cuenta:  $" + valorCuenta);
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Valor de la propina:  $" + valorPropina );
        System.out.println("Valor total a pagar:  $" +valorTotal);
    }
}