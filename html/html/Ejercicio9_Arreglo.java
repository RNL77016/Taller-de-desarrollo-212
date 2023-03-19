import java.util.Scanner;

public class Ejercicio9_Arreglo{
    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        int c = entrada.nextInt();

        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        int r = entrada.nextInt();

        double [][] a = new double[r][c];
        double[][] transpuesta = new double[a[0].length][a.length];

        leerMatriz(a);
        matrizTranspuesta(a, transpuesta);

        System.out.println("\nLa matriz original es: ");
        imprimir(a);
        System.out.println("\n\nLa matriz transpuesta es: ");
        imprimir(transpuesta);

    }

    public static void leerMatriz(double [][] a){
        Scanner entrada = new Scanner(System.in);

        for(int renglon=0; renglon < a.length; renglon++){
            for(int columna = 0; columna < a[0].length; columna++){
                System.out.println("Escriba el valor " + (renglon + 1) + (columna + 1) + ": ");
                a[renglon][columna] =entrada.nextDouble();
            }
        }

    }

    public static void matrizTranspuesta(double [][] a,double [][] transpuesta){
        for (int x=0; x < a.length; x++) {
            for (int y=0; y < a[x].length; y++) {
                transpuesta[y][x] = a[x][y];
            }
        }
    }

    public static void imprimir(double[][] a){

        for(int renglon = 0; renglon < a.length; renglon++){
            System.out.println(" ");
            for(int columna = 0; columna < a[0].length; columna++){
                System.out.print(a[renglon][columna]+"\t");
            }
        }

    }

}