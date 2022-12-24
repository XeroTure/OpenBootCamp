package com_example;
/*
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 * Crea un proyecto de Java desde 0
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
public class Main
{
    public static void main(String[] args)
    {
        //Numericos
        //Enteros
        byte varNum1= 2;
        short varNum2= 50;
        int varNum3= 100;
        long varNum4= 3000000;

        //Decimales
        float varNumDec1= 10.50f;
        double varNumDec2= 50.10d;

        //Booleanos
        boolean varBoo1= true;
        boolean varBoo2= false;

        //Cadenas
        char varCa1= 'A';
        String varCa2= "Esto es una cadena";

        //Impresion de las Variables
        System.out.print("Las variables numericas son: " + varNum1 + ", " + varNum2 + ", " +varNum3 + ", ");
        System.out.println(varNum4 + ", " + varNumDec1 + ", " + varNumDec2 + " .");
        System.out.println("Las variables booleanas son: " + varBoo1 + ", " + varBoo2 + " .");
        System.out.println("Las variables de cadenas son: " + varCa1 + ", " + varCa2 + " .");
    }
}
