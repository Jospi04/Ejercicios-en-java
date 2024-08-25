
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class Ejercicio001 {
    public static void main(String[] args) {
        System.out.println("==Ejercicio01");
        
        //String nombre = "Joseph";                           //Sin Scanner
        //System.out.println("Tu nombre es : " +nombre);
        
        Scanner sc = new Scanner(System.in);           //Solo se le llama una vez
        
        System.out.print("ingrese tu nombre : ");       //CON Scanner
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es : "+nombre);
        
        
        System.out.println("==Ejercicio02==");
        
       
        nombre = "Joseph";
        int edad = 20;
        System.out.println("Tu nombre es : " +nombre + " , Tu edad es : " +edad);
        
        System.out.println("==Ejercicio03==");
        int n1 = 10;
        int n2 = 5;
        int n3 = 5;
        int suma = n1 + n2 + n3;
        System.out.println("La suma de los numeros es : " +suma);
        
        System.out.println("==Ejercicio04==");
        int minutos = 1;
        int segundos = 60;
        int convertir = (minutos*segundos); //120
        System.out.println("El resultado es: " +convertir);
        
        System.out.println("==Ejercicio05==");
        int n_1 = 2;
        int n_2 = 2;
        int n_3 = 2;
        int n_4 = 2;
        int n_5 = 2;
        int mult = n_1 * n_2 * n_3 * n_4 * n_5;
        System.out.println("La multiplicacion de los numeros es : " +mult);
        
        System.out.println("==EJERCICIO 06");
  
        int sol = 2;
        double dolar = 3.72;
        double cambio = (sol*dolar);
        System.out.println("El cambio seria de soles a dolar : " +cambio);
        
        System.out.println("==EJERCICIO 07");
  
        int naci = 2004;
        int anioActual = 2024;
        int res = (anioActual-naci);
        System.out.println("Tu edad es : " +res);
        
        System.out.println("==EJERCICIO 08");
  
        int edjuan = 2004;
        int edpedro = 2000;
        int dif = (edjuan-edpedro);
        System.out.println("La diferencia de edades es : " +dif + " años");
        
    }
}
