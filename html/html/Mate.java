import java.util.Scanner;
public class Mate{
public static void lecturaDatos(){
    Scanner entrada=new Scanner(System.in);
    int renglon=0, renglon2=0, columna=0, columna2=0;
    double [][] a=new double [renglon][columna];
    double [][] b=new double [renglon2][columna2];
    
    System.out.println("Ingrese la cantidad de renglones de la matriz A");
    renglon=entrada.nextInt();
    System.out.println("Ingrese la cantidad de columnas de la matriz A");
    columna=entrada.nextInt();

    do{
        System.out.println("Ingrese la cantidad de renglones de la matriz B");
        renglon2=entrada.nextInt();
        if(renglon2=!columna){
            System.out.println("No es posible multiplicar las matrices ya que la cantidad de renglones de la matriz A es diferente a la cantidad de columnas de la matriz B");
            renglon2=0;
        }
    }while(renglon2=!columna);

    do{
        columna2=0;
        System.out.println("Ingrese la cantidad de columnas de la matriz B");
        columna2=entrada.nextDouble();
        if(columna2=!renglon){
            System.out.println("No es posible multiplicar las matrices ya que la cantidad de columnas de la matriz A es diferente a la cantidad de renglones de la matriz B");
        }
    } while(columna2=!renglon);

    System.out.println("A continuacion ingresaras los datos para la matriz A");
    for(int i=0; i<a.length; i++){
        for(int r=0; r<a[0].length; r++){
            System.out.println("Ingresa el valor del renglon " + (i+1) + " y columna " + (r+1));
            a[i][r]=entrada.nextDouble();
        }
    }

    System.out.println("A continuacion ingresaras los datos para la matriz A");
    for(int i=0; i<b.length; i++){
        for(int r=0; r<b[0].length; r++){
            System.out.println("Ingresa el valor del renglon " + (i+1) + " y columna " + (r+1));
            b[i][r]=entrada.nextDouble();
        }
    }

}