
package ejercicio;

import java.util.Date;
import java.util.Scanner;


public class Actividades {
    public static void main(String[] args) {
        System.out.println("==Ejercicio 01 SIN SCANER==");
        double celsius = 200;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("El resultado de C° A F es: " +fahrenheit);
       

        System.out.println("==Ejercicio 02 CON SCANNER==");
        
        Scanner jos = new Scanner(System.in); //inicializamos el objeto
        Date fecha = new Date ();
        System.out.print("Ingrese dato : ");
        double celsius02 = jos.nextDouble();
        double fahrenheit02 = (celsius02 * 9/5)+32;
        System.out.println("Scanner|El resultado de C° a F es: " +fahrenheit);
        System.out.println("La fecha y la hora es : " +fecha);
    }
}
