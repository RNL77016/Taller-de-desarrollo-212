import java.util.Scanner;

public class Ejercicio3_Arreglo{
    public static void main(String[] args){
        int[]datos;
        datos=leerDatos();
        int menor=obtenerMenor(datos);
        int mayor=obtenerMayor(datos);
        System.out.println("El mayor es: "+ mayor);
        System.out.println("El menor es: "+ menor);
    }
    public static int[]leerDatos(){
        Scanner lector=new Scanner(System.in);
        int n;
        int[] datos;
        System.out.println("Introduce la cantidad de elementos");
        n=lector.nextInt();
        datos=new int[n];
        for(int i=0;i<datos.length;i++){
            System.out.println("Introduce el dato" + (i+1)+":");
            datos[i]=lector.nextInt();
        }
        return datos;
    }
    public static int obtenerMenor(int[] datos){
        int menor=datos[0];
        for(int i=0;i<datos.length;i++){
            if(datos[i]<menor)
                 menor=datos[i];
        }
        return menor;
    }
    public static int obtenerMayor(int[] datos){
        int mayor=datos[0];
        for(int i=0;i<datos.length;i++){
            if(datos[i]>mayor)
                 mayor=datos[i];
        }
        return mayor;
    }
}