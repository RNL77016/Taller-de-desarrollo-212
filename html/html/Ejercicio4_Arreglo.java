import java.util.Scanner;

public class Ejercicio4_Arreglo{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        double[][] calificaciones = new double[5][3];
        double[] promedios=new double[5];
        String[] nombres=new String[5];
        
        leerNombres(nombres);
        leerCalificaciones(nombres,calificaciones);
        promedios=calcularPromedios(calificaciones);
        imprimirResultados(nombres, calificaciones, promedios);
        
    }
    public static void leerNombres(String[] nom){
        Scanner lector = new Scanner(System.in);
        for(int r=0; r<nom.length; r++){
            System.out.println("Introduce el nombre del alumno " + (r+1) + ":");
            nom[r]=lector.next();
        }
    }//metodo para leer las calificaciones en un arreglo bidimensional
    public static void leerCalificaciones(String[] nom, double[][] cal){
        Scanner lector = new Scanner(System.in);
        for(int r=0; r<cal.length; r++){
            System.out.println("Introduce las calificaciones de " + nom[r]);
            for(int c=0; c<cal[0].length; c++){
                System.out.println("Introduce la calificacion del parcial: " + (c+1) + ":");
                cal[r][c]=lector.nextDouble();
            }
        } 
    } //fin de lectura de datos

    public static double[] calcularPromedios(double[][] calificaciones){
        double suma=0;
        double[] prom=new double[calificaciones.length];
        for(int r=0; r<calificaciones.length; r++){
            suma=0;
            for(int c=0; c<calificaciones[0].length; c++){
                suma=suma+calificaciones[r][c];
            }
            prom[r]=suma/3;
        } 
        return(prom);
    } //calcular promedio

    public static void imprimirResultados(String[] nombres, double[][] calificaciones, double[] promedio){
        System.out.println("Nombre\t\tP1\tP2\tP3\t\tProm");
        for(int r=0; r<calificaciones.length; r++){
            System.out.print(" " + nombres[r] + "   ");
            for(int c=0; c<calificaciones[0].length; c++){
                System.out.print(calificaciones[r][c] + "\t");
            }
            System.out.println("\t" + promedio[r]);
        } //fin de la impresion
    }
}