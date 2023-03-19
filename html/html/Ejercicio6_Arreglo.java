import java.util.Scanner;

public class Ejercicio6_Arreglo{
    public static void main(String args[]){
        int n=3;
        String[] nombres=new String[n];
        double[][] recorridos=new double[n][6];
        double[] total= new double[n];
        leerNombre(nombres);
        leerRecorridos(nombres, recorridos);
        calcularTotal(recorridos, total);
        imprimir(nombres, recorridos, total);
    }

    public static void leerNombre(String[] nombres){
        Scanner entrada=new Scanner(System.in);
        for (int i=0; i<nombres.length; i++){
            System.out.println("Introduce el nombre del chofer " + (i+1));
            nombres[i]=entrada.next();
        }
    }//MéTODO PARA LEER LOS NOMBRES DE LOS CHOFERES

    public static void leerRecorridos(String[] nombres, double[][] recorridos){
        Scanner entrada=new Scanner(System.in);
        String[] dias={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        for (int c=0; c<recorridos[0].length; c++){
            System.out.println("Introduce los recorridos del dia " + dias[c]);
            for (int r=0; r<recorridos.length; r++){
                System.out.println("Introduce el recorrido de " + nombres[r] + " :");
                recorridos[r][c]=entrada.nextDouble();
            }
        }
    }//MéTODO PARA LEER LOS RECORRIDOS

    public static void calcularTotal(double[][] recorridos, double[] total){
        for (int r=0; r<recorridos.length; r++){
            total[r]=0;
            for (int c=0; c<recorridos[0].length; c++){
                total [r]=total[r]+recorridos[r][c];
            }
        }
    }//MéTODO PARA CALCULAR LOS TOTALES DE RECORRIDOS DE CADA CAMIONERO Y GUARDARLO EN UN ARREGLO

    public static void imprimir(String[] nombres, double[][] recorridos, double[] total){
        System.out.println("Nombre\tLun\tMar\tMie\tJue\tVie\tSab\t\tTotal");
        for(int r=0; r<recorridos.length; r++){
            System.out.print(nombres[r] + "\t");
            for(int c=0; c<recorridos[0].length; c++){
                System.out.print(recorridos[r][c] + "\t");
            }
            System.out.println("\t" + total[r]);
        }
    }//MéTODO PARA IMPRIMIR TODO
}