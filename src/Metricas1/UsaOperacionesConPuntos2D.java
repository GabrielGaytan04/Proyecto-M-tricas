/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;

import javax.swing.*;
import java.awt.*;

public class UsaOperacionesConPuntos2D {

    public static void main(String[]args){
        Punto2D a = new Punto2D(4,10);
        Punto2D b = new Punto2D(9,7);
        Punto2D c = new Punto2D(11,2);
        Punto2D d = new Punto2D(2,2);
        double norma = OperacionesConPuntos2D.norma(a);
        double dAB = OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double dtAB = OperacionesConPuntos2D.metricaTaxista(a,b);
        double pAB = OperacionesConPuntos2D.dotProduct(a,b);
        double aAB = OperacionesConPuntos2D.Area(a,b,c,d);
        System.out.println("La norma de " + a + " es : " + norma);
        System.out.println("La distancia del punto "+ a +
                "al punto"+ b+ "es:"  + dAB);
        System.out.println("La distancia de caracter taxista del punto" + a + "al punto" + b + "es: " +dtAB);
        System.out.println("El producto entre el punto: "+ a + "con el punto" + b + "es:" +pAB);
        System.out.println("EL área de la figura es igual: \n"+aAB);
        JOptionPane.showMessageDialog(null, "La norma de " + a + " es : \n" + norma);
        JOptionPane.showMessageDialog(null,"La distancia del punto "+ a +
                "al punto" + b+ " es: \n"  + dAB);
        JOptionPane.showMessageDialog(null,"La distancia de caracter taxista del punto " + a + " al punto" + b + " es: \n" +dtAB);
        JOptionPane.showMessageDialog(null,"El producto entre el punto: "+ a + " con el punto " + b + " es: \n" +pAB );
        JOptionPane.showMessageDialog(null,"EL área de la figura es igual: \n"+aAB);
    }
}
