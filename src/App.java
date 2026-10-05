import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a calcular ");
        System.out.println("SOLO NUMEROS ENTEROS");
        int num = leer.nextInt();
        int[] numeros = new int[num];
        System.out.println("Introduce los " + num + " números:");
        for (int i = 0; i < num; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }
         int mayor = numeros[0];
        for (int i = 1; i < num; i++) {
        if (numeros[i] > mayor) {
                mayor = numeros[i];
            }}
        System.out.println("El número mayor es: " + mayor);
        leer.close();
    }
}
