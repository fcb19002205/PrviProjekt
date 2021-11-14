package four;

import javax.swing.*;

public class SwitchDemo {
    public static void main(String[] args) {
        //Ime dana u tjednu na engleskom
        /**
         * Prosti tip podataka
         * Omotači
         * <li> 1. int -> Integer ... itd
         * <li> 2. short -> Short ...
         */
        String brojDanaText = JOptionPane.showInputDialog("Unesi broj dana u tjednu");
        //"2" -> 2
        int brojDana = Integer.parseInt(brojDanaText);// "2" -> 2
        String imeDana = null;
        //kontrolirati tok izvršavanja koda
        switch (brojDana) {
            case 1:
                imeDana = "Monday";
                break;
            case 2:
                imeDana = "Thuesday";
                break;
            case 3:
                imeDana = "Wendesday";
                break;
            case 4:
                imeDana = "Thursday";
                break;
            case 5:
                imeDana = "Friday";
                break;
            case 6:
                imeDana = "Saturday";
                break;
            case 7:
                imeDana = "Sunday";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tjedan ima 7 dana, zato i je tjedan");
        }

        if (imeDana != null)
            JOptionPane.showMessageDialog(null, "Day " + imeDana);
            System.out.println("You don't speak English" + imeDana);
    }
}
