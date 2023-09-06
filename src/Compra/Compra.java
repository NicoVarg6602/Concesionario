package Compra;
import java.time.LocalDateTime;


public class Compra {
    public LocalDateTime fecha;
    public int idCompra;
    public String tipoDeCompra;
    public String medioDePago;
    public int total;

    public Compra(LocalDateTime fecha, int idCompra, String tipoDeCompra, String medioDePago, int total) {
        this.fecha = LocalDateTime.now();
        this.idCompra = idCompra;
        this.tipoDeCompra = tipoDeCompra;
        this.medioDePago = medioDePago;
         this.total = total;
    }

    public Compra(int anio, int mes, int dia, int hora, int minuto, int idCompra, String tipoDeCompra, String medioDePago, int total) {
        this.fecha = LocalDateTime.of(anio, mes, dia, hora, minuto);
        this.idCompra = idCompra;
        this.tipoDeCompra = tipoDeCompra;
        this.medioDePago = medioDePago;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getTipoDeCompra() {
        return tipoDeCompra;
    }

    public void setTipoDeCompra(String tipoDeCompra) {
        this.tipoDeCompra = tipoDeCompra;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--COMPRA--").append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Id Compra: ").append(tipoDeCompra).append("\n");
        sb.append("Medio de pago:").append(medioDePago).append("\n");
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}
