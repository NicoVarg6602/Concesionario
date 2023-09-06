package Personal;

import ClasesPadres.Persona;



public class Cliente extends Persona {

    public static void add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   public String medioDeCompra;
   public int numeroCliente;
  

    public Cliente( String nombre, String apellido, int identificacion,String medioDeCompra, int numeroCliente) {
        super(nombre, apellido, identificacion);
        this.medioDeCompra = medioDeCompra;
        this.numeroCliente = numeroCliente;
    }

    public String getMedioDeCompra() {
        return medioDeCompra;
    }

    public void setMedioDeCompra(String medioDeCompra) {
        this.medioDeCompra = medioDeCompra;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
   
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("--Cliente--").append("\n");
    sb.append("Nombre: ").append(getNombre()).append("\n");
    sb.append("Apellido: ").append(getApellido()).append("\n");
    sb.append("Identificacion: ").append(getIdentificacion()).append("\n");
    sb.append("Medio de compra: ").append(medioDeCompra).append("\n");
    sb.append("Numero de Cliente: ").append(numeroCliente).append("\n");
    return sb.toString();
    }

    public Cliente get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
