package Arreglos;
public class Arreglos2 {
    public static void main(String[] args) {
    int[] num = {9, 7, 3, 5, 8};
    int suma = 0;
    for (int i = 0; i < num.length; i++) {
        suma += num[i];
    }
    System.out.println("la suma de los elementos es: " + suma);
    System.out.println("el promedio es: " + (double)suma / num.length);
 }
}
