package com_package;
/*
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class Main
{
    public static void main(String[] args)
    {
        //Creacion de Variables
        int preciosinIVA=200;

        //LLamada de la funcion e Impresion del resultado
        System.out.println("Precio sin IVA: " + preciosinIVA + "\nPrecio con IVA: " + calcularIVA(preciosinIVA));
    }

    static int calcularIVA(int precio)
    {
        float IVA= 1.21f;
        precio *= IVA;
        return precio;
    }
}
