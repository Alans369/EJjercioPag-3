import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[12];
         int pares = 0, impares = 0;
         Scanner sc = new Scanner(System.in);

         for (int i = 0; i < numeros.length; i++) {
             System.out.print("Ingrese el número " + (i + 1) + ": ");
             numeros[i] = sc.nextInt();
         }


         
         for (int num : numeros) {
             if (num % 2 == 0) {
                 pares++;
             } else {
                 impares++;
             }
         }

         System.out.println("Cantidad de números pares: " + pares);
         System.out.println("Cantidad de números impares: " + impares);


         
     }
    
}
