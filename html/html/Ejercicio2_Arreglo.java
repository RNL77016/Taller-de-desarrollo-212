import java.util.Scanner;

public class Ejercicio2_Arreglo{

    public static void main(String args[]){
    Scanner datos = new Scanner (System.in);
    String [] meses = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
        double[] ahorro;
        double acumulado=0;
        ahorro=leerAhorro(meses);

        System.out.println("No. mes \t Ahorro  \t Acumulado");
        for(int i=0; i<ahorro.length; i++){
            acumulado=acumulado + ahorro[i];
            System.out.println((i+1) + " "  +meses[i]  +  "\t\t  " +ahorro[i]+ " \t\t " +acumulado);
        }
    }

    public static double[] leerAhorro(String[] meses){
        Scanner lector=new Scanner (System.in);
        double[] ahorroMensual = new double [12];
        for (int i=0;i<12; i++){
            System.out.println("Introduce el ahorro del mes "+ meses[i]+":");
            ahorroMensual[i]=lector .nextDouble();
        }
        return ahorroMensual;
    }
}