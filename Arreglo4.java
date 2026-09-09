package Arreglos;
import java.util.Scanner;

public class Arreglo4 {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero a buscar: ");
        int num = sc.nextInt();
        if (buscarNumero(numeros, num)) {
            System.out.println("El numero " + num + " si se encuentra");
        } else {
            System.out.println("El numero " + num + " no se encuentra");
        }
    }
    public static boolean buscarNumero(int[] arreglo, int buscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == buscar) {
                return true; 
            }
        }
        return false; 
    }
}