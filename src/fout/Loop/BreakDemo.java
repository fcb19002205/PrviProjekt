package fout.Loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] nizBrojeva = {23, 14, 123, 56, 76, 4567, 34};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesite neki cijeli broj");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean foundit = false;
        for (int number : nizBrojeva) {
            if (uneseniBroj == number) {
                foundit = true;
                JOptionPane.showMessageDialog(null, "BINGO");
                break;
            }
        }
        if (foundit) {
            JOptionPane.showMessageDialog(null, "BINGO");
        } else {
            JOptionPane.showMessageDialog(null, "KRIVI BROJ,NEMA USPJEHA");

        }
    }
}
