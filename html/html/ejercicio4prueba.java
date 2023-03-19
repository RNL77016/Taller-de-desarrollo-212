import java.util.Scanner;

public class ejercicio4prueba{
  public static void main(String args []){
    Scanner entrada = new Scanner (System.in);
    double [][] calificaciones = new double [5][3];
    // double promedio=0;
    double[] promedios = new double[5];
    String[] nombres = new String[5];

    introducirNombres(nombres);

    //fin de lectura de datos
    introducirCalificaciones(calificaciones,nombres);

    calculos(calificaciones,promedios);

    
    System.out.println("Nombre\tP1\tP2\tP3\tProm");
    
    imprimir(nombres,calificaciones,promedios);

  }
  public static void introducirNombres(String[] nom){
    Scanner entrada = new Scanner (System.in);
    for(int r=0;r<nom.length;r++){
      System.out.println("Introduce el nombre del alumno " + (r+1) + ":");
      nom[r] = entrada.next();
    }
  }
  public static void introducirCalificaciones(double [][] calificaciones, String[] nombres){
    Scanner entrada = new Scanner (System.in);
    for(int r=0;r<calificaciones.length;r++){
      System.out.println("Introduce las calificaciones de " + nombres[r]);
      for(int c=0;c<calificaciones[0].length;c++){
        System.out.println("Introduce la calificacion del parcial" + (c+1) + ":");
        calificaciones[r][c] = entrada.nextDouble();

      }
    }
  }
  public static void calculos(double [][] calificaciones, double []  promedios){
    for(int r = 0; r<calificaciones.length;r++){
      double suma=0;
      for(int c=0;c<calificaciones[0].length;c++){
        suma += calificaciones[r][c];
      }
      promedios[r] = suma/3;
      // System.out.println("Promedio" + (r+1) + ": " + promedio);
    
    }
  }
  public static void imprimir(String[] nombres, double [][] calificaciones, double [] promedios){
    for(int r=0;r<calificaciones.length;r++){
      System.out.print("    " + nombres[r] + "   ");
      for(int c=0;c<calificaciones[0].length;c++){
        System.out.print( calificaciones[r][c]+ "\t" );
      }
      System.out.println(promedios[r]);
    }
  }
  
}