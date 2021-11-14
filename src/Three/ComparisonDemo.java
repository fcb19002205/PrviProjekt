package Three;

import java.util.Scanner;

/**
 * TIP VARIJABLA = vrijednost
 * <p>
 *     Operatori poređenja
 * </p>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi cijeli broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi cijeli broj: ");
        int number2 = new Scanner(System.in).nextInt();
        //Operator jednakosti
        if (number1 == number2){
            System.out.println("Unio si dva jednaka broja");
        }
        if (number1 !=number2) {
            System.out.println("Unijeli ste dva nejednaka broja");
        }
        if (number1 > number2){
            System.out.println("Prvi broj je veći od drugog");
        }
        if (number1 >= number2){
            System.out.println("Prvi broj je veći ili jednak od drugog");
        }
        if (number1 < number2) {
            System.out.println("Prvi broj je manji od drugog");
        }
        if (number1 <= number2){
            System.out.println("Prvi broj je manji ili jednak od drugog");
        }
    }
}
