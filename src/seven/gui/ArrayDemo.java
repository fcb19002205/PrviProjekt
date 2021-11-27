package seven.gui;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<String>dynamicNames= new ArrayList<>();
        dynamicNames.add("Tadej");
        dynamicNames.add("Igor");
        dynamicNames.add("Gregor");
        dynamicNames.add("Mira");

        System.out.println(dynamicNames.get(0));
    }
}
