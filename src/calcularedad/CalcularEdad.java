
package calcularedad;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CalcularEdad {

    
    public static void main(String[] args) {
        try{
        GregorianCalendar cal = new GregorianCalendar();
        Scanner lector = new Scanner(System.in);
        
        //Declaramos las variables
        int mesActual = cal.get(Calendar.MONTH), anioActual = cal.get(Calendar.YEAR), diaActual= cal.get(Calendar.DAY_OF_MONTH)  ;
        int mes, dia, anio, mesResultado, anioResultado,  diaResultado;
        
        // Se muestra un mensaje de información del programa
        System.out.println("Calucular cuantos años tiene.");
        // pedimos el dia de nacimiento
        System.out.println("Ingrese su día de nacimiento ");
        dia = lector.nextInt();
        // Pedimos el mes de nacimiento
        System.out.println("Ingrese su mes de nacimiento ");
        mes = lector.nextInt();
        // Pedimos el año de nacimiento
        System.out.println("Ingrese su año de nacimiento ");
        anio = lector.nextInt();
        
        if(dia < 0 | dia > 31){
            throw new Exception("El dia esta fuera de rango");
        }
        if(mes < 0 | mes > 12){
            throw new Exception("El mes esta fuera de rango");
        }
        if(anio < 0){
            throw new Exception("El año esta fuera de rango");
        }
        
        // Realizamos el calculo
        diaResultado= diaActual  ;
        mesResultado= Math.abs(mes - mesActual);
        anioResultado= Math.abs(anio - anioActual);
        
        System.out.println("Usted tine "+ anioResultado+ " años "+", "+
                mesResultado+ " meses "+" y "+diaResultado+ " dias.");
        }catch(Exception ex){
            System.out.println("Existe un error"+ ex.toString());
        }
    }
    
}









