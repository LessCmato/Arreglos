package Arreglos;

public class Arreglo3 {
public static void main(String[] args) {
    int[] numeros = {1,9,5,4,7,2,6,3};
    int mayor = numeros[0];
    for(int i = 1; i < numeros.length; i++){
        if (numeros[i]> mayor) {
            mayor = numeros[i];
        }
    }
    System.out.println("el arreglo es: "+ java.util.Arrays.toString(numeros));
    System.out.println("el numero mayor es: " + mayor);
 } 
}