package two;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unosi broj 1:");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi broj 2: ");
        int broj2 = new Scanner(System.in).nextInt();

        if (broj1 == broj2) {
            System.out.println("Isti su uneseni brojevi");
        }
        if (broj1 != broj2) {
            System.out.println("Različiti su uneseni brojevi");
        }
    }
}
