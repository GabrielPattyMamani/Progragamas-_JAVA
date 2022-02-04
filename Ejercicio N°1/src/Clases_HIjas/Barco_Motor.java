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
package Clases_HIjas;

import Clase_Padre.Barco;
import java.util.Scanner;

public class Barco_Motor extends Barco {
    
    private int CV;
    Scanner leer = new Scanner(System.in);

    public Barco_Motor(int CV, int matricula, int eslora, int año_de_fabricacion) {
        super(matricula, eslora, año_de_fabricacion);
        this.CV = CV;
    } 
    public Barco_Motor(){
        
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
    }
    
    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        
        System.out.println("Ingrese la cantidad de CV: ");
        this.CV=leer.nextInt();
        
        MODULO=MODULO+CV;
        System.out.println(MODULO);
        System.out.println(diferencia_de_fechas);
        
        precioFinal = MODULO * diferencia_de_fechas;
        
        System.out.println(super.toString());
        
    }
    
    @Override
    public void alquilarBarco(){
        super.registro();
        super.crearBarco();
        calcularPrecio();
        
        
        
    }
  
    
    
}
