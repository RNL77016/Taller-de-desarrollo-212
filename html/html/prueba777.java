import java.util.Scanner;

public class Ejercicio4_Arreglo{
   
    public static void main (String args[]){
        
        //Scanner y arreglos
        Scanner entrada=new Scanner(System.in);
        double [][] calificaciones=new double [5][3];
        double [] promedios=new double[5];
        String [] nombres=new String[5];

        //Declaracion de Variables
        double sumatoria=0;

        //Lectura de datos
        for (int r=0; r<calificaciones.length; r++){
            System.out.println("Ingrese el nombre de el alumno numero " + (r+1));
            nombres[r]=entrada.next();
            for (int c=0; c<calificaciones[0].length; c++){
                System.out.println("Ingrese la calificacion del parcial " + (c+1) + " de " + nombres[r]);
                calificaciones [r][c]=entrada.nextDouble();
            }
        }

        //Sacar promedios de calificaciones
        for(int r=0; r<calificaciones.length; r++){
            sumatoria=0;
            for (int c=0; c<calificaciones[0].length; c++){
                sumatoria=sumatoria+calificaciones[r][c];
            }
            promedios[r]=sumatoria/3;
        }

        //Colocar promedios en arreglos y imprimirlos
        System.out.println("NOMBRE\tP1\tP2\tP3\tPROM");
        for(int r=0; r<calificaciones.length; r++){
            System.out.print(nombres[r]+ "\t");
            for (int c=0; c<calificaciones[0].length; c++){
                System.out.print(calificaciones[r][c] + "\t");
            }
            System.out.println(promedios[r]);
        }
    }

    public static void leerNombre(String[] nom){
        Scanner lector=new Scanner(System.in);
        for(int r=0;r<nom.length;r++){
            System.out.prinln("Introduce el nombre del alumno " + (r+1) + ":");
            nom[r]=lector.next();
        }
    }

    public static void leerCalificaciones(String[] nom, double[][] cal ){
        Scanner lector=new Scanner(System.in);
         for(int r=0;r<cal.length;r++){
            System.out.println("Introduce las calificaciones de " + nom[r]);
            for(int c=0;c<cal[0].length;c++){
                System.out.println("Introduce la calificación del parcial " + (c+1) +":");
                cal[r][c]=lector.nextDouble();
            }
        } //fin de lectura de datos
    }

    public static double[] calcularPromedios(double[][] calificaciones){
        double suma=0;
        double[] prom=new double[];
       for(int r=0;r<calificaciones.length;r++){
            suma=0;
            for(int c=0;c<calificaciones[0].length;c++){
                suma=suma+calificaciones[r][c];
            }

        }
        prom[r]=suma/3;
    }
}