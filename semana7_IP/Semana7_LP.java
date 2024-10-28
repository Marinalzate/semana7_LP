import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Opciones:");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Eliminar artículo");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después de leer un entero

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del artículo: ");
                String articulo = scanner.nextLine();
                listaCompras.add(articulo);
                System.out.println("Artículo agregado: " + articulo);
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del artículo a eliminar: ");
                String articuloEliminar = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < listaCompras.size(); i++) {
                    if (listaCompras.get(i).equalsIgnoreCase(articuloEliminar)) {
                        listaCompras.remove(i);
                        System.out.println("Artículo eliminado: " + articuloEliminar);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Artículo no encontrado.");
                }
            } else if (opcion == 3) {
                System.out.println("Lista de compras:");
                if (listaCompras.isEmpty()) {
                    System.out.println("La lista está vacía.");
                } else {
                    for (String articulo : listaCompras) {
                        System.out.println("- " + articulo);
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Gracias por su compra!");
                break;
            } else {
                System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }

        scanner.close();
    }
}
