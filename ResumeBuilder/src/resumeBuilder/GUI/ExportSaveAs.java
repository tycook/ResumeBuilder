/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;

/**
 *
 * @author tycook1
 */
public class ExportSaveAs extends javax.swing.JFrame {

    /**
     * Creates new form ExportFilePicker
     */
    public ExportSaveAs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	
    	JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        int status = fileChooser.showSaveDialog(null);
        if (status == JFileChooser.APPROVE_OPTION)
        {	
        	File selectedFile = fileChooser.getSelectedFile();
        	dispose();        	
            JOptionPane.showMessageDialog(this,"Resume saved");
        	HomeScreen h = new HomeScreen();
        	h.setVisible(true);
        	h.requestFocus();
        	System.out.println("User hit save. Selected file is: " + selectedFile);      	
        }
        if (status == JFileChooser.CANCEL_OPTION)
        {
        	System.out.println("User hit cancel");
        	//dispose();
        	HomeScreen h = new HomeScreen();
        	h.setVisible(true);
        	h.toFront();
        	Window activeWindow = javax.swing.FocusManager.getCurrentManager().getActiveWindow();
        	System.out.println("Current focused window: " + activeWindow);
        }
        

        /*jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        
        jFileChooser1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              System.out.println("Action");

            }
          });
        
        int status = jFileChooser1.showOpenDialog(null);
        
        if (status == jFileChooser1.APPROVE_OPTION) {
            File selectedFile = jFileChooser1.getSelectedFile();
            System.out.println("User clicked save button"+selectedFile.getParent());
            System.out.println(selectedFile.getName());
          } else if (status == jFileChooser1.CANCEL_OPTION) {
            System.out.println("user clicked cancel");

          }
    	


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.setDialogTitle("Save as");
        final File chosenFile = jFileChooser1.getSelectedFile();
        System.out.println("chosen file is: " + chosenFile);
       // jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();*/
    }// </editor-fold>                        
    

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExportSaveAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportSaveAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportSaveAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportSaveAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportSaveAs().setVisible(true);
            }
        });
    }*/


    // Variables declaration - do not modify                     
//    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration                   
}