package Three;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println("Unesi prvi broj");
        numbers[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        numbers[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi treći broj");
        numbers[2] = new Scanner(System.in).nextInt();
        System.out.println("Tvoj niz je: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        //ili

        int[] drugiNiz = {23, 13, 133};
    }
}
