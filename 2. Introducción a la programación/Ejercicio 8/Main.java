/*
Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/

public class Main
{    
    public static void main(String[] args)
    {
        Persona datosPersona= new Persona();

        datosPersona.setEdad(18);
        datosPersona.setNombre("Francisco");
        datosPersona.setTelefono("666666666");

        System.out.println(datosPersona.getEdad());
        System.out.println(datosPersona.getNombre());
        System.out.println(datosPersona.getTelefono());
        
    }
}

class Persona
{
    private int edad;
    private String nombre;
    private String telefono;

    //Metiendo Datos en la clase
    void setEdad(int edad)
    {
        this.edad = edad;
    }

    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    //Sacando Datos de la Clase
    int getEdad()
    {
        return this.edad;
    }

    String getNombre()
    {
        return this.nombre;
    }

    String getTelefono()
    {
        return this.telefono;
    }
}
