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
public class AdditionalInfoAddScreen extends javax.swing.JFrame {

	private static PersonalInfo personalInfoInstance;
    /**
     * Creates new form AddAdditionalInformation
     */
    public AdditionalInfoAddScreen(PersonalInfo personalInfo) {
    	personalInfoInstance = personalInfo;
        initComponents();
    }
                    
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        sectionTitleLabel = new javax.swing.JLabel();
        sectionTitleTextField = new javax.swing.JTextField();
        sectionTitleLabel.setLabelFor(sectionTitleTextField);
        sectionBodyLabel = new javax.swing.JLabel();
        sectionBodyTextField = new javax.swing.JTextField();
        sectionBodyLabel.setLabelFor(sectionBodyTextField);
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Add additional information...");

        sectionTitleLabel.setText("Section title");

        sectionBodyLabel.setText("Section body");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(titleLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(sectionTitleLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sectionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(sectionBodyLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sectionBodyTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(saveButton)
                        .addGap(56, 56, 56)
                        .addComponent(cancelButton)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionTitleLabel)
                    .addComponent(sectionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionBodyLabel)
                    .addComponent(sectionBodyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }                     

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(this,"Additional information saved and added to resume");
        LinkedHashMap<String, String> hashMap = personalInfoInstance.getOther();
		hashMap.put(sectionTitleTextField.getText(), sectionBodyTextField.getText());
        // Close add additional information screen
        dispose();
    }                                          

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
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
