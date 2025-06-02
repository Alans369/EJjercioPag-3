import java.util.ArrayList; // Importa la clase ArrayList para usar listas dinámicas.
import java.util.HashMap;   // Importa la clase HashMap para usar mapas clave-valor.
import java.util.Map;     // Importa la interfaz Map (opcional, pero buena práctica para tipos genéricos).
import java.util.Iterator;

public class AlgoritmoConColecciones {

    public static void main(String[] args) {

        // --- Uso de ArrayList ---
        // Un ArrayList es una lista dinámica que puede crecer o encogerse.
        // Es útil cuando necesitas una colección ordenada de elementos y acceso por índice.

        System.out.println("--- Demostración de ArrayList ---");
        ArrayList<String> nombres = new ArrayList<>(); // Declara e inicializa un ArrayList de Strings.

        // Agregando elementos al ArrayList
        nombres.add("Ana");
        nombres.add("Luis");   
        nombres.add("María");  
        nombres.add("Pedro");  

        System.out.println("Nombres en la lista: " + nombres);

          Iterator<String> it = nombres.iterator();


        while(it.hasNext()) {
            System.out.println(it.next());
            }
        HashMap<Integer, String> estudiantes = new HashMap<>(); // Declara e inicializa un HashMap.
                                                              // La clave es Integer (ID de estudiante) y el valor es String (nombre).

        // Agregando elementos al HashMap
        estudiantes.put(101, "Carlos Gómez"); // Agrega un par clave-valor: 101 -> "Carlos Gómez".
        estudiantes.put(102, "Elena Ruiz");   // Agrega otro par: 102 -> "Elena Ruiz".
        estudiantes.put(103, "Sofía Vargas"); // Agrega otro par: 103 -> "Sofía Vargas".
        estudiantes.put(101, "Carlos Pérez"); // Si la clave ya existe, el valor se actualiza.
                                             // Ahora 101 -> "Carlos Pérez".

    for ( Integer i : estudiantes.keySet()) {
      System.out.println(i);
    }

      for ( Integer i : estudiantes.keySet()) {
         System.out.println("key: " + i + " value: " + estudiantes.get(i));
}



        
    }
}
