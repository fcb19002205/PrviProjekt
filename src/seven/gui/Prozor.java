package seven.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * 1.Kontejner
 * 2. Komponente UI Cotrloe
 * 3. Layout manageri
 */

public class Prozor {
    private JFrame frame;
    private JTextField textField;
    private JButton addButton;
    private JButton printButton;
    private ArrayList<String> names = new ArrayList<>();

    public Prozor(){
        this.frame = new JFrame("Prozor u Java Svijet");
        this.textField = new JTextField("Unesi ime: ");
        this.addButton = new JButton("Dodaj");
        DodajListener dodajListener = new DodajListener(this);
        this.addButton.addActionListener(dodajListener);
        PrintListener printListener = new PrintListener(this);
        this.printButton = new JButton("Print");
        this.printButton.addActionListener(printListener);

        Container container = frame.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(textField);
        container.add(addButton, BorderLayout.CENTER);
        container.add(printButton, BorderLayout.CENTER);
    }

    public void dodaj(){
        String text = textField.getText();
        names.add(text);
        textField.setText("");
    }

    public void print(){
        for (int i = 0; i<names.size(); i++){
            String name = names.get(i);
            System.out.println(names);
        }
    }

    public void setDimension(int width, int high){
        frame.setSize(width, high);
    }

    public void show (){
        frame.setVisible(true);
    }

}
