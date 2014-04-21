/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamen.escritorio;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

/**
 *
 * @author davidjgc
 */
public class Principal extends JFrame {

    public Principal() {

        this.setSize(700, 500);
        this.setLocation(300, 100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        loadPanel(new PanelFrecuencias());

    }

    private void loadPanel(JPanel njp) {

        JPanel jp = (JPanel) getContentPane();

        JScrollPane sp = new JScrollPane(njp);
        jp.add(sp, BorderLayout.CENTER);
        this.setContentPane(jp);

    }

}
