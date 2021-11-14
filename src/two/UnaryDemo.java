package two;

/**
 * Unarni operatori:
 * <li> +</li>
 * <li> -</li>
 * <li ++></li> pre i post
 * <li> --</li> pre i post
 * <li>operator negacije</li>
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        System.out.println("Broj 1 sa +: " + broj1);
        broj1 = -broj1;
        System.out.println("broj 1 sa -: " + broj1);
        broj1 = 23;
        broj1++;
        System.out.println("Post increment: " + broj1);
        broj1 = 23;
        ++broj1;
        System.out.println("Pre increment: " + broj1);
        //
        broj1 = 23;
        System.out.println(broj1++);

        broj1 = 23;
        System.out.println(++broj1);
        System.out.println(broj1);

        //post dekrement
        broj1 = 23;
        System.out.println(broj1--);
        System.out.println(broj1);

        broj1 = 23;
        System.out.println(--broj1);
        System.out.println(broj1);

        boolean lav = false;
        System.out.println(!lav);
    }
}
