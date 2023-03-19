package dba_proyectoclases;
import java.util.Scanner;
public class DBA_ProyectoClases {

    public static void main(String[] args) {
        Cancion[] catalogo=new Cancion[20];   //Crear arreglo(catalogo) para almacenar tres objetos(canciones) con sus respectivos atributos.
        int cantidad=0;
        cantidad=precargaCanciones(catalogo);
        int opcion=0;
        int encontrado=-1;
        do{
            opcion=mostrarMenu();
            switch(opcion){
                case 1: catalogo[cantidad++]=leerCancion();        //Nuevo
                        break;
                case 2: encontrado=buscarCancion(catalogo);         //Buscar y mostrar
                        imprimirCancion(catalogo, encontrado);
                        break;
                case 3: encontrado=buscarCancion(catalogo);         //Eliminar
                        catalogo[encontrado].estatus="Inactivo";
                        imprimirCancion(catalogo, encontrado);
                        break;
                case 4: encontrado=buscarCancion(catalogo);       //Actualizar
                        catalogo[encontrado]=leerCancion();
                        imprimirCancion(catalogo, encontrado);
                        break;
                case 5: imprimirCatalogo(catalogo,cantidad);
                        break;
                case 6: System.out.println("Gracias por utilizar Rolones");
                        break;
                
            }
        }while(opcion<6);
    }
    //Método
    public static int precargaCanciones(Cancion[] canciones){
        canciones[0]=new Cancion();
        canciones[0].nombre="Space";
        canciones[0].autor="Seventeen";
        canciones[0].genero="Kpop";
        canciones[0].lanzamiento=2016;
        canciones[0].duracion=2.54;
        
        canciones[1]=new Cancion();
        canciones[1].nombre="Arabella";
        canciones[1].autor="Arctic Monkeys";
        canciones[1].genero="Rock";
        canciones[1].lanzamiento=2014;
        canciones[1].duracion=4.23;
        
        canciones[2]=new Cancion();
        canciones[2].nombre="Cirice";
        canciones[2].autor="Ghost";
        canciones[2].genero="Metal";
        canciones[2].lanzamiento=2018;
        canciones[2].duracion=6;
        
        canciones[3]=new Cancion();
        canciones[3].nombre="Selfless";
        canciones[3].autor="Strokes";
        canciones[3].genero="Rock";
        canciones[3].lanzamiento=2020;
        canciones[3].duracion=3.42;
        
        canciones[4]=new Cancion();
        canciones[4].nombre="Tomorrow";
        canciones[4].autor="Lamp";
        canciones[4].genero="Soul";
        canciones[4].lanzamiento=2004;
        canciones[4].duracion=2.44;
        
        canciones[5]=new Cancion();
        canciones[5].nombre="Azul";
        canciones[5].autor="Zoe";
        canciones[5].genero="Alternativo";
        canciones[5].lanzamiento=2015;
        canciones[5].duracion=3.56;
        
        canciones[6]=new Cancion();
        canciones[6].nombre="Lucid";
        canciones[6].autor="Aespa";
        canciones[6].genero="Kpop";
        canciones[6].lanzamiento=2022;
        canciones[6].duracion=3.20;
        return 7;
    }
    
    //Metodo para preguntar al usuario objetos
    public static Cancion leerCancion(){
        Scanner lector=new Scanner(System.in);
        Cancion c=new Cancion();
        System.out.println("Introduce el nombre de la canción: ");
        c.nombre=lector.next();
        System.out.println("Introduce el autor: ");
        c.autor=lector.next();
        System.out.println("Introduce el género: ");
        c.genero=lector.next();
        System.out.println("Introduce el año de lanzamiento: ");
        c.lanzamiento=lector.nextInt();
        System.out.println("Introduce la duración en minutos: ");
        c.duracion=lector.nextDouble();
        return c;      //Retorna c
    }   //FIN de método leerCancion
    
    //MÉTODO PARA MENÚ
    public static int mostrarMenu(){
        Scanner lector=new Scanner(System.in);
        int opcion=0;
        System.out.println("* * *   C A T Á L O G O     D E     C A N C I O N E S   * * *");
        System.out.println("\t\t**MENÚ**");
        System.out.println("1. Nueva canción");
        System.out.println("2. Buscar canción");
        System.out.println("3. Eliminar canción");
        System.out.println("4. Actualizar canción");
        System.out.println("5. Mostrar canción");
        System.out.println("Introduce la opción:");
        opcion=lector.nextInt();
        return opcion;
    }
    
    public static void imprimirCatalogo(Cancion[] catalogo, int cantidad){
        ordenar(catalogo,cantidad);
        System.out.println("Título\tAutor\t\tGenero\tLanzamiento\tDuracion");
        for(int i=0;i<cantidad;i++){
            System.out.print(catalogo[i].nombre+"\t");
            System.out.print(catalogo[i].autor+"\t");
            System.out.print(catalogo[i].genero+"\t");
            System.out.print(catalogo[i].lanzamiento+"\t");
            System.out.println(catalogo[i].duracion+"\t");
        }
    }
    
    public static int buscarCancion(Cancion[] c){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el nombre de la cancion:");
        String nombre=lector.next();
        int encontrado=-1;              
        int i=0;
        do{
            if(nombre.equals(c[i].nombre)){
                encontrado=i;
            }
            i++;
        }while(encontrado==-1&&i<c.length);
        return encontrado; 
    }
    
    public static void imprimirCancion(Cancion[] c, int encontrado){
        System.out.println("Títulos: "+ c[encontrado].nombre);
        System.out.println("Autor: "+ c[encontrado].autor);
        System.out.println("Género: "+ c[encontrado].genero);
        System.out.println("Lanzamiento: "+ c[encontrado].lanzamiento);
        System.out.println("Duración: "+ c[encontrado].duracion);
        System.out.println("Estatus: "+ c[encontrado].estatus);
    }
    
    public static void actualizarCancion(Cancion[] c, int encontrado){ 
        Scanner lector=new Scanner(System.in);
        int respEstatus=1;
        System.out.println("Introduce el nuevo valor para el lanzamiento:");
        c[encontrado].lanzamiento=lector.nextInt();
        System.out.println("Introduce el nuevo valor para la duracion:");
        c[encontrado].duracion=lector.nextDouble();
        do{
            System.out.println("Introduce el nuevo valor para el estatus 1.Activo, 2.Inactivo :");
            respEstatus=lector.nextInt();
            if(respEstatus==1){
                c[encontrado].estatus="Activo";
            }
            else{
                if(respEstatus==2){
                    c[encontrado].estatus="Inactivo";  
                }
                else{
                    System.out.println("Opcion incorrecta, vuelve a intentar.");
                }
            }
        }while(respEstatus<1||respEstatus>2);
    }
    
    public static void ordenar(Cancion[] canciones, int cantidad){
        for(int p=0;p<cantidad-1;p++){
            for(int c=0;c<cantidad-1;c++){
                if(canciones[c].lanzamiento>canciones[c+1].lanzamiento){
                    Cancion aux=new Cancion();
                    aux=canciones[c];
                    canciones[c]=canciones[c+1];
                    canciones[c+1]=aux;
                }
            }   //fin ciclo c
        } //fin ciclo p
    }
}