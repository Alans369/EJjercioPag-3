import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingrese ID del producto: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            System.out.print("Ingrese nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese marca del producto: ");
            String marca = sc.nextLine();

            System.out.print("Ingrese precio del producto: ");
            double precio = sc.nextDouble();
            sc.nextLine(); // Limpiar buffer

            productos.add(new Producto(id, nombre, marca, precio));

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nProductos registrados:");
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}