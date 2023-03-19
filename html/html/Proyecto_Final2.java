import java.util.Scanner;
import java.text.DecimalFormat;

public class Proyecto_Final2{
    static Scanner entrada=new Scanner (System.in);
    public static void main(String args[]){
        historialPedidos [] pedidos = new historialPedidos [50];
        int respuestaMenu = 0;

        precargaPedidos(pedidos);
        calculoPrecargaPedidos(pedidos);
            
        do{
            respuestaMenu = mostrarMenu();
            System.out.println("");
            switch(respuestaMenu){
                case 1:
                    nuevoPedido(pedidos);
                    respuestaMenu = 0;
                    break;
                case 2:
                    eliminarPedido(pedidos);
                    respuestaMenu = 0;
                    break;
                case 3:
                    actualizarPedido(pedidos);
                    calculoPrecargaPedidos(pedidos);
                    respuestaMenu = 0;
                    break;
                case 4:
                    buscarPedido(pedidos);
                    respuestaMenu = 0;
                    break;
                case 5:
                    impresionPedidos(pedidos);
                    respuestaMenu = 0;
                    break;
                case 6:
                    break;
            }
        }while(respuestaMenu != 6);

    }

    public static int mostrarMenu () {
        int respuestaMenu=0;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("        A D M I N I S T R A D O R   D E   P E D I D O S        ");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("1.- Insertar un nuevo pedido");
        System.out.println("2.- Eliminar un pedido");
        System.out.println("3.- Actualizar un pedido");
        System.out.println("4.- Buscar un pedido");
        System.out.println("5.- Mostrar el listado de pedidos");
        System.out.println("6.- Salir");
        System.out.println();
        System.out.print("Introduce la opcion : ");
        respuestaMenu=entrada.nextInt();

        return respuestaMenu;
    }

    public static void nuevoPedido (historialPedidos [] pedidos){
        int auxCantidadPantalones = 0, lugarLibre = 0, checklugar = 0, i = 0;
        String auxModeloPantalon = "", auxTallaPantalon = "";
        double auxCostoTela = 0, auxCostoManoObra = 0, auxGananciaTienda = 0, auxPrecioPantalonIndividual = 0, auxTotalVenta = 0, auxCostoExtra = 0, auxCostoTelaMetro = 0;

            System.out.println("---------------------------------------------------------------");
            System.out.println("");

        do{
            System.out.print("Ingrese un modelo de pantalon - A o B = ");
            auxModeloPantalon=entrada.next();
        }while(!auxModeloPantalon.equals("A")==!auxModeloPantalon.equals("B")==!auxModeloPantalon.equals("b")==!auxModeloPantalon.equals("a"));

            System.out.println("");

        do{        
            System.out.print("Ingrese A para talla 30 - Ingrese B para talla 32 - Ingrese C para talla 36 = ");
            auxTallaPantalon=entrada.next();
        }while (!auxTallaPantalon.equals("A")==!auxTallaPantalon.equals("a")==!auxTallaPantalon.equals("B")==!auxTallaPantalon.equals("b")==!auxTallaPantalon.equals("C")==!auxTallaPantalon.equals("c"));

            System.out.println("");

        System.out.print("Escriba la cantidad de pantalones = ");
        auxCantidadPantalones=entrada.nextInt();

            System.out.println("");

        System.out.print("Ingrese el costo por metro de tela = ");
        auxCostoTelaMetro=entrada.nextDouble();


        //CACULO DEL COSTO DE TELA POR MODELO
        if (auxModeloPantalon == "a" || auxModeloPantalon == "A"){
            auxCostoTela = auxCostoTelaMetro * 1.5;
            //EL MODELO A UTILIZA 1.5 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
        }
        else{
            auxCostoTela = auxCostoTelaMetro * 1.8;
            //EL MODELO B UTILIZA 1.8 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
        }


        //CALCULO DE COSTO DE MANO DE OBRA
        if (auxModeloPantalon == "a" || auxModeloPantalon == "A"){
            auxCostoManoObra = auxCostoTela * 0.8;
            //EL MODELO A UTILIZA 1.5 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
        }
        else{
            auxCostoManoObra = auxCostoTela * 0.95;
            //EL MODELO B UTILIZA 1.8 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
        }


        //A LAS TALLAS 32 Y 36 SE LES CARGA UN 4% EXTRA DEL COSTO DE MANO DE OBRA, ESTE IF CHECA SI LAS TALLAS SON 32 O 36
        if (auxTallaPantalon == "B" || auxTallaPantalon == "b" || auxTallaPantalon == "C" || auxTallaPantalon == "c"){
            auxCostoExtra = (auxCostoManoObra + auxCostoTela) * 0.04;
        }

        //CALCULA UNICAMENTE LA GANANCIA DE LA TIENDA POR PANTALON
        auxGananciaTienda = (auxCostoTela + auxCostoManoObra + auxCostoExtra) * 0.35;

        //CALCULA EL PRECIO FINAL DEL PANTALON INDIVIDUAL
        auxPrecioPantalonIndividual = auxCostoTela + auxCostoManoObra + auxCostoExtra + auxGananciaTienda;

        //CALCULA EL TOTAL DE COSTO POR PANTALONES VENDIDOS
        auxTotalVenta = auxPrecioPantalonIndividual * auxCantidadPantalones;

        //BUSQUEDA DE LUGAR LIBRE EN EL ARREGLO
        do{
            if (pedidos[i] == null){
                lugarLibre = i;
                checklugar = 1;
            }
            i++;
        }while(checklugar == 0);
        checklugar = 0;
        
        pedidos [lugarLibre] = new historialPedidos((lugarLibre + 1) ,auxCantidadPantalones, auxModeloPantalon, auxTallaPantalon, auxCostoTelaMetro, auxCostoTela, auxCostoManoObra, auxGananciaTienda, auxPrecioPantalonIndividual, auxTotalVenta);

        auxCantidadPantalones = 0;
        auxCostoExtra = 0;
        auxCostoManoObra = 0;
        auxCostoTela = 0;
        auxGananciaTienda = 0;
        auxModeloPantalon = "";
        auxPrecioPantalonIndividual = 0;
        auxTallaPantalon = "";
        auxTotalVenta = 0;
        lugarLibre = 0;
        auxCostoTelaMetro = 0;

    }

    public static void precargaPedidos (historialPedidos [] pedidos){

        pedidos [0] = new historialPedidos(0, 10, "A", "B", 100, 0, 0, 0, 0, 0);
        pedidos [1] = new historialPedidos(1, 20, "B", "A", 50, 0, 0, 0, 0, 0);
        pedidos [2] = new historialPedidos(2, 5, "A", "B", 20, 0, 0, 0, 0, 0);
        pedidos [3] = new historialPedidos(3, 14, "B", "A", 15, 0, 0, 0, 0, 0);
        pedidos [4] = new historialPedidos(4, 11, "A", "C", 12, 0, 0, 0, 0, 0);
        pedidos [5] = new historialPedidos(5, 7, "A", "C", 100, 0, 0, 0, 0, 0);
        pedidos [6] = new historialPedidos(6, 30, "B", "B", 70, 0, 0, 0, 0, 0);
        pedidos [7] = new historialPedidos(7, 40, "A", "C", 30, 0, 0, 0, 0, 0);
        pedidos [8] = new historialPedidos(8, 19, "A", "B", 10, 0, 0, 0, 0, 0);
        pedidos [9] = new historialPedidos(9, 4, "B", "A", 20, 0, 0, 0, 0, 0);

    }

    public static void impresionPedidos (historialPedidos [] pedidos){
        historialPedidos aux;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Folio           Cant Pa         Talla Pa        Model Pa        Cost Te Me      Cost Te         Cost MO         Gan Tie         Prec PI         Tot Ve");
        
        for(int i = 0; i < pedidos.length - 1; i++){
            for(int j = 0; j < pedidos.length - 1; j++){
                if (pedidos [j+1] != null){
                    if (pedidos[j].totalVenta > pedidos[j+1].totalVenta){
                        aux = pedidos[j];
                        pedidos[j] = pedidos [j+1];
                        pedidos[j+1] = aux;
                    }
                }
            }
        }

        for (int i = 0; i < pedidos.length; i++){
            if (pedidos [i] != null){
                System.out.println(pedidos[i].folio + "\t\t" + pedidos[i].cantidadPantalones + "\t\t" + pedidos[i].tallaPantalon + "\t\t" + pedidos[i].modeloPantalon + "\t\t" + pedidos[i].costoTelaMetro + "\t\t" + df.format(pedidos[i].costoTela) + "\t\t" + df.format(pedidos[i].costoManoObra) + "\t\t" + df.format(pedidos[i].gananciaTienda) + "\t\t" + df.format(pedidos[i].precioPantalonIndividual) + "\t\t" + df.format(pedidos[i].totalVenta));
            }
        }
    }

    public static void calculoPrecargaPedidos (historialPedidos [] pedidos){
        int auxCantidadPantalones = 0;
        String auxModeloPantalon = "", auxTallaPantalon = "";
        double auxCostoTela = 0, auxCostoManoObra = 0, auxGananciaTienda = 0, auxPrecioPantalonIndividual = 0, auxTotalVenta = 0, auxCostoExtra = 0, auxCostoTelaMetro = 0;

        for (int i = 0; i < pedidos.length; i++){
            if (pedidos[i] != null){

                auxCantidadPantalones = pedidos[i].cantidadPantalones;
                auxModeloPantalon = pedidos[i].modeloPantalon;
                auxTallaPantalon = pedidos[i].tallaPantalon;
                auxCostoTelaMetro = pedidos[i].costoTelaMetro;

                //CACULO DEL COSTO DE TELA POR MODELO
                if (auxModeloPantalon == "a" || auxModeloPantalon == "A"){
                    auxCostoTela = auxCostoTelaMetro * 1.5;
                    //EL MODELO A UTILIZA 1.5 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
                }
                else{
                    auxCostoTela = auxCostoTelaMetro * 1.8;
                    //EL MODELO B UTILIZA 1.8 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
                }


                //CALCULO DE COSTO DE MANO DE OBRA
                if (auxModeloPantalon == "a" || auxModeloPantalon == "A"){
                    auxCostoManoObra = auxCostoTela * 0.8;
                    //EL MODELO A UTILIZA 1.5 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
                }
                else{
                    auxCostoManoObra = auxCostoTela * 0.95;
                    //EL MODELO B UTILIZA 1.8 M DE TELA Y SE MULTIPLICA POR EL COSTO DE TELA POR METRO INGRESADO POR EL USUARIO
                }


                //A LAS TALLAS 32 Y 36 SE LES CARGA UN 4% EXTRA DEL COSTO DE MANO DE OBRA, ESTE IF CHECA SI LAS TALLAS SON 32 O 36
                if (auxTallaPantalon == "B" || auxTallaPantalon == "b" || auxTallaPantalon == "C" || auxTallaPantalon == "c"){
                    auxCostoExtra = (auxCostoManoObra + auxCostoTela) * 0.04;
                }

                //CALCULA UNICAMENTE LA GANANCIA DE LA TIENDA POR PANTALON
                auxGananciaTienda = (auxCostoTela + auxCostoManoObra + auxCostoExtra) * 0.35;

                //CALCULA EL PRECIO FINAL DEL PANTALON INDIVIDUAL
                auxPrecioPantalonIndividual = auxCostoTela + auxCostoManoObra + auxCostoExtra + auxGananciaTienda;

                //CALCULA EL TOTAL DE COSTO POR PANTALONES VENDIDOS
                auxTotalVenta = auxPrecioPantalonIndividual * auxCantidadPantalones;

                pedidos [i] = new historialPedidos (pedidos[i].folio ,auxCantidadPantalones, auxModeloPantalon, auxTallaPantalon, auxCostoTelaMetro, auxCostoTela, auxCostoManoObra, auxGananciaTienda, auxPrecioPantalonIndividual, auxTotalVenta);


            }
        }

    }

    public static void buscarPedido (historialPedidos [] pedidos){
        DecimalFormat df = new DecimalFormat("#.00");
        int decisionFolio = 0, checklugar = 0, i = 0;

        impresionPedidos(pedidos);

        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.print("Ingrese el folio del pedido que desea buscar = ");
        decisionFolio = entrada.nextInt();
        decisionFolio = decisionFolio;
        System.out.println("");

        do{
            if (decisionFolio == pedidos[i].folio){
                System.out.println("Folio           Cant Pa         Talla Pa        Model Pa        Cost Te Me      Cost Te         Cost MO         Gan Tie         Prec PI         Tot Ve");
                System.out.println(pedidos[i].folio + "\t\t" + pedidos[i].cantidadPantalones + "\t\t" + pedidos[i].tallaPantalon + "\t\t" + pedidos[i].modeloPantalon + "\t\t" + pedidos[i].costoTelaMetro + "\t\t" + pedidos[i].costoTela + "\t\t" + pedidos[i].costoManoObra + "\t\t" + pedidos[i].gananciaTienda + "\t\t" + pedidos[i].precioPantalonIndividual + "\t\t" + df.format(pedidos[i].totalVenta));
                checklugar = 1;
            }
            i++;
        }while(checklugar == 0);

    }

    public static void actualizarPedido (historialPedidos [] pedidos){
        DecimalFormat df = new DecimalFormat("#.00");
        int folioCambiar = 0, checklugar = 0, i = 0;
        int auxCantidadPantalones = 0;
        String auxModeloPantalon = "";
        String auxTallaPantalon = "";
        double auxCostoTelaMetro = 0;


        impresionPedidos(pedidos);
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.print("Ingresa el folio del pedido que deseas cambiar = ");
        folioCambiar = entrada.nextInt();
        System.out.println("");

        do{
            System.out.print("Ingrese un modelo de pantalon - A o B = ");
            auxModeloPantalon=entrada.next();
        }while(!auxModeloPantalon.equals("A")==!auxModeloPantalon.equals("B")==!auxModeloPantalon.equals("b")==!auxModeloPantalon.equals("a"));

            System.out.println("");

        do{        
            System.out.print("Ingrese A para talla 30 - Ingrese B para talla 32 - Ingrese C para talla 36 = ");
            auxTallaPantalon=entrada.next();
        }while (!auxTallaPantalon.equals("A")==!auxTallaPantalon.equals("a")==!auxTallaPantalon.equals("B")==!auxTallaPantalon.equals("b")==!auxTallaPantalon.equals("C")==!auxTallaPantalon.equals("c"));

            System.out.println("");

        System.out.print("Escriba la cantidad de pantalones = ");
        auxCantidadPantalones=entrada.nextInt();

            System.out.println("");

        System.out.print("Ingrese el costo por metro de tela = ");
        auxCostoTelaMetro=entrada.nextDouble();

        do{
            if(folioCambiar == pedidos[i].folio){
                pedidos[i].cantidadPantalones = auxCantidadPantalones;
                pedidos[i].tallaPantalon = auxTallaPantalon;
                pedidos[i].modeloPantalon = auxModeloPantalon;
                pedidos[i].costoTelaMetro = auxCostoTelaMetro;
                checklugar = 1;
            }
            i++;
        }while(checklugar == 0);

    }

    public static void eliminarPedido (historialPedidos [] pedidos){
        int decisionFolioEliminar = 0;

        System.out.print("Ingrese el folio del pedido que desea eliminar = ");
        decisionFolioEliminar = entrada.nextInt();

        for(int i = 0; i < pedidos.length - 1; i++){
            if (pedidos[i+1] != null){
                if (decisionFolioEliminar == pedidos[i].folio){
                    pedidos[i] = null;
                }
            }
        }

        for(int i = 0; i < pedidos.length - 1; i++){
            for(int j = 0; j < pedidos.length - 1; j++){
                if (pedidos [j] == null && pedidos [j+1] != null){
                    pedidos[j] = pedidos [j+1];
                    pedidos[j+1] = null;
                }
            }
        }

    }

}