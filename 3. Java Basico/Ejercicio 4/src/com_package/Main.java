package com_package;
/*
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main
{
    public static void main(String[] args)
    {
        SmartDevice dispInt= new SmartDevice();
        SmartPhone movil= new SmartPhone();
        SmartWatch reloj= new SmartWatch();

        SmartDevice portatil= new SmartDevice("OLED", 5000, true, "Tipo Micro");
        SmartPhone xiaomi= new SmartPhone("LCD", 7500, true, "Tipo C", "Jack");
        SmartWatch huawei= new SmartWatch("AMOLED", 4500, false, "Tipo USB-PD","Pulsaciones");

        System.out.println("Los atributos del portatil son: Pantalla- "+portatil.pantalla+", Bateria- "+portatil.bateria+", Sonido- "+portatil.sonido+", Puerto- "+portatil.puerto);
        System.out.println("Los atributos del Xiaomi son: Pantalla- "+xiaomi.pantalla+", Bateria- "+xiaomi.bateria+", Sonido- "+xiaomi.sonido+", Puerto- "+xiaomi.puerto+", Conexion/es Extra- "+xiaomi.conexionesExtra);
        System.out.println("Los atributos del portatil son: Pantalla- "+huawei.pantalla+", Bateria- "+huawei.bateria+", Sonido- "+huawei.sonido+", Puerto- "+huawei.puerto+", Mediciones- "+huawei.mediciones);
    }    
}

class SmartDevice
{
    //Atributos Comunes
    String pantalla;
    int bateria;
    boolean sonido;
    String puerto;

    public SmartDevice()
    {

    }

    public SmartDevice(String pantalla, int bateria, boolean sonido, String puerto)
    {
        this.pantalla= pantalla;
        this.bateria= bateria;
        this.sonido= sonido;
        this.puerto= puerto; 
    }
}

class SmartPhone extends SmartDevice
{
    //Atributos Especificos
    String conexionesExtra;

    public SmartPhone()
    {

    }

    public SmartPhone(String pantalla, int bateria, boolean sonido, String puerto, String conexionesExtra)
    {
        this.pantalla= pantalla;
        this.bateria= bateria;
        this.sonido= sonido;
        this.puerto= puerto; 
        this.conexionesExtra= conexionesExtra;     
    }
}   
    
class SmartWatch extends SmartDevice
{
    //Atributos Especificos
    String mediciones;

    public SmartWatch()
    {

    }

    public SmartWatch(String pantalla, int bateria, boolean sonido, String puerto, String mediciones)
    {
        this.pantalla= pantalla;
        this.bateria= bateria;
        this.sonido= sonido;
        this.puerto= puerto;
        this.mediciones= mediciones;      
    }
}
