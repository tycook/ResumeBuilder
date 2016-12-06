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
public class SaveAsExportScreen extends javax.swing.JFrame {


    public SaveAsExportScreen() {
        initComponents();
    }
                         
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
        	HomeScreen h = new HomeScreen();
        	h.setVisible(true);
        	h.toFront();
        	Window activeWindow = javax.swing.FocusManager.getCurrentManager().getActiveWindow();
        }
    }                                        
}
