import java.util.Scanner;
public class Ejercicio1_Arreglo{
    public static void main(String args[]){
        Scanner datos = new Scanner (System.in);
        int n,a=0,e,sumatoria=0;
        double promedio;
        System.out.println("Ingresar la cantidad de alumnos");
        n = datos.nextInt();

        int edades[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Ingresar su edad");
            e = datos.nextInt();
            sumatoria = e + sumatoria;
            edades[a] = e;

            a = a+1;
        }
        a=0;
        promedio = sumatoria/n;
        for(int l=1; l<=n; l++){
            System.out.println("La edad " + l + " es " + edades[a]);
            a = a+1;
        }
        System.out.println("El promedio es > " + promedio);
    }
}