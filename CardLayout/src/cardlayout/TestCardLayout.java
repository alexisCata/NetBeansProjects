/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardlayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestCardLayout extends JFrame {

    public static void main(String[] args) {
        TestCardLayout frame = new TestCardLayout();
        Container container = frame.getContentPane();
        JButton s1 = new JButton("1");
        JButton s2 = new JButton("2");
        JButton s3 = new JButton("3");
        JButton s4 = new JButton("4");
        container.add(s1, BorderLayout.NORTH);
        container.add(s2, BorderLayout.SOUTH);
        container.add(s3, BorderLayout.WEST);
        container.add(s4, BorderLayout.EAST);

        JLabel label1 = new JLabel("Componente 1");
        JLabel label2 = new JLabel("Componente 2");
        JLabel label3 = new JLabel("Componente 3");
        JLabel label4 = new JLabel("Componente 4");

        final JPanel panelComponentes = new JPanel();
        final CardLayout layout = new CardLayout();
        panelComponentes.setLayout(layout);
        panelComponentes.add(label1, "1");
        panelComponentes.add(label2, "2");
        panelComponentes.add(label3, "3");
        panelComponentes.add(label4, "4");
        container.add(panelComponentes, BorderLayout.CENTER);
        s1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //layout.next(panelComponentes);
                layout.show(panelComponentes, "1");
            }

        });

        s2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //layout.next(panelComponentes);
                layout.show(panelComponentes, "2");
            }

        });

        s3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //layout.next(panelComponentes);
                layout.show(panelComponentes, "3");
            }

        });

        s4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //layout.next(panelComponentes);
                layout.show(panelComponentes, "4");
            }

        });

        frame.setSize(400, 300);
        frame.setTitle("Prueba de BorderLayoutLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
