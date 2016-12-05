/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import resumeBuilder.storage.Resume;
import resumeBuilder.storage.sections.PersonalInfo;
import javax.swing.JScrollPane;


/**
 *
 * @author tycook1
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public HomeScreen() {
        initComponents();
    }
                         
    private void initComponents() {

        createAResumeButton = new javax.swing.JButton();
        editAnExistingResumeButton = new javax.swing.JButton();
        modifyPersonalInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createAResumeButton.setText("Create a resume");
        createAResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAResumeButtonActionPerformed(evt);
            }
        });

        editAnExistingResumeButton.setText("Edit an existing resume");
        editAnExistingResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAnExistingResumeButtonActionPerformed(evt);
            }
        });

        modifyPersonalInfoButton.setText("Modify personal info");
        modifyPersonalInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPersonalInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(createAResumeButton)
                    .addComponent(editAnExistingResumeButton)
                    .addComponent(modifyPersonalInfoButton))
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(createAResumeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editAnExistingResumeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyPersonalInfoButton)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void createAResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	Resume defaultResume = new Resume("Resume Title");
        ResumeWizard c = new ResumeWizard(defaultResume, true);
        c.setVisible(true);
        
        dispose();
    }                                                   

    private void editAnExistingResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        ExistingResumePicker editExistingResumePicker = new ExistingResumePicker();
        editExistingResumePicker.setVisible(true);
    }                                                          

    private void modifyPersonalInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	PersonalInfo personalInfo = PersonalInfo.load();
        ModifyPersonalInfoScreen modifyPersonalInfoScreen = new ModifyPersonalInfoScreen(personalInfo);
        modifyPersonalInfoScreen.setVisible(true);
    }                                                        

    // Variables declaration                   
    private javax.swing.JButton createAResumeButton;
    private javax.swing.JButton editAnExistingResumeButton;
    private javax.swing.JButton modifyPersonalInfoButton;
    // End of variables declaration                   
}
