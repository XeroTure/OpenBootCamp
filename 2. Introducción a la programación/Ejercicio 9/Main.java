/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito 
solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga 
la clase Trabajador.
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
