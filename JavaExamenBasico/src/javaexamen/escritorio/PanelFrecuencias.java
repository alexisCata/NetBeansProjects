/*
 * Se quiere definir una clase que permita controlar un sintonizador digital de 
 * emisoras FM, lo que se desea es dotar a la aplicacion de escritorio de una 
 * interfaz que permita subir (up) o bajar (down) la frecuencia 
 * (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento 
 * dado (display). Supondremos que el rango de frecuencias a manejar oscila 
 * entre los 80 Mhz y los 108 MHz y que al inicio, el controlador sintoniza a 
 * 80 MHz. Si durante una operación de subida o bajada se sobrepasa uno de los 
 * dos límites, la frecuencia sintonizada debe pasar a ser la del extremo 
 * contrario.
 * El sintonizador digital poseerá 6 memorias (favoritos) donde se almacenará una
 * frecuencia
 */
package javaexamen.escritorio;

import java.awt.event.MouseEvent;
import javaexamen.implementaciones.Sintonizador;
import javax.swing.JOptionPane;


/**
 *
 * @author davidjgc
 */
public class PanelFrecuencias extends javax.swing.JPanel {

    private static final float SALTO_FRECUENCIA = 0.5f;
 
    private Sintonizador miSint = new Sintonizador();
    /**
     * Creates new form PanelFrecuencias
     */
    public PanelFrecuencias() {

        initComponents();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JTextField();
        btnDown = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        jcFavoritos = new javax.swing.JComboBox();
        btnSaveFavorito = new javax.swing.JButton();
        btnCargarFavorito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sintonizador"));

        jLabel1.setText("Frecuencia (MHz):");

        txtDisplay.setEditable(false);
        txtDisplay.setText("80.0");

        btnDown.setText("<<<");
        btnDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDownMouseClicked(evt);
            }
        });

        btnUp.setText(">>>");
        btnUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpMouseClicked(evt);
            }
        });

        jcFavoritos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        jcFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFavoritosActionPerformed(evt);
            }
        });

        btnSaveFavorito.setText("Guardar");
        btnSaveFavorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveFavoritoMouseClicked(evt);
            }
        });

        btnCargarFavorito.setText("Cargar Favorito");
        btnCargarFavorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarFavoritoMouseClicked(evt);
            }
        });

        jLabel2.setText("Favorito:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDown)
                            .addComponent(jcFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUp)
                            .addComponent(btnSaveFavorito)
                            .addComponent(btnCargarFavorito)))
                    .addComponent(txtDisplay))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDown)
                    .addComponent(btnUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveFavorito)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCargarFavorito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownMouseClicked
        //Pulso boton atras, decrementar frecuencia
        downFrecuency(evt);
    }//GEN-LAST:event_btnDownMouseClicked

    private void btnUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpMouseClicked
        //Pulso boton adelante, incrementar frecuencia
        upFrecuency(evt);
    }//GEN-LAST:event_btnUpMouseClicked

    private void btnSaveFavoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveFavoritoMouseClicked
        // guardo una frecuencia en el favorito seleccionado
        saveFavoriteFrecuency(evt);
    }//GEN-LAST:event_btnSaveFavoritoMouseClicked

    private void btnCargarFavoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarFavoritoMouseClicked
        // Cargar favoritos y mostrar en el display la frecuencia 
        //del favorito actualmente seleccionado en el combobox
        loadFavoriteFrecuency(evt);
    }//GEN-LAST:event_btnCargarFavoritoMouseClicked

    private void jcFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFavoritosActionPerformed
        
        
        if (this.miSint.getFrecuencia(this.jcFavoritos.getSelectedItem().toString()) != null) {
            this.txtDisplay.setText(this.miSint.getFrecuencia(this.jcFavoritos.getSelectedItem().toString()));
        }
        
            

    }//GEN-LAST:event_jcFavoritosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarFavorito;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnSaveFavorito;
    private javax.swing.JButton btnUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcFavoritos;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables

    private void downFrecuency(MouseEvent evt) {
        
        float f = this.miSint.getFrecuen();
        
        if (f > 80.0f){
            this.txtDisplay.setText(String.valueOf(this.miSint.downFrecuency(this.miSint.getFrecuen(), this.SALTO_FRECUENCIA)));
        }
        else{
            this.miSint.setFrecuen(108.0f);
            this.txtDisplay.setText(String.valueOf(this.miSint.getFrecuen()));
        }
            
    
    }

    private void upFrecuency(MouseEvent evt) {
        
        float f = this.miSint.getFrecuen();
        
        if (f < 108.0f){
            this.txtDisplay.setText(String.valueOf(this.miSint.upFrecuency(this.miSint.getFrecuen(), this.SALTO_FRECUENCIA)));
        }
        else{
            this.miSint.setFrecuen(80.0f);
            this.txtDisplay.setText(String.valueOf(this.miSint.getFrecuen()));
        }
            
        
        
    }

    private void saveFavoriteFrecuency(MouseEvent evt) {
        
        
        this.miSint.saveFrecuencia(this.jcFavoritos.getSelectedItem().toString(), this.txtDisplay.getText());
        this.miSint.saveFavoritos();
        
    }

    private void loadFavoriteFrecuency(MouseEvent evt) {
        
        this.miSint.loadFavoritos();
        
        if (this.miSint.getFrecuencia(this.jcFavoritos.getSelectedItem().toString()) != null) {
            this.txtDisplay.setText(this.miSint.getFrecuencia(this.jcFavoritos.getSelectedItem().toString()));
        }
        
    }

    
    

}