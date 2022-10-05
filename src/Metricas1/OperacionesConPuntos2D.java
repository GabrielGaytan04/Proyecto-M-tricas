/**
 *  Programa que permitirá realizar
 *  operaciones con puntos en la forma P = (x,y)
 *
 *  NOTA: DEBEN IMPLEMENTAR LOS MÉTODOS
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia, producto punto y
 *          su aplicación para obtener el área
 *
 *  @author Roberto Méndez Méndez
 *  Modificado por Pérez Gaytán Ángel Gabriel
 *  @version  22-Septiembre-22
 */


package Metricas1;

public class OperacionesConPuntos2D {
    public static double norma(Punto2D p) {
        double norma = metricaEuclidiana(new Punto2D(),p);
        return norma;
    }
    public static double metricaEuclidiana(Punto2D a, Punto2D b) {
        double distanciaAB= Math.sqrt(Math.pow(a.getX() - b.getX(),2)+ Math.pow(a.getY()- b.getY(),2));
        return distanciaAB;
    }
    public static double metricaTaxista(Punto2D a, Punto2D b) {
        double distanciaTAB= Math.abs(a.getX()-b.getX())+Math.abs((a.getY()-b.getY()));
        return distanciaTAB;
    }

    public static double dotProduct(Punto2D a, Punto2D b){
        double productoAB=((a.getX()*b.getX())+(a.getY()*b.getY()));
        return productoAB;
    }
    public static double Area(Punto2D a, Punto2D b, Punto2D c, Punto2D d){
    double areaAB= Math.abs((((a.getX()*b.getY()))-(a.getY()*b.getX()))+((b.getX()*c.getY())-(b.getY()*c.getX()))
            +((c.getX()*d.getY())-(c.getY()*d.getX()))+(((d.getX()*a.getY()))-(d.getY()*a.getX())))/2;
    return areaAB;
    }
    }
