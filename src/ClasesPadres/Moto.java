package ClasesPadres;


public abstract class Moto {
    public String nombreM;
    public String modelo;
    public int cilindraje;
    public String proposito;
    public int valor;

    public Moto(String nombreM, String modelo, int cilindraje, String proposito, int valor) {
        this.nombreM = nombreM;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.proposito = proposito;
        this.valor = valor;
    }

    public String getNombre() {
        return nombreM;
    }

    public void setNombre(String nombre) {
        this.nombreM = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public abstract String toString();
}
