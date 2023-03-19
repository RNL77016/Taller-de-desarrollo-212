public class proyectocr7{
    public static void main(String args[]){
        Cancion cancion1=new Cancion(); //Creo el objeto
        cancion1.autor="Alberto Aguilera Valadez";//Modifico sus atributos
        cancion1.nombre="Amor eterno";
        cancion1.genero="Balada";
        cancion1.duracion=5.13;
        cancion1.lanzamiento="1985";

        System.out.println("Titulo: " + cancion1.nombre);
    }
}