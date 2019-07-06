/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularedad;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CalcularEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GregorianCalendar cal = new GregorianCalendar();
        Scanner lector = new Scanner(System.in);
        int mesActual = cal.get(Calendar.MONTH)  ;
        int anioActual = cal.get(Calendar.YEAR);
        int diaActual= cal.get(Calendar.DAY_OF_MONTH) ;
        int mes;
        int dia;
        int anio;
        int mesResultado;
        int diaResultado;
        int anioResultado;
        System.out.println("Calucular cuantos años tiene.");
        System.out.println("Ingrese su día de nacimiento ");
        dia = lector.nextInt();
        
        System.out.println("Ingrese su mes de nacimiento ");
        mes = lector.nextInt();
        
        System.out.println("Ingrese su año de nacimiento ");
        anio = lector.nextInt();
        diaResultado= diaActual ;
        mesResultado= Math.abs(mes - mesActual);
        anioResultado= Math.abs(anio - anioActual);
        
        System.out.println("Usted tine "+ anioResultado+ " años "+", "+
                mesResultado+ " meses "+" y "+diaResultado+ " dias.");
    }
    
}





