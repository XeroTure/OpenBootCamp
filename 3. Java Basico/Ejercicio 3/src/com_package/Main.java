package com_package;
/*
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 * String[] nombres = {"", "", "", ""}
 */
public class Main
{
    public static void main(String[] args)
    {
        //Creacion de Variables
        String[] textos = {"Esta cadena", "esta separada", "pero se mostrara unida"};
        
        //Llamada de Funcion
        concatenar(textos);
    }

    static void concatenar(String[] textos)
    {
        for (String texto : textos)
        {
            System.out.print(texto+" ");
        }
    }
}
