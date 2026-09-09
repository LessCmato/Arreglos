package Arreglos;

public class Arreglo5 {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("el numero es par: " + numeros[i]);
                contadorPares++;
            } else {
                System.out.println("el numero es impar: " + numeros[i]);
                contadorImpares++;
            }
        }

        System.out.println("\nTotal de numeros pares: " + contadorPares);
        System.out.println("Total de numeros impares: " + contadorImpares);
    }
}