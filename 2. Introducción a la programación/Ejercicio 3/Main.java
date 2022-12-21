/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.

Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
*/
public class Main
{    
    public static void main(String[] args)
    {
        //Primera Parte
        suma(10,20,30);

        //Segunda Parte
        Coche miCoche = new Coche();

        miCoche.sumaPuertas();

        System.out.println("EL total de puertas es: " + miCoche.numPuertas);

    }

    //Primera Parte
    public static void suma(int a, int b, int c) 
    {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
    
}

//Segunda Parte
class Coche
{
    public int numPuertas = 4;

    public void sumaPuertas()
    {
        this.numPuertas++;
    }
}
