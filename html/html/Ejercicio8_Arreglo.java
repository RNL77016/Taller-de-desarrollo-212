import java.util.Scanner;
public class Ejercicio8_Arreglo{
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escribe el valor del renglon: ");
            int m = entrada.nextInt();
            System.out.println("Escribe el valor de la columna: ");
            int n = entrada.nextInt();
            double[][] a = new double[m][n];
            double[][] b = new double[m][n];
            double[][] r = new double[m][n];
            leerMatriz(a);
            leerMatriz(b);
            sumaMatriz(a,b,r);
            imprimir(r);
        }
        public static void leerMatriz(double [][] matriz){
            Scanner entrada = new Scanner(System.in);
            for(int i=0;i<matriz[0].length;i++){
                for(int c=0;c<matriz.length;c++){
                    System.out.println("Escriba el valor " + i + c + ": ");
                    matriz[i][c] =entrada.nextDouble();
                }
            }
        }
        public static void sumaMatriz(double[][] matriz1,double[][] matriz2,double[][]resultado){
            for(int i=0;i<matriz1[0].length;i++){
                for(int c=0;c<matriz1.length;c++){
                    resultado[i][c] = matriz1[i][c] + matriz2[i][c];
                }
            }
        }
        public static void imprimir(double[][] resultado){
            for(int i=0;i<resultado[0].length;i++){
                System.out.println(" ");
                for(int c=0;c<resultado.length;c++){
                    System.out.print(resultado[i][c]+"\t");
                }
            }
        }
 }