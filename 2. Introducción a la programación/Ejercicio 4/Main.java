/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, 
o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile 
sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe 
ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su 
condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor 
cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las 
cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar 
un mensaje por consola informando de la estación en la que está
*/

public class Main
{    
    public static void main(String[] args)
    {
        //Vinculacion Clases
        Estructura_If EsIf = new Estructura_If();
        Bucle_While BuWh = new Bucle_While();
        Bucle_DWhile BuDW = new Bucle_DWhile();
        Bucle_For BuFo = new Bucle_For();
        Estructura_Switch EsSw = new Estructura_Switch();

        //Llamada Funciones
        EsIf.compararVariables();
        BuWh.sumaBucleW();
        BuDW.sumaBucleDW();
        BuFo.sumaBucleF();
        EsSw.Menu();
    }
}

class Estructura_If
{
    public void compararVariables()
    {
        int numeroIf=0;

        if(numeroIf>0)
        {
            System.out.println("El Numero es Positivo");
        }
        else if(numeroIf<0)
        {
            System.out.println("El Numero es Negativo");
        }
        else
        {
            System.out.println("El Numero no es ni postivo ni negativo, es 0");
        }
    }
}

class Bucle_While
{
    public void sumaBucleW()
    {
        int numeroWhile=0;

        while(numeroWhile<3)
        {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }
}

class Bucle_DWhile
{
    public void sumaBucleDW()
    {
        int numeroDWhile=2;

        do
        {
            numeroDWhile++;
            System.out.println(numeroDWhile);
        }
        while(numeroDWhile<3);
    }
}

class Bucle_For
{
    public void sumaBucleF()
    {
        int numeroFor=0;

        for(int x=0; x<=3; x++)
        {
            numeroFor++;
            System.out.println(numeroFor);
        }
    }
}

class Estructura_Switch
{
    public void Menu()
    {
        String estacion="Otoño";

        switch (estacion) 
        {
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;

            case "Verano":
                System.out.println("La estacion es Verano");
                break;

            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;

            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
        
            default:
                System.out.println("No es ninguna estacion conocida, aun.");
                break;
        }
    }
}
