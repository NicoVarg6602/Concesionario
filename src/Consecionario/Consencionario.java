package Consecionario;

import Personal.Cliente;
import Personal.Empleado;
import Servicios.Mantenimiento;
import Servicios.MotoVenta;
import Servicios.Repuesto;
import java.util.ArrayList;
import java.util.Scanner;

public class Consencionario {

    static int opcion;
    static String nombre;
    static String nombreM;
    static String apellido;
    static int identificacion;
    static String area;
    static int salario;
    static int antiguedad;
    static String medioDeCompra;
    static int numeroCliente;
    static String modelo;
    static int cilindraje;
    static String proposito;
    static int valor;
    static String color;
    static int matricula;
    static String motivo;
    static int km;
    static boolean manteniminetoPreventivo;
    static boolean mantenimientoCorrectivo;
    static int valorM;
    static String tipo;
    static String nombreRepuesto;
    static int valorR;

    static Cliente cliente;
    static Empleado empleado;
    static Mantenimiento mantenimiento;
    static MotoVenta motoVenta;
    static Repuesto repuesto;

    
 

    public static void main(String[] args) {

        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<MotoVenta> motoVentas = new ArrayList<>();
        ArrayList<Mantenimiento> mantenimiento = new ArrayList<>();
        ArrayList<Repuesto> repuesto = new ArrayList<>();
        
         Scanner entrada = new Scanner(System.in);
        

    
        do {
            System.out.println("--BIENVENIDO A MOTOS-NICO--");
        System.out.println("1. Compra de moto");
        System.out.println("2. Agregar mantenimiento");
        System.out.println("3. Comprar repuestos");
        System.out.println("4. Factura");
        System.out.println("5. Salir");

        System.out.println("selecione una opcion: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                entrada.nextLine();
                System.out.println("--COMPRA DE MOTO--");
                System.out.println("Nombre: ");
                nombreM = entrada.nextLine();
                System.out.println("Modelo: ");
                modelo = entrada.nextLine();
                System.out.println("Cilindraje: ");
                cilindraje = entrada.nextInt();
                System.out.println("Proposito: ");
                proposito = entrada.nextLine();
                System.out.println("Valor: ");
                valor = entrada.nextInt();
                System.out.println("Color: ");
                color = entrada.nextLine();
                System.out.println("Matricula: ");
                matricula = entrada.nextInt();
                motoVentas.add(new MotoVenta(nombreM, modelo, cilindraje, proposito, valor, color, matricula));

                //-----------//
                entrada.nextLine();
                System.out.println("--CLIENTE--");
                System.out.println("Nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Apellido: ");
                apellido = entrada.nextLine();
                System.out.println("identificacion: ");
                identificacion = entrada.nextInt();
                System.out.println("Medio de compra:");
                medioDeCompra = entrada.nextLine();
                System.out.println("Numero del cliente: ");
                numeroCliente = entrada.nextInt();
                Cliente.add(new Cliente(nombre, apellido, identificacion, medioDeCompra, numeroCliente));
                System.out.println("  ");
                break;
            case 2:
                System.out.println("--MANTENIMIENTO--");
                System.out.println("Motivo: ");
                motivo = entrada.nextLine();
                System.out.println("Kilometraje: ");
                km = entrada.nextInt();
                System.out.println("Mantenimiento Preventivo: ");
                manteniminetoPreventivo = entrada.nextBoolean();
                System.out.println("Mantenimiento Correctivo: ");
                mantenimientoCorrectivo = entrada.nextBoolean();
                System.out.println("Valor del mantenimineto: ");
                valorM = entrada.nextInt();

                Mantenimiento.add(new Mantenimiento(motivo, km, manteniminetoPreventivo, mantenimientoCorrectivo, valorM));

                entrada.nextLine();
                System.out.println("--CLIENTE--");
                System.out.println("Nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Apellido: ");
                apellido = entrada.nextLine();
                System.out.println("identificacion: ");
                identificacion = entrada.nextInt();
                System.out.println("Medio de compra:");
                medioDeCompra = entrada.nextLine();
                System.out.println("Numero del cliente: ");
                numeroCliente = entrada.nextInt();
                Cliente.add(new Cliente(nombre, apellido, identificacion, medioDeCompra, numeroCliente));

               
                System.out.println(" ");
                break;

            case 3:
                System.out.println("--REPUESTO--");
                System.out.println("Tipo de rpuesto: ");
                tipo = entrada.nextLine();
                System.out.println("Nombre del repuesto: ");
                nombreRepuesto = entrada.nextLine();
                System.out.println("Valor del repuesto: ");
                valorR = entrada.nextInt();
                Repuesto.add(new Repuesto(tipo, nombreRepuesto, valorR));

                entrada.nextLine();
                System.out.println("--CLIENTE--");
                System.out.println("Nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Apellido: ");
                apellido = entrada.nextLine();
                System.out.println("identificacion: ");
                identificacion = entrada.nextInt();
                System.out.println("Medio de compra:");
                medioDeCompra = entrada.nextLine();
                System.out.println("Numero del cliente: ");
                numeroCliente = entrada.nextInt();
                Cliente.add(new Cliente(nombre, apellido, identificacion, medioDeCompra, numeroCliente));

               
                System.out.println(" ");
                break;
            case 4:
                Empleado em1 = new Empleado("Juan", "Espitia", 123, "Acesor comercial", 1000, 2);
                MotoVenta mV1 = new MotoVenta("Nkd", "2024", 125, "calle", 1410, "negro-mate", 9856);
                Cliente cl1 = new Cliente("Karol", "Peña", 0122, "Fisico-tarjeta", 01);
                System.out.println("\n");

                //Mantenimiento
                Empleado em2 = new Empleado("Felipe", "Espitia", 987, "Mantenimineto", 2500, 10);
                Mantenimiento mt1 = new Mantenimiento("Cambio de aceite", 500, true, false, 200);
                Cliente cl2 = new Cliente("Tatiana", "Vargas", 456, "Virual", 02);
                System.out.println("\n");
                Empleado em3 = new Empleado("Raul", "Epitia", 988, "Mantenimineto", 2500, 8);
                Mantenimiento mt2 = new Mantenimiento("Cambio de valvulas", 5000, false, true, 800);
                Cliente cl3 = new Cliente("Nelly", "Ruiz", 753, "Presencial", 03);
                System.out.println("\n");

                //Repuesto
                Empleado em4 = new Empleado("Juan", "Espitia", 123, "Acesor comercial", 1000, 2);
                Repuesto r1 = new Repuesto("Mecanico", "Guaya acelerador", 30);
                Cliente cl4 = new Cliente("Miguel", "Forero", 951, "presencial-efectivo", 04);
                System.out.println("\n");

                break;
            case 5:
                System.out.println("--SALIR--");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion invalida");
        }

    } while (true);
    }
}
