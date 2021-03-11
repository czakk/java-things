package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {

        JFrame  window = new JFrame("C -> F");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setLocationRelativeTo(null);
        window.setLayout(null);


        JLabel ask = new JLabel("Podaj stopnie Celsjusza");
        ask.setBounds(70,12,150,50);
        window.add(ask);

        JTextField cel = new JTextField();
        cel.setBounds(90, 50, 100, 30);
        window.add(cel);

        JLabel add = new JLabel("Wynik");
        add.setBounds(100, 120, 200, 30);
        window.add(add);

        JButton button = new JButton("Oblicz");
        button.setBounds(90, 90, 100, 30);
        window.add(button);


       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String degrees = cel.getText();

               double fahrenheit = (Integer.parseInt(degrees) * 1.8) + 32;
               add.setText("F: "+ fahrenheit);
           }
       });

        window.setVisible(true);
    }
}
