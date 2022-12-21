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
        //Invocacion de las Clases
        Cliente datosCliente= new Cliente();
        Trabajador datosTrabajador= new Trabajador();

        //Envio Datos Cliente
        datosCliente.setEdad(18);
        datosCliente.setNombre("Francisco");
        datosCliente.setTelefono("666666666");
        datosCliente.setCredito(2050);
        //Envio Datos Trabajador
        datosTrabajador.setEdad(28);
        datosTrabajador.setNombre("Victoria");
        datosTrabajador.setTelefono("333333333");
        datosTrabajador.setSalario(3000);

        //Obtencion Datos Cliente
        System.out.println(datosCliente.getEdad());
        System.out.println(datosCliente.getNombre());
        System.out.println(datosCliente.getTelefono());
        System.out.println(datosCliente.getCredito());
        //Obtencion Datos Trabajador
        System.out.println(datosTrabajador.getEdad());
        System.out.println(datosTrabajador.getNombre());
        System.out.println(datosTrabajador.getTelefono());
        System.out.println(datosTrabajador.getSalario());       
    }
}

class Persona
{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona
{
    private int credito;

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

    void setCredito(int credito)
    {
        this.credito = credito;
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

    int getCredito()
    {
        return this.credito;
    }
}

class Trabajador extends Persona
{
    private int salario;

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

    void setSalario(int salario)
    {
        this.salario = salario;
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

    int getSalario()
    {
        return this.salario;
    }
}
