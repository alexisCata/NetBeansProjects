/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*

USO DE FLOAT O DOUBLE
cambiar el archivo ejecutable de un proyecto



*/
package calculadora;

import java.text.DecimalFormat;

/**
 *
 * @author alexis
 */
public class JCalc extends javax.swing.JFrame {


    /**
     * Creates new form JCalc
     */
    public JCalc() {
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

        jButton19 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);

        jButton19.setText("/");
        jButton19.setAlignmentY(0.0F);
        jButton19.setFocusable(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton13.setText("x");
        jButton13.setAlignmentY(0.0F);
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setText("-");
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setText("+");
        jButton11.setAlignmentY(0.0F);
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton18.setText(".");
        jButton18.setAlignmentY(0.0F);
        jButton18.setFocusable(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton17.setText("0");
        jButton17.setAlignmentY(0.0F);
        jButton17.setFocusable(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton16.setText("=");
        jButton16.setAlignmentY(0.0F);
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton10.setText("C");
        jButton10.setAlignmentY(0.0F);
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setAlignmentY(0.0F);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.setAlignmentY(0.0F);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setAlignmentY(0.0F);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setFocusable(false);

        jButton5.setText("5");
        jButton5.setAlignmentY(0.0F);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setAlignmentY(0.0F);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setAlignmentY(0.0F);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setAlignmentY(0.0F);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setAlignmentY(0.0F);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton16))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton17))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addGap(49, 49, 49)
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton19)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            
            if (resul){
                this.pantalla.setText("1");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){

                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "1");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("1");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "1");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            
            if (resul){
                this.pantalla.setText("2");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "2");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("2");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "2");
                    }

                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            if (resul){
                this.pantalla.setText("3");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "3");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("3");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "3");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
        
            if (resul){
                this.pantalla.setText("4");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "4");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("4");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "4");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            if (resul){
                this.pantalla.setText("5");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                   
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "5");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("5");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "5");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
      Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            if (resul){
                this.pantalla.setText("6");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "6");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("6");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "6");
                    }

                }
          }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            if (resul){
                this.pantalla.setText("7");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "7");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("7");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "7");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            if (resul){
                this.pantalla.setText("8");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "8");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("8");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "8");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            if (resul){
                this.pantalla.setText("9");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){
                    if (i < 10){
                        this.pantalla.setText(this.pantalla.getText() + "9");
                    }
                }else{
                    if (this.siguiente){
                         this.pantalla.setText("9");
                         this.siguiente = false;
                    }
                    else{
                        this.pantalla.setText(this.pantalla.getText() + "9");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i<10){
            
            if (resul){
                this.pantalla.setText("0");
                resul =false;
            }
            else{

                if (this.operacion.equals("")){

                    if (i == 1 && this.pantalla.getText().toString().equals("0")){

                    }
                    else if (i < 10){
                            this.pantalla.setText(this.pantalla.getText() + "0");

                    }
                }
                else{

                    if (this.siguiente){
                         this.pantalla.setText("0");
                         this.siguiente = false;
                    }
                    else if (i == 1 && this.pantalla.getText().toString().equals("0")){

                        }
                    else if (i < 10){
                                this.pantalla.setText(this.pantalla.getText() + "0");

                    }

                }
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        if (!this.operacion.equals("")) {
            this.jButton16ActionPerformed(evt);
        }
        
        Integer i = this.pantalla.getText().toString().length() ;
        Double ini = 0.0;
        if (i>0){
            this.operacion = "+";
  
            this.miCalc.setValor1(Double.valueOf(this.pantalla.getText()));
            
            this.siguiente = true;
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Integer i = this.pantalla.getText().toString().length() ;
        Double ini = 0.0;
        if (i>0){
            this.operacion = "-";
  
            this.miCalc.setValor1(Double.valueOf(this.pantalla.getText()));
            
            this.siguiente = true;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
                Integer i = this.pantalla.getText().toString().length() ;
        Double ini = 0.0;
        if (i>0){
            this.operacion = "x";
  
            this.miCalc.setValor1(Double.valueOf(this.pantalla.getText()));
            
            this.siguiente = true;
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
                Integer i = this.pantalla.getText().toString().length() ;
        Double ini = 0.0;
        if (i>0){
            this.operacion = "/";
  
            this.miCalc.setValor1(Double.valueOf(this.pantalla.getText()));
            
            this.siguiente = true;
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.pantalla.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        Integer exist = this.pantalla.getText().toString().indexOf(".");
        Integer i = this.pantalla.getText().toString().length() ;
        
        if (exist == -1){
          if (i < 11){
              if (i==0){
                  this.pantalla.setText(this.pantalla.getText() + "0.");
              }
              else{
                  this.pantalla.setText(this.pantalla.getText() + ".");
              }
          }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        Integer i = this.pantalla.getText().toString().length() ;
        if (i>0){
            //if (this.valor2.doubleValue() == 0.0){
                //this.valor2 = Double.valueOf(this.pantalla.getText().toString());
                this.miCalc.setValor2(Double.valueOf(this.pantalla.getText()));
            //}
            
            
            
            switch (this.operacion){
                case "+":
                    this.resultado = this.miCalc.suma();
                    break;
                case "-":
                    this.resultado = this.miCalc.resta();
                    break;
                case "x":
                    this.resultado = this.miCalc.multiplica();
                    break;
                case "/":
                    this.resultado = this.miCalc.divide();
                    break;
            
        }
            DecimalFormat resulD = new DecimalFormat("#.####");
            
            this.pantalla.setText(resulD.format(this.resultado).replace(',', '.'));
            
            this.operacion = "";
            resul = true;
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
    
    private CalculadoraConsola miCalc = new CalculadoraConsola();
    private String operacion = "";
    private Double valor1, valor2, resultado;
    private Boolean  siguiente = false;
    private Boolean resul = false;

}