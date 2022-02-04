/*
Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
MODULO = N°eslora * 10

En los barcos de tipo especial. El módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco.
*En los veleros se suma el número de mástiles
*Los barcos a motor se le suma la potencia en CV 
*Los yates se suma la potencia en CV y el número de camarotes.
 */
package Clases_HIjas;

import Clase_Padre.Barco;
import java.util.Scanner;


public class Velero extends Barco {
    Scanner leer = new Scanner(System.in);
    private int mastiles;

    public Velero(int mastiles, int matricula, int eslora, int año_de_fabricacion) {
        super(matricula, eslora, año_de_fabricacion);
        this.mastiles = mastiles;
    }

    
    
    
    public Velero() {
    }
    
    
    @Override
    public void registro(){
        super.registro();
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        System.out.println("Ingrese la cantidad de mastiles: ");
        this.mastiles=leer.nextInt();
        
        
        MODULO=MODULO+this.mastiles;
        
        precioFinal=MODULO*diferencia_de_fechas;
        
        System.out.println(super.toString());
        
        
        
    }
    
    @Override
    public void alquilarBarco(){
        super.registro();
        super.crearBarco();
        
        calcularPrecio();
        
        
        
        
    }

    
}
