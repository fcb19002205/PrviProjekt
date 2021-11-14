package Three;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] slova = {'d', 'e', 'c', 'a', 'f', 'f', 'e'};
        char[] odredišniNiz = new char[4];
        System.arraycopy(slova, 0, odredišniNiz, 0, odredišniNiz.length);
        String text = new String(odredišniNiz);
        System.out.println(text);
    }
}
