import java.util.Scanner;

public class Ejercicio7_Arreglo{
    public static void main(String [] args) {
        double [][] ventas = new double[5][5];
        String [] nombres = new String [5];
        leerNombres(nombres);
        leerVentas(nombres, ventas);
        System.out.println("La venta mayor es "+ encontrarMayor(ventas));
    }

    public static void leerNombres(String [] nombres) {
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<nombres.length; i++) {
            System.out.println("Introduce el nombre del empleado: ");
            nombres[i] = entrada.next();       
        } 
    }
    public static void leerVentas(String [] nombres, double [][] ventas){
        Scanner entrada = new Scanner(System.in);
        String[] dias={"Lunes","Martes","Miercoles","Jueves","Viernes"};
        for(int d=0; d<ventas[0].length; d++){
            System.out.println("Registro del dia " + dias[d]);
            for(int e=0; e<ventas.length; e++){
                System.out.println("Introduce la venta del empleado " + nombres[e] + ":");
                ventas[e][d] = entrada.nextDouble();
            }
        }
    }

    public static double encontrarMayor(double[][] ventas){
        double mayor = ventas[0][0];
        for(int m=0; m<ventas.length; m++){
            for(int d=0; d<ventas[0].length; d++){
                if(ventas[m][d] > mayor){
                    mayor=ventas[m][d];
                }
            }
        }
        return mayor;
    } //fin metodo
}
