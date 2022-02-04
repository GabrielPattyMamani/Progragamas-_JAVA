/*
En un puerto se alquilan amarres para barcos de distinto tipo.
Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros(que tan largo es el barco) y año de
fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:

• Número de mástiles para veleros.
• Potencia en CV(caballos de fuerza) para barcos a motor.
• Potencia en CV(caballos de fuerza) y número de camarotes(habitaciones para pasajeros) para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
MODULO = N°eslora * 10

En los barcos de tipo especial. El módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco.
*En los veleros se suma el número de mástiles
*Los barcos a motor se le suma la potencia en CV 
*Los yates se suma la potencia en CV y el número de camarotes.


Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario "elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler".
 */
package Clase_Padre;

import java.util.Scanner;

public class Barco {

    Scanner leer = new Scanner(System.in);
    
//---ATRIBUTOS DEL CONSTRUCTOR, TAL CONSTRUCTOR SERA HEREDADO POR SUS CLASES HIJAS---//
    protected int matricula;
    protected int eslora;
    protected int año_de_fabricacion;
    
//-------------------------------------------------------------------------------------//


    protected String nombre_y_apellido;
    protected int diferencia_de_fechas;
    protected int fecha_inicial;
    protected int fecha_final;
    
    
    protected int MODULO;
    protected int precioFinal;
    
    
    public Barco(int matricula, int eslora, int año_de_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año_de_fabricacion = año_de_fabricacion;
    }
    
    public Barco() {

    }
    

    public void registro() {
        
        System.out.println("Ingrese su nombre y apellido");
        this.nombre_y_apellido=leer.next();
        
        System.out.println("\n---A CONTINUACION INDIQUE LOS DIAS A ALQUILAR SU BARCO---\n");
        System.out.println("Ingrese dia inicial: ");
        this.fecha_inicial = leer.nextInt();
        System.out.println("Ingrese dia final: ");
        this.fecha_final = leer.nextInt();

        this.diferencia_de_fechas = this.fecha_final - this.fecha_inicial;

    }

    public void crearBarco() {

        System.out.println("Ingrese la matricula");
        this.matricula = leer.nextInt();
        System.out.println("Ingrese la medida del barco (cuantos esloras): ");
        this.eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricacion: ");
        this.año_de_fabricacion = leer.nextInt();

        this.MODULO = this.eslora * 10;
    }

    public void calcularPrecio() {

    }
    
    public void alquilarBarco(){
        
    }

    @Override
    public String toString() {
        return "DATOS:\n"
                + "Cliente: " + nombre_y_apellido + "\nDias alquilados: " + diferencia_de_fechas + "\nDATOS DEL BARCO ALQUILADO\nAño de fabricacion: " + año_de_fabricacion + "\nN° de matricula: "+matricula+ "\nPrecio final: "+ precioFinal+"$";
    }
    
    

}
