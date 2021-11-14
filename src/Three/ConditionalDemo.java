package Three;

import java.util.Scanner;

/**
 * Uslovni operatori
 * <li> && AND </li>
 *
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        if ((number2 == 1) && (number1 == 23)){
            System.out.println("Unio si za prvi broj vrijednost 23, a za drugi broj 1");
        }
        if ((number1 == 1) || (number2++ == 23));{
            System.out.println("Juhuuu");
        }
        System.out.println("Broj 2: " + number2);

    }
}
