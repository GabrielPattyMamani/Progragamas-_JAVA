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

package ejercicio.n.pkg1;

import Clase_Padre.Barco;
import Clases_HIjas.Barco_Motor;
import Clases_HIjas.Velero;
import Clases_HIjas.Yate;
import java.util.Scanner;



public class EjercicioN1 {
    
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Barco inicio = new Barco();
        
        
        Velero velero = new Velero();
        Barco_Motor  motor = new Barco_Motor();
        Yate yate = new Yate();
        
        System.out.println("-----BIENVENIDO AL ASISTENTE DE BARCOS-----");
        System.out.println("Eljia el tipo de barco que desea alquilar: ");
        System.out.println("1_Velero\n2_Barco a motor\n3_Yate");
        int eleccion = leer.nextInt();
        
        
    
        switch(eleccion){
            
            case 1:
                
                velero.alquilarBarco();
                
                break;
            case 2:
                motor.alquilarBarco();
                
                break;
            case 3:
                motor.alquilarBarco();
                break;
            
        }
        
        
    }
    
}
