package Vježba;

import java.util.Scanner;

public class VježbaMnoženje {
    public static void main(String[] args) {
        int tableSize = 3;
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {
        // Vodoravni stupac
        System.out.println("   *********************************");
        System.out.format("   #  ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%10d",i);
        }
        System.out.println();
        System.out.println("   *********************************");

        for(int i = 1 ;i<=10;i++) {
            // Okomiti stupac
            System.out.format("%4d |", i);
            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%10d", i * j);
            }
            System.out.println();
        }

    }

    ;
}
