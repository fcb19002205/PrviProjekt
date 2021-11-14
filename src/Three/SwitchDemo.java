package Three;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj dana u tjednu");
        int brojDanaUSedmici = new Scanner(System.in).nextInt();
        switch (brojDanaUSedmici) {
            case 1:
                System.out.println("Ponedjeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Srijeda");
                break;
            case 4:
                System.out.println("Četvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedjelja");
                break;
            default:
                System.out.println("Netočan broj dana u tjednu");
        }
    }
}

