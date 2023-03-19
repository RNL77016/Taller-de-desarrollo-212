import java.util.Scanner;

public class Ejercicio4_Arreglo{
    public static void main (String args[]){
        
        //Scanner y arreglos
        Scanner entrada=new Scanner(System.in);
        double [][] calificaciones=new double [5][3];
        double [] promedios=new double[5];

        //Declaracion de Variables
        double sumatoria=0;

        //Lectura de datos
        for (int r=0; r<5; r++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese la calificacione del parcial " + (c+1) + " del alumno numero " + (r+1));
                calificaciones [r][c]=entrada.nextDouble();
            }
        }

        //Sacar promedios de calificaciones
        for(int r=0; r<5; r++){
            sumatoria=0;
            for (int c=0; c<3; c++){
                sumatoria=sumatoria+calificaciones[r][c];
            }
            promedios[r]=sumatoria/3;
        }

        //Colocar promedios en arreglos y imprimirlos
        System.out.println("P1\tP2\tP3\tPROM");
        for(int r=0; r<5; r++){
            for (int c=0; c<3; c++){
                System.out.print(calificaciones[r][c] + "\t");
            }
            System.out.println(promedios[r]);
        }

        //Colocar los nombres de los alumnos en arreglos
        
    }
}