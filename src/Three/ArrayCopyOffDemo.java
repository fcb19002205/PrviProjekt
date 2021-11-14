package Three;

import java.util.Arrays;

public class ArrayCopyOffDemo {
    public static void main(String[] args) {
        char[] slova = {'d', 'e', 'c', 'a', 'f', 'f', 'e'};
        char[] odredišniNiz = Arrays.copyOfRange(slova, 0, 4);
        String text = new String(odredišniNiz);
        System.out.println(odredišniNiz);
    }
}
