package seven;

import java.util.Random;

public class SeasonTest {
    public static void main(String[] args) {
//        Random random = new Random();
//        for (; ; ) {
//            System.out.println("Slučajan broj " + random.nextInt(10));
//        }


        Season season = Season.Spring;
        switch (season){
            case Spring:
                System.out.println("Proljeće");
                break;
            case Summer:
                System.out.println("Ljeto");
                break;
            case Autumn:
                System.out.println("Jesen");
                break;
            case Winter:
                System.out.println("Zima");
                break;
            default:
                break;
        }

    }
}
