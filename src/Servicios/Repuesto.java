package Servicios;

import Personal.Cliente;




public class Repuesto{

    public static void add(Repuesto repuesto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void addCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String tipo;
    public String nombreRepuesto;
    public int valorR;

    public Repuesto(String tipo, String nombreRepuesto, int valorR) {
        this.tipo = tipo;
        this.nombreRepuesto = nombreRepuesto;
        this.valorR = valorR;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public int getValorR() {
        return valorR;
    }

    public void setValorR(int valorR) {
        this.valorR = valorR;
    }
    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("--REPUESTO--");
        sb.append("Tipo de repuesto: ").append(tipo).append("\n");
        sb.append("Nombre de repuesto: ").append(nombreRepuesto).append("\n");
        sb.append("Valor de Repuesto: ").append(valorR).append("\n");
        return sb.toString();
    }
}
