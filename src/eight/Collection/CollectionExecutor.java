package eight.Collection;

import java.util.ArrayList;

public class CollectionExecutor {
    public static void main(String[] args) {
        //svi unutar niza su tipa Person
        String[] personArray = new String[3];
        personArray[0] = "Tadej";
        personArray[1] = "Igor";
        personArray[2] = "Mira";
        for (String name: personArray){
            System.out.println(name);
        }
        System.out.println(". . . . . . . . .");
        //svi unutar objekta personArrayList su kojeg tipa Person
        ArrayList<String> personArrayList =new ArrayList<>();
        personArrayList.add("Tadej");
        personArrayList.add("Igor");
        personArrayList.add("Mira");
        personArrayList.add("Gregor");
        personArrayList.add("Argo");

        for (String name: personArrayList){
            System.out.println(name);
        }
    }
}
