/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wewillsee;

import arduino.*;

/**
 *
 * @author khutjo_laptop
 */




public class video extends javax.swing.JFrame {
    private static Arduino arduinocom;
    /**
     * Creates new form video
     */
    private void UpDate(){
        String output = "~"+Integer.toString(Red.getValue())+"-"+Integer.toString(Green.getValue())+"-"+Integer.toString(Blue.getValue())+"~";
        arduinocom.serialWrite(output);
        System.out.println(output);
//        arduinocom.closeConnection();
    }        

    public video() {
        initComponents();
        UpDate();
    }

//    public void WriteColor(){
//        String output = "~"+Integer.toString(Red.getValue())+"-"+Integer.toString(Green.getValue())+"-"+Integer.toString(Blue.getValue())+"~";
//        arduinocom.serialWrite(output);
//        arduino.openConnection();
//        arduino.serialWrite(output);
        //System.out.println(arduino.serialRead());
//        arduino.closeConnection();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        Red = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        Green = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        Blue = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Red.setToolTipText("Red");
        Red.setValue(255);
        Red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Red.setNextFocusableComponent(Green);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Red, org.jdesktop.beansbinding.ELProperty.create("255"), Red, org.jdesktop.beansbinding.BeanProperty.create("maximum"));
        bindingGroup.addBinding(binding);

        Red.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RedStateChanged(evt);
            }
        });
        Red.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                RedPropertyChange(evt);
            }
        });

        jLabel1.setText("slider value");

        Green.setToolTipText("Green");
        Green.setValue(255);
        Green.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Green.setNextFocusableComponent(Blue);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Green, org.jdesktop.beansbinding.ELProperty.create("255"), Green, org.jdesktop.beansbinding.BeanProperty.create("maximum"));
        bindingGroup.addBinding(binding);

        Green.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GreenStateChanged(evt);
            }
        });
        Green.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                GreenPropertyChange(evt);
            }
        });

        jLabel2.setText("slider value");

        Blue.setToolTipText("Blue");
        Blue.setValue(255);
        Blue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Blue.setNextFocusableComponent(Red);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Blue, org.jdesktop.beansbinding.ELProperty.create("255"), Blue, org.jdesktop.beansbinding.BeanProperty.create("maximum"));
        bindingGroup.addBinding(binding);

        Blue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BlueStateChanged(evt);
            }
        });
        Blue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BluePropertyChange(evt);
            }
        });

        jLabel3.setText("slider value");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addComponent(jLabel2)
            .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
            .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_RedPropertyChange
        // TODO add your handling code here:
        jLabel1.setText("Red Value   : " + Integer.toString(Red.getValue()));
    }//GEN-LAST:event_RedPropertyChange

    private void RedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RedStateChanged
        // TODO add your handling code here:
        jLabel1.setText("Red Value   : " + Integer.toString(Red.getValue()));
        System.out.println(Red.getValue());
        UpDate();
        jPanel1.setBackground(new java.awt.Color(Red.getValue(), Green.getValue(), Blue.getValue()));
    }//GEN-LAST:event_RedStateChanged

    private void GreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GreenStateChanged
        // TODO add your handling code here:
        jLabel2.setText("Green Value : " + Integer.toString(Green.getValue()));
        System.out.println(Green.getValue());
        UpDate();
        jPanel1.setBackground(new java.awt.Color(Red.getValue(), Green.getValue(), Blue.getValue()));
    }//GEN-LAST:event_GreenStateChanged

    private void BlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BlueStateChanged
        // TODO add your handling code here:
        jLabel3.setText("Blue Value  : " + Integer.toString(Blue.getValue()));
        //jPanel1.setBackground(Color.blue);
        System.out.println(Blue.getValue());
        UpDate();
        jPanel1.setBackground(new java.awt.Color(Red.getValue(), Green.getValue(), Blue.getValue()));
    }//GEN-LAST:event_BlueStateChanged

    private void GreenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_GreenPropertyChange
        // TODO add your handling code here:
        jLabel2.setText("Green Value : " + Integer.toString(Green.getValue()));
    }//GEN-LAST:event_GreenPropertyChange

    private void BluePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BluePropertyChange
        // TODO add your handling code here:
        jLabel3.setText("Blue Value  : " + Integer.toString(Blue.getValue()));
    }//GEN-LAST:event_BluePropertyChange

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
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        arduinocom = new Arduino("COM15", 9600);
        arduinocom.openConnection();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Blue;
    private javax.swing.JSlider Green;
    private javax.swing.JSlider Red;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
