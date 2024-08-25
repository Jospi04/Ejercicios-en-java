
package ejercicio;

/**
 *
 * @author ALUMNO
 */
public class Tipos_de_datos {
    public static void main(String[] args) {
    //datos numericos
    byte edad = 25;
    short distancia =10000;
    int cantidad = 1000;
    long poblacion = 7896543210L;
    float precio = 49.99f;
    double pi = 3.141592653589793;
    
    //datos textuales 
    char genero = 'M';
    String nombre = "Juan";
    
    // Imprimir valores
    
        System.out.println("Edad : " +edad);
        System.out.println("Distancia : " +distancia);
        System.out.println("Cantidad : " +cantidad);
        System.out.println("Poblacion : " +poblacion);
        System.out.println("Precio : " +precio);
        System.out.println("Pi : " +pi);
        System.out.println("Genero : " +genero);
        System.out.println("Nombre : " +nombre);
        System.out.println("==========================================================");
    /* Si queremos convertir un STRING  a cualquier tipo de dato numerico*/
    String number01 = "100";
    byte ConversionByte = Byte.parseByte(number01); //100
    short ConversionShort = Short.parseShort(number01);
    int ConversionInt = Integer.parseInt(number01);
    long ConversionLong = Long.parseLong(number01);
    float ConversionFloat = Float.parseFloat(number01);
    double ConversionDouble = Double.parseDouble(number01);

        System.out.println("ConversionByte : "+ ConversionByte);
    int number02 = 100;
    
     /* Si queremos convertir un Int a cualquier tipo de dato String*/
    String conversionString01 = String.valueOf(number02);
    String conversionString92 = Integer.toString(number02);
    
    // Datos numericos
    
    int numeroEntero = 10;
    double numeroDouble = numeroEntero;
        System.out.println(numeroDouble);
    
    //Conversion Explicita de Double a Int
    
    double notaAlumno01 = 10.5;
    int notaAlumno02 =  (int) notaAlumno01;
        System.out.println(notaAlumno02);
        
    //Conversion de tipos de dato em java
}
}