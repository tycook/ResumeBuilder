/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.swing.JOptionPane;

import resumeBuilder.storage.sections.PersonalInfo;

/**
 *
 * @author tycook1
 */
public class NewPersonalInfoAddScreen extends javax.swing.JFrame {

	private static PersonalInfo personalInfoInstance;
    /**
     * Creates new form AddMorePersonalInfo
     */
    public NewPersonalInfoAddScreen(PersonalInfo personalInfo) {
    	personalInfoInstance = personalInfo;
        initComponents();
    }
                         
    private void initComponents() {

        sectionTitleLabel = new javax.swing.JLabel();
        sectionTitleTextField = new javax.swing.JTextField();
        sectionTitleLabel.setLabelFor(sectionTitleTextField);
        sectionBodyLabel = new javax.swing.JLabel();
        sectionBodyTextField = new javax.swing.JTextField();
        sectionBodyLabel.setLabelFor(sectionBodyTextField);
        titleLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sectionTitleLabel.setText("Section title");

        sectionBodyLabel.setText("Section body");

        titleLabel.setText("Add more personal info...");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sectionTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sectionBodyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectionBodyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titleLabel)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionTitleLabel)
                    .addComponent(sectionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionBodyLabel)
                    .addComponent(sectionBodyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }                    

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dispose();
    }                                            

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	LinkedHashMap<String, String> hashMap = personalInfoInstance.getOther();
    	hashMap.put(sectionTitleTextField.getText(), sectionBodyTextField.getText());
        JOptionPane.showMessageDialog(this,"Personal info saved and added to resume");
        // Close add more personal info screen
        dispose();
    }                                          

    // Variables declaration              
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sectionBodyLabel;
    private javax.swing.JTextField sectionBodyTextField;
    private javax.swing.JLabel sectionTitleLabel;
    private javax.swing.JTextField sectionTitleTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}
