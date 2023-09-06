
package Servicios;

import ClasesPadres.Moto;
import Personal.Cliente;

public class Mantenimiento {

    public static void add(Mantenimiento mantenimiento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void addCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public String motivo;
    public int km;
    public boolean manteniminetoPreventivo;
    public boolean mantenimientoCorrectivo;
    public int valorM;

    public Mantenimiento(String motivo, int km, boolean manteniminetoPreventivo, boolean mantenimientoCorrectivo, int valorM) {
        
        this.motivo = motivo;
        this.km = km;
        this.manteniminetoPreventivo = manteniminetoPreventivo;
        this.mantenimientoCorrectivo = mantenimientoCorrectivo;
        this.valorM = valorM;
    }

  

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isManteniminetoPreventivo() {
        return manteniminetoPreventivo;
    }

    public void setManteniminetoPreventivo(boolean manteniminetoPreventivo) {
        this.manteniminetoPreventivo = manteniminetoPreventivo;
    }

    public boolean isMatenimientoCorrectivo() {
        return mantenimientoCorrectivo;
    }

    public void setMatenimientoCorrectivo(boolean matenimientoCorrectivo) {
        this.mantenimientoCorrectivo = matenimientoCorrectivo;
    }

    public int getValorM() {
        return valorM;
    }

    public void setValorM(int valorM) {
        this.valorM = valorM;
    }
     public String toString(){
        StringBuilder sb =new StringBuilder ();
        sb.append("--MANTENIMINETO--");
        sb.append("Motivo: ").append(motivo).append("\n");
        sb.append("Km: ").append(km).append("\n");
        sb.append("Mantenimineto Preventivo: ").append(manteniminetoPreventivo).append("\n");
        sb.append("Mantenimineto Correctivo: ").append(mantenimientoCorrectivo).append("\n");
        return sb.toString();
     } 
    
    
}
