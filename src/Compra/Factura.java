
package Compra;

import java.time.LocalDateTime;


public class Factura extends Compra{
    
    public String detallesDeCompra;

    public Factura(LocalDateTime fecha, int idCompra, String tipoDeCompra, String medioDePago, int total, String detallesDeCompra) {
        super(fecha, idCompra, tipoDeCompra, medioDePago, total);
        this.detallesDeCompra = detallesDeCompra;
    }

    public Factura(int anio, int mes, int dia, int hora, int minuto, int idCompra, String tipoDeCompra, String medioDePago, int total, String detallesDeCompra) {
        super(anio, mes, dia, hora, minuto, idCompra, tipoDeCompra, medioDePago, total);
         this.detallesDeCompra = detallesDeCompra;
    }

    public String getDetallesDeCompra() {
        return detallesDeCompra;
    }

    public void setDetallesDeCompra(String detallesDeCompra) {
        this.detallesDeCompra = detallesDeCompra;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--FACTURA--").append("\n");
        sb.append("Fecha: ").append(getFecha()).append("\n");
        sb.append("Id compra: ").append(getIdCompra()).append("\n");
        sb.append("Tipo de Compra: ").append(getTipoDeCompra()).append("\n");
        sb.append("Medio de Pago: ").append(getMedioDePago()).append("\n");
        sb.append("Total: ").append(getTotal()).append("\n");
        sb.append("Detalle de compra: ").append(detallesDeCompra).append("\n");
        return sb.toString();
    }
    
}
