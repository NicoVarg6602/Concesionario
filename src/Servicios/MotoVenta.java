package Servicios;

import ClasesPadres.Moto;
import Personal.Cliente;

public class MotoVenta extends Moto{

    
    public String color;
    public int matricula;
   
   
            

    public MotoVenta( String nombre, String modelo, int cilindraje, String proposito, int valor,String color, int matricula) {
        super(nombre, modelo, cilindraje, proposito, valor);
        this.color = color;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--MOTO DE VENTA--").append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("Matricula: ").append(matricula).append("\n");
        sb.append("Nombre:").append(getNombre()).append("\n");
        sb.append("Modelo: ").append(getModelo()).append("\n");
        sb.append("Cilindraje: ").append(getCilindraje()).append("\n");
        sb.append("Proposito: ").append(getProposito()).append("\n");
        sb.append("Valor: ").append(getValor()).append("\n");
        return toString();
    }

    public MotoVenta get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
