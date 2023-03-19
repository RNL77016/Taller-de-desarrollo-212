import java.util.Scanner;

public class Ejercicio5_Arreglo{
    public static void main(String[] args) {
        int[][] datos=new int [4][4];
        datos=leerDatos();
        System.out.println("Cantidad de ceros: " + contarCeros(datos));
    }
    
    public static int[][] leerDatos(){
        Scanner lector=new Scanner(System.in);
        int[][] datos=new int[4][4];
        for(int r=0;r<datos.length;r++){
            for(int c=0;c<datos[0].length;c++){
                System.out.println("Introduce datos (0-9) de " + (r+1) + "," + (c+1));
                datos[r][c]=lector.nextInt();
            }
        }
        return datos;
    }
    public static int contarCeros(int [][] datos){
        int contador=0;
        for(int r=0;r<datos.length;r++){
            for(int c=0;c<datos[0].length;c++){
                if(datos[r][c]==0)
                    contador++;
            }
        }
        return contador;
    }
}