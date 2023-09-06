package Personal;

import ClasesPadres.Persona;

public class Empleado extends Persona {
    public String area;
    public int salario;
    public int antiguedad;

    public Empleado( String nombre, String apellido, int identificacion, String area, int salario,int antiguedad) {
        super(nombre, apellido, identificacion);
        this.area = area;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--Empleado--").append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("Apellido: ").append(getApellido()).append("\n");
        sb.append("Identificacion: ").append(getIdentificacion()).append("\n");
        sb.append("Area: ").append(area).append("\n");
        sb.append("Salario: ").append(salario).append("\n");
        sb.append("Antiguedad: ").append(antiguedad).append("\n");
        return sb.toString();
    }

    
    
}
