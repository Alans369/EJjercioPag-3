import java.time.LocalDate; // Importa la clase LocalDate para trabajar con fechas.

public class FechasYMatematicas {

    public static void main(String[] args) {

         System.out.println("--- Demostración de LocalDate ---");

        // Obtener la fecha actual
        LocalDate hoy = LocalDate.now(); // Crea un objeto LocalDate con la fecha de hoy.
        System.out.println("Hoy es: " + hoy);

        // Crear una fecha específica
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15); // Crea una fecha para el 15 de mayo de 1990.
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);


        LocalDate haceUnMes = hoy.minusMonths(1); // Resta un mes a la fecha actual.
        System.out.println("Hace un mes fue: " + haceUnMes);

        
       
        

        // --- Uso de Math ---
        System.out.println("\n--- Demostración de Math ---");

        double numero1 = 10.7;
        double numero2 = 4.3;

        // Redondear un número
        long redondeado = Math.round(numero1); // Redondea al entero más cercano (11).
        System.out.println("Redondeo de " + numero1 + ": " + redondeado);

        // Valor absoluto
        double absoluto = Math.abs(-5.8); // Devuelve el valor positivo (5.8).
        System.out.println("Valor absoluto de -5.8: " + absoluto);

        // Potencia
        double potencia = Math.pow(2, 3); // Calcula 2 elevado a la 3 (8.0).
        System.out.println("2 elevado a la 3: " + potencia);

        // Raíz cuadrada
        double raizCuadrada = Math.sqrt(25); // Calcula la raíz cuadrada de 25 (5.0).
        System.out.println("Raíz cuadrada de 25: " + raizCuadrada);

        // Máximo y mínimo
        double maximo = Math.max(numero1, numero2); // Devuelve el número más grande (10.7).
        System.out.println("Máximo entre " + numero1 + " y " + numero2 + ": " + maximo);

        double minimo = Math.min(numero1, numero2); // Devuelve el número más pequeño (4.3).
        System.out.println("Mínimo entre " + numero1 + " y " + numero2 + ": " + minimo);

        // Generar un número aleatorio
        double aleatorio = Math.random(); // Genera un número entre 0.0 (inclusive) y 1.0 (exclusive).
        System.out.println("Número aleatorio: " + aleatorio);
    }
}