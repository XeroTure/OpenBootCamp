package com_package;
/*
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
class SmartDevice
{
    //Atributos Comunes
    String pantalla;
    int bateria;
    String puerto;

    public SmartDevice()
    {

    }

    public SmartDevice(String pantalla, int bateria, String puerto)
    {
        this.pantalla= pantalla;
        this.bateria= bateria;
        this.puerto= puerto; 
    }

    public static class SmartPhone extends SmartDevice
    {
        //Atributos Especificos
        String conexionesExtra;

        public SmartPhone()
        {
            super();
        }

        public SmartPhone(String pantalla, int bateria, String puerto, String conexionesExtra)
        {
            super(pantalla, bateria, puerto);
            this.conexionesExtra= conexionesExtra;     
        }

        public String toString()
        {
            return "Pantalla-"+pantalla+", Bateria-"+bateria+" Puerto-"+puerto+" Conexion Extra-"+conexionesExtra;
        }
    }   
    
    public static class SmartWatch extends SmartDevice
    {
        //Atributos Especificos
        String mediciones;

        public SmartWatch()
        {
            super();
        }

        public SmartWatch(String pantalla, int bateria, String puerto, String mediciones)
        {
            super(pantalla, bateria, puerto);
            this.mediciones= mediciones;      
        }

        public String toString()
        {
            return "Pantalla-"+pantalla+", Bateria-"+bateria+" Puerto-"+puerto+" Mediciones-"+mediciones;
        }
    }

    public static void main(String[] args)
    {
        SmartPhone xiaomi= new SmartPhone("LCD", 7500, "Tipo C", "Jack");
        SmartWatch huawei= new SmartWatch("AMOLED", 4500, "Tipo USB-PD","Pulsaciones");

        System.out.println("Los atributos del Xiaomi son: "+xiaomi);
        System.out.println("Los atributos del Huawei son: Pantalla- "+huawei);
    }  
}
