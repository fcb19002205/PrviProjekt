package two;

/**
 * operatori;
 * <li>1. Dodjele</li>
 * <li>2. Aritmetički operatori</li>
 * <li>3. Unardni operatori</li>
 *
 * + -> Additive
 * - -> Subtraction
 * * -> Multiplication
 * / -> Division
 * $ -> Modulo
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        int broj2 = 13;
        //Addition Zbrajanje
        int result = broj1 + broj2;//36
        System.out.println("Suma: "+ result);//SUma: 36
        //Substraction
        result = result -3; //33
        System.out.println("Oduzimanje: " + result);//ODuzimanje: 33
        //Multiplication
        result = result*2;
        System.out.println("Množenje: " + result);//33*2=66

        //Division
        result = result/3;
        System.out.println("Dijeljenje: " + result);

        //Modulo
        result = result%7;//22/7=3 ostatak 1 -> rezultat 1
        System.out.println("Modulo result: " + result);

        char singleChar = 'W';
        String ime = "John";
        String prezime = "Doe";



    }
}
