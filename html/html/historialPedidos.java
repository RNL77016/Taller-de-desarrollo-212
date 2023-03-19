public class historialPedidos{
    public int cantidadPantalones;
    public String modeloPantalon;
    public String tallaPantalon;
    public double costoTela;
    public double costoManoObra;
    public double gananciaTienda;
    public double precioPantalonIndividual;
    public double totalVenta;
    public int folio;
    public double costoTelaMetro;

    public historialPedidos (int folio, int cantidadPantalones, String modeloPantalon, String tallaPantalon, double costoTelaMetro, double costoTela, double costoManoObra, double gananciaTienda, double precioPantalonIndividual, double totalVenta){
        this.cantidadPantalones = cantidadPantalones;
        this.modeloPantalon = modeloPantalon;
        this.tallaPantalon = tallaPantalon;
        this.costoTela = costoTela;
        this.costoManoObra = costoManoObra;
        this.gananciaTienda = gananciaTienda;
        this.precioPantalonIndividual = precioPantalonIndividual;
        this.totalVenta = totalVenta;
        this.folio = folio;
        this.costoTelaMetro = costoTelaMetro;
    }

    public int getCantidadPantalones() {
        return cantidadPantalones;
    }

    public void setCantidadPantalones(int cantidadPantalones) {
        this.cantidadPantalones = cantidadPantalones;
    }

    public String getModeloPantalon() {
        return modeloPantalon;
    }

    public void setModeloPantalon(String modeloPantalon) {
        this.modeloPantalon = modeloPantalon;
    }

    public String getTallaPantalon() {
        return tallaPantalon;
    }

    public void setTallaPantalon(String tallaPantalon) {
        this.tallaPantalon = tallaPantalon;
    }

    public double getCostoTela() {
        return costoTela;
    }

    public void setCostoTela(double costoTela) {
        this.costoTela = costoTela;
    }

    public double getCostoManoObra() {
        return costoManoObra;
    }

    public void setCostoManoObra(double costoManoObra) {
        this.costoManoObra = costoManoObra;
    }

    public double getGananciaTienda() {
        return gananciaTienda;
    }

    public void setGananciaTienda(double gananciaTienda) {
        this.gananciaTienda = gananciaTienda;
    }

    public double getPrecioPantalonIndividual() {
        return precioPantalonIndividual;
    }

    public void setPrecioPantalonIndividual(double precioPantalonIndividual) {
        this.precioPantalonIndividual = precioPantalonIndividual;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public double getCostoTelaMetro() {
        return costoTelaMetro;
    }

    public void setCostoTelaMetro(double costoTelaMetro) {
        this.costoTelaMetro = costoTelaMetro;
    }

}