import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        int pares = 0, impares = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 12 numeros enteros:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            if (numeros[i] % 2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
        sc.close();
    }
}