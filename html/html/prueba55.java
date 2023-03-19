import java.util.Scanner;

public class Ejercicio52_Arreglo{

    public static void main(String args[]){
    int[] datos;
    datos=leerDatos();
    int menor=obtenerMenor(datos);
    int mayor=obtenerMayor(datos);
    System.out.println("Menor: " + menor);
    System.out.println("Mayor: " + mayor);
    }
    
    public static int[] leerDatos(){
        Scanner lector=new Scanner(System.in);
        int n;
        int^[] datos;
        System.out.println("Introduce la cantidad de elementos:");
        n=lector.nextInt();
        datso=new int[n];
        for(int i=0;i<datos.length;i++){
            System.out.println("Introduce el dato " + (i+1)+":");
            datos[i]=lector.nextInt();
        }
        return datos;
    }

    public static int obtenerMenor(int[] d){
        int menor=d[0];
        for(int i=1 ;i<d.length;i++){
            if(d[i]<menor)
            menor=d[i];
        }
        return menor;
    }

    public static int obtenerMayor(int[] d){
        int mayor=d[0];
        for(int i=1 ;i<d.length;i++){
            if(d[i]<mayor)
            mayor=d[i];
        }
        return mayor;
    }

    public static void imprimir(int[] d){
        System.out.println("  +++ Lista de datos +++ ");
        for(int i=0;i<d.length;i++){
            System.out.println(" " + d[i]);
        }
    }
}