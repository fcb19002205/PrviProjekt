package two;

/**
 * Staticcaly typed:
 * Tipovi podataka
 * <li>1. Prosti</li>
 * <li>2. SLoženi</li>
 *
 * <p>Prosti
 * <li>1. byte</li> -128 0 127
 * <li>2. short</li> -32 768 0 32767
 * <li>2. int</li>
 * <li>4. long</li>
 * <li>5. float</li> //32 bitni
 * <li>6. double</li>//64 bitni
 * <li>7. char</li>  'r'
 * <li>8. boolean</li> true ili false
 * </p>
 *
 * TIP varijablom - podatak;
 */
public class SecondExecutor {
    public static void main(String[] args) {
        //tip varijabla - podatak;
        byte firstNumber = 127;//8-bitni
        short secondNumber = 32_767;//16-bitni
        int thirdNumber = 55000;//32-bitni podrazumijeva
        long fourthNumber = 55000L; //32 -> 64

        int intNumber = 32000;
        long lonNumber = intNumber;//automatski

        //tip varijabla = podatak

        float floatNumber = 2.3F;
        double doubleNumber = 2.3f;
        double decimalNumber = 1.234e2;
        double decimalNumber2 = 123.4;
        System.out.println(decimalNumber);
        System.out.println(decimalNumber2);

        System.out.println();

        int specijalniBroj = 26;//dekadni
        System.out.println(specijalniBroj);
        int specijalniBroj2 = 0x1a;//hex
        System.out.println(specijalniBroj2);
        int specijalniBroj3 = 0b11010;//binearni
        System.out.println(specijalniBroj3);

        //char -> jednostruki navodi
        char charVariable = 'a';
        char charVar = 87;
        System.out.println(charVar);
        int intNumber3 = charVariable;
        System.out.println(intNumber3);

        //boolean
        boolean condition = true;
        System.out.println(condition);

    }
}
