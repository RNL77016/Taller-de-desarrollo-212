import java.util.Scanner;

public class Ejercicio10_Arreglo{
    public static void main (String args[]){

        Scanner entrada=new Scanner(System.in);
        int renglon=0, renglon2=0, columna=0, columna2=0;
        
        System.out.println("Ingrese la cantidad de renglones de la matriz A");
        renglon=entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz A");
        columna=entrada.nextInt();

        do{
            System.out.println("Ingrese la cantidad de renglones de la matriz B");
            renglon2=entrada.nextInt();
            if(renglon2!=columna){
                System.out.println("No es posible multiplicar las matrices ya que la cantidad de renglones de la matriz A es diferente a la cantidad de columnas de la matriz B");
                renglon2=0;
            }
        }while(renglon2!=columna);

        do{
            columna2=0;
            System.out.println("Ingrese la cantidad de columnas de la matriz B");
            columna2=entrada.nextInt();
            if(columna2!=renglon){
                System.out.println("No es posible multiplicar las matrices ya que la cantidad de columnas de la matriz A es diferente a la cantidad de renglones de la matriz B");
            }
        } while(columna2!=renglon);

        double [][] a=new double [renglon][columna];
        double [][] b=new double [renglon2][columna2];

        System.out.println("A continuacion ingresaras los datos para la matriz A");
        for(int i=0; i<a.length; i++){
            for(int r=0; r<a[0].length; r++){
                System.out.println("Ingresa el valor del renglon " + (i+1) + " y columna " + (r+1));
                a[i][r]=entrada.nextDouble();
            }
        }

        System.out.println("A continuacion ingresaras los datos para la matriz B");
        for(int i=0; i<b.length; i++){
            for(int r=0; r<b[0].length; r++){
                System.out.println("Ingresa el valor del renglon " + (i+1) + " y columna " + (r+1));
                b[i][r]=entrada.nextDouble();
            }
        }

        double[][] ab=new double[renglon][columna2];
        double[][] ba=new double[renglon2][columna];

        //Multiplicacion Matriz A x B
        for(int i = 0; i < a.length; i++){
            for(int r = 0; r < b[0].length; r++){
                double sumatoria = 0;
                for(int z = 0; z < a[0].length; z++){
                    sumatoria += a[i][z] * b[z][r];
                }
                ab [i][r] = sumatoria;
            }
        }

        //Multiplicacion Matriz B x A
        for(int i = 0; i < ba.length; i++){
            for(int r = 0; r < ba[0].length; r++){
                double sumatoria2 = 0;
                for(int z = 0; z < a.length; z++){
                    sumatoria2 += b[i][z] * a[z][r];
                }
                ba [i][r] = sumatoria2;
            }
        }

        //Impresion Matriz A
        System.out.println("-- MATRIZ A --");
        for(int i=0; i<a.length; i++){
            for(int r=0; r<a[0].length; r++){
                System.out.print(a[i][r]+ "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");

        //Impresion Matriz B
        System.out.println("-- MATRIZ B --");
        for(int i=0; i<b.length; i++){
            for(int r=0; r<b[0].length; r++){
                System.out.print(b[i][r]+ "\t");
            }
            System.out.println("");
        }

        System.out.println("");
                
        //Impresion Matriz AB
        System.out.println("-- MATRIZ AB --");
        for(int fila = 0; fila < ab.length; fila++){
            for(int c = 0; c < ab[0].length; c++){
                System.out.print(ab[fila][c]+ "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        //Impresion Matriz BA
        System.out.println("-- MATRIZ BA --");
        for(int fila = 0; fila < ba.length; fila++){
            for(int c = 0; c < ba[0].length; c++){
                System.out.print(ba[fila][c]+ "\t");
            }
            System.out.println("");
        }


    }

}