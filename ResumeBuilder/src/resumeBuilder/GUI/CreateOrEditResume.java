/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author tycook1
 */
public class CreateOrEditResume extends javax.swing.JFrame {

    /**
     * Creates new form CreateOrEditResume
     */
    public CreateOrEditResume() {
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

        resumeTitleLabel = new javax.swing.JLabel();
        resumeTitleTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        nameCheckBox = new javax.swing.JCheckBox();
        addressCheckBox = new javax.swing.JCheckBox();
        addressTextField = new javax.swing.JTextField();
        phoneNumberCheckBox = new javax.swing.JCheckBox();
        phoneNumberTextField = new javax.swing.JTextField();
        emailCheckBox = new javax.swing.JCheckBox();
        emailTextField = new javax.swing.JTextField();
        universityAttendedCheckBox = new javax.swing.JCheckBox();
        universityAttendedTextField = new javax.swing.JTextField();
        graduationDateCheckBox = new javax.swing.JCheckBox();
        graduationDateTextField = new javax.swing.JTextField();
        majorCheckBox = new javax.swing.JCheckBox();
        majorTextField = new javax.swing.JTextField();
        technicalSkillsCheckBox = new javax.swing.JCheckBox();
        jobCheckBox = new javax.swing.JCheckBox();
        companyNameLabel = new javax.swing.JLabel();
        companyNameTextField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        startDateTextField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        iStillWorkHereCheckBox = new javax.swing.JCheckBox();
        endDateTextField = new javax.swing.JTextField();
        jobDescriptionLabel = new javax.swing.JLabel();
        jobDescriptionTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addAdditionalInformationButton = new javax.swing.JButton();
        addAnotherJobButton = new javax.swing.JButton();
        addMoreSkillsButton = new javax.swing.JButton();
        addMorePersonalInfoButton = new javax.swing.JButton();
        referencesCheckBox = new javax.swing.JCheckBox();
        referenceNameLabel = new javax.swing.JLabel();
        referenceNameTextField = new javax.swing.JTextField();
        contactInfoLabel = new javax.swing.JLabel();
        contactInfoTextField = new javax.swing.JTextField();
        addAnotherReferenceButton = new javax.swing.JButton();
        technicalSkillsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resumeTitleLabel.setText("Resume Title:");

        nameCheckBox.setSelected(true);
        nameCheckBox.setText("Name");
        nameCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nameCheckBoxStateChanged(evt);
            }
        });

        addressCheckBox.setSelected(true);
        addressCheckBox.setText("Address");
        addressCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addressCheckBoxStateChanged(evt);
            }
        });

        phoneNumberCheckBox.setSelected(true);
        phoneNumberCheckBox.setText("Phone Number");
        phoneNumberCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                phoneNumberCheckBoxStateChanged(evt);
            }
        });

        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });

        emailCheckBox.setSelected(true);
        emailCheckBox.setText("Email");
        emailCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                emailCheckBoxStateChanged(evt);
            }
        });

        universityAttendedCheckBox.setSelected(true);
        universityAttendedCheckBox.setText("University Attended");
        universityAttendedCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                universityAttendedCheckBoxStateChanged(evt);
            }
        });

        graduationDateCheckBox.setSelected(true);
        graduationDateCheckBox.setText("Graduation Date (mm/yyyy)");
        graduationDateCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                graduationDateCheckBoxStateChanged(evt);
            }
        });

        majorCheckBox.setSelected(true);
        majorCheckBox.setText("Major(s)");
        majorCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                majorCheckBoxStateChanged(evt);
            }
        });

        technicalSkillsCheckBox.setSelected(true);
        technicalSkillsCheckBox.setText("Technical Skills");
        technicalSkillsCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                technicalSkillsCheckBoxStateChanged(evt);
            }
        });

        jobCheckBox.setSelected(true);
        jobCheckBox.setText("Job");
        jobCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jobCheckBoxStateChanged(evt);
            }
        });

        companyNameLabel.setText("Company Name");

        startDateLabel.setText("Start Date (mm/yyyy)");

        endDateLabel.setText("End Date (mm/yyyy)");

        iStillWorkHereCheckBox.setText("I still work here");
        iStillWorkHereCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                iStillWorkHereCheckBoxStateChanged(evt);
            }
        });

        jobDescriptionLabel.setText("Job Description");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addAdditionalInformationButton.setText("Add additional information");
        addAdditionalInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdditionalInformationButtonActionPerformed(evt);
            }
        });

        addAnotherJobButton.setText("Add another job");
        addAnotherJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnotherJobButtonActionPerformed(evt);
            }
        });

        addMoreSkillsButton.setText("Add more skills");
        addMoreSkillsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoreSkillsButtonActionPerformed(evt);
            }
        });

        addMorePersonalInfoButton.setText("Add more personal info");
        addMorePersonalInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMorePersonalInfoButtonActionPerformed(evt);
            }
        });

        referencesCheckBox.setText("References");
        referencesCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                referencesCheckBoxStateChanged(evt);
            }
        });

        referenceNameLabel.setText("Reference Name");

        contactInfoLabel.setText("Contact Info (email or phone)");

        addAnotherReferenceButton.setText("Add another reference");
        addAnotherReferenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnotherReferenceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(resumeTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resumeTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(addressCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nameCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(phoneNumberCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(universityAttendedCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(universityAttendedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(graduationDateCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graduationDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(majorCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(technicalSkillsCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(technicalSkillsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addAdditionalInformationButton)
                            .addComponent(jobCheckBox)
                            .addComponent(addMorePersonalInfoButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(referenceNameLabel)
                                    .addComponent(addAnotherJobButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(referenceNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(contactInfoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(companyNameLabel)
                            .addComponent(addMoreSkillsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jobDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jobDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(iStillWorkHereCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(referencesCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addAnotherReferenceButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resumeTitleLabel)
                    .addComponent(resumeTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressCheckBox)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberCheckBox)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCheckBox)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMorePersonalInfoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(universityAttendedCheckBox)
                    .addComponent(universityAttendedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graduationDateCheckBox)
                    .addComponent(graduationDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(majorCheckBox)
                    .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(technicalSkillsCheckBox)
                    .addComponent(technicalSkillsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMoreSkillsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jobCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameLabel)
                    .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel)
                    .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateLabel)
                    .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iStillWorkHereCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobDescriptionLabel)
                    .addComponent(jobDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAnotherJobButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(referencesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referenceNameLabel)
                    .addComponent(referenceNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactInfoLabel)
                    .addComponent(contactInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAnotherReferenceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAdditionalInformationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(exportButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        HomeScreen m = new HomeScreen();
        m.setVisible(true);
        dispose();        // TODO add your handling code here:
    }                                            

    private void nameCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                          
        if (nameCheckBox.isSelected())
        {
            nameTextField.setEnabled(true);
        }
        else if (!nameCheckBox.isSelected())
        {
            nameTextField.setEnabled(false);
        }// TODO add your handling code here:
    }                                         

    private void addressCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                             
        if(addressCheckBox.isSelected())
        {
            addressTextField.setEnabled(true);
        }
        else if (!addressCheckBox.isSelected())
        {
            addressTextField.setEnabled(false);
        }
    }                                            

    private void phoneNumberCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                 
        // TODO add your handling code here:
        if(phoneNumberCheckBox.isSelected())
        {
            phoneNumberTextField.setEnabled(true);
        }
        else if(!phoneNumberCheckBox.isSelected())
        {
            phoneNumberTextField.setEnabled(false);
        }
    }                                                

    private void emailCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                           
        if(emailCheckBox.isSelected())
        {
            emailTextField.setEnabled(true);
        }
        else if (!emailCheckBox.isSelected())
        {
            emailTextField.setEnabled(false);
        }
    }                                          

    private void universityAttendedCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                        
        if(universityAttendedCheckBox.isSelected())
        {
            universityAttendedTextField.setEnabled(true);
        }
        else if(!universityAttendedCheckBox.isSelected())
        {
            universityAttendedTextField.setEnabled(false);
        }
    }                                                       

    private void graduationDateCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                    
        if(graduationDateCheckBox.isSelected())
        {
            graduationDateTextField.setEnabled(true);
        }
        else if(!graduationDateCheckBox.isSelected())
        {
            graduationDateTextField.setEnabled(false);
        }
    }                                                   

    private void majorCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                           
        if(majorCheckBox.isSelected())
        {
            majorTextField.setEnabled(true);
        }
        else if(!majorCheckBox.isSelected())
        {
            majorTextField.setEnabled(false);
        }
    }                                          

    private void technicalSkillsCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                     
        if(technicalSkillsCheckBox.isSelected())
        {
            technicalSkillsTextField.setEnabled(true);
            addMoreSkillsButton.setEnabled(true);
        }
        else if(!technicalSkillsCheckBox.isSelected())
        {
            technicalSkillsTextField.setEnabled(false);
            addMoreSkillsButton.setEnabled(false);
        }
    }                                                    

    private void jobCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                         
        if(jobCheckBox.isSelected())
        {
            companyNameTextField.setEnabled(true);
            startDateTextField.setEnabled(true);
            endDateTextField.setEnabled(true);
            jobDescriptionTextField.setEnabled(true);
            iStillWorkHereCheckBox.setEnabled(true);
            addAnotherJobButton.setEnabled(true);
        }
        else if(!jobCheckBox.isSelected())
        {
            companyNameTextField.setEnabled(false);
            startDateTextField.setEnabled(false);
            endDateTextField.setEnabled(false);
            jobDescriptionTextField.setEnabled(false);
            iStillWorkHereCheckBox.setEnabled(false);
            addAnotherJobButton.setEnabled(false);
        }
    }                                        

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //TODO save the resume
        
        JOptionPane.showMessageDialog(this,"Resume saved");
        // Go back to main screen
        HomeScreen m = new HomeScreen();
        m.setVisible(true);
        // Close this screen
        dispose();
    }                                          

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JOptionPane.showMessageDialog(this,"Resume exported");  
        HomeScreen m = new HomeScreen();
        m.setVisible(true);
        dispose();
    }                                            

    private void addMorePersonalInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        AddMorePersonalInfo addMorePersonalInfo = new AddMorePersonalInfo();
        addMorePersonalInfo.setVisible(true);
    }                                                         

    private void addMoreSkillsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        AddMoreSkills addMoreSkills = new AddMoreSkills();
        addMoreSkills.setVisible(true);
    }                                                   

    private void addAnotherJobButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        AddAnotherJob addAnotherJob = new AddAnotherJob();
        addAnotherJob.setVisible(true);
        // TODO add your handling code here:
    }                                                   

    private void iStillWorkHereCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                    
        if (iStillWorkHereCheckBox.isSelected())
        {
            endDateTextField.setEnabled(false);
        }
        else
        {
            endDateTextField.setEnabled(true);
        }
        // TODO add your handling code here:
    }                                                   

    private void addAnotherReferenceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        AddAnotherReference addAnotherReference = new AddAnotherReference();
        addAnotherReference.setVisible(true);
    }                                                         

    private void referencesCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                
        if(referencesCheckBox.isSelected())
        {
            referenceNameTextField.setVisible(true);
            contactInfoTextField.setVisible(true);
            addAnotherReferenceButton.setVisible(true);
        }
        else
        {
            referenceNameTextField.setVisible(false);
            contactInfoTextField.setVisible(false);
            addAnotherReferenceButton.setVisible(false);
        }
    }                                               

    private void addAdditionalInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        AddAdditionalInformation addAdditionalInformation = new AddAdditionalInformation();
        addAdditionalInformation.setVisible(true);
        // TODO add your handling code here:
    }                                                              

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
            java.util.logging.Logger.getLogger(CreateOrEditResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOrEditResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOrEditResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOrEditResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateOrEditResume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addAdditionalInformationButton;
    private javax.swing.JButton addAnotherJobButton;
    private javax.swing.JButton addAnotherReferenceButton;
    private javax.swing.JButton addMorePersonalInfoButton;
    private javax.swing.JButton addMoreSkillsButton;
    private javax.swing.JCheckBox addressCheckBox;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JLabel contactInfoLabel;
    private javax.swing.JTextField contactInfoTextField;
    private javax.swing.JCheckBox emailCheckBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JButton exportButton;
    private javax.swing.JCheckBox graduationDateCheckBox;
    private javax.swing.JTextField graduationDateTextField;
    private javax.swing.JCheckBox iStillWorkHereCheckBox;
    private javax.swing.JCheckBox jobCheckBox;
    private javax.swing.JLabel jobDescriptionLabel;
    private javax.swing.JTextField jobDescriptionTextField;
    private javax.swing.JCheckBox majorCheckBox;
    private javax.swing.JTextField majorTextField;
    private javax.swing.JCheckBox nameCheckBox;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JCheckBox phoneNumberCheckBox;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel referenceNameLabel;
    private javax.swing.JTextField referenceNameTextField;
    private javax.swing.JCheckBox referencesCheckBox;
    private javax.swing.JLabel resumeTitleLabel;
    private javax.swing.JTextField resumeTitleTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    private javax.swing.JCheckBox technicalSkillsCheckBox;
    private javax.swing.JTextField technicalSkillsTextField;
    private javax.swing.JCheckBox universityAttendedCheckBox;
    private javax.swing.JTextField universityAttendedTextField;
    // End of variables declaration                   
}
