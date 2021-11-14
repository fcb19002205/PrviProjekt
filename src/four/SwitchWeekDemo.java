package four;

import javax.swing.*;

public class SwitchWeekDemo {
    public static void main(String[] args) {
        String imeDana = JOptionPane.showInputDialog("Unesi ime dana na Engleskom");
        int brojDana = 0;
        switch (imeDana) {
            case "Monday":
                brojDana = 1;
                break;
            case "Thuesday":
                brojDana = 2;
                break;
            case "Wendesday":
                brojDana = 3;
                break;
            case "Thursday":
                brojDana = 4;
                break;
            case "Friday":
                brojDana = 5;
                break;
            case "Saturday":
                brojDana = 6;
                break;
            case "Sunday":
                brojDana = 7;
                break;
            default:
                System.out.println("You have to learn how much week has a days");
        }
        JOptionPane.showMessageDialog(null, imeDana + " u sedmici je " + brojDana + ". po redu");
    }
}
