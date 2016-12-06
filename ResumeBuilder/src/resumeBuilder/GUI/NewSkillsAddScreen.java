/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import javax.swing.JOptionPane;

import resumeBuilder.storage.Resume;

/**
 *
 * @author tycook1
 */
public class NewSkillsAddScreen extends javax.swing.JFrame {

	private static Resume resumeInstance;
    /**
     * Creates new form AddMoreSkills
     */
    public NewSkillsAddScreen(Resume resume) {
    	resumeInstance = resume;
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

        titleLabel.setText("Add more skills...");

        sectionTitleLabel.setText("Section title (e.g. Language skills)");

        sectionBodyLabel.setText("Section body (e.g. Mandarin, spanish)");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sectionTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sectionBodyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sectionTitleTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sectionBodyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleLabel)
                .addGap(30, 30, 30)
                .addComponent(sectionTitleLabel)
                .addGap(3, 3, 3)
                .addComponent(sectionTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectionBodyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectionBodyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dispose();
    }                                            

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(this,"Skills saved and added to resume");
        resumeInstance.addSkill(sectionTitleTextField.getText(), sectionBodyTextField.getText());
        resumeInstance.save();
        // Close Add more skills screen
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
