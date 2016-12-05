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
public class AddAnotherJob extends javax.swing.JFrame {

	private static Resume resumeInstance;
    /**
     * Creates new form AddAnotherJob
     */
    public AddAnotherJob(Resume resume) {
    	resumeInstance = resume;
        initComponents();
    }
                         
    private void initComponents() {

        windowTitleLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        titleLabel.setLabelFor(titleTextField);
        startDateLabel = new javax.swing.JLabel();
        startDateTextField = new javax.swing.JTextField();
        startDateLabel.setLabelFor(startDateTextField);
        endDateLabel = new javax.swing.JLabel();
        endDateTextField = new javax.swing.JTextField();
        endDateLabel.setLabelFor(endDateTextField);
        iStillWorkHereCheckBox = new javax.swing.JCheckBox();
        jobDescriptionLabel = new javax.swing.JLabel();
        jobDescriptionTextField = new javax.swing.JTextField();
        jobDescriptionLabel.setLabelFor(jobDescriptionTextField);
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        windowTitleLabel.setText("Add another job");

        titleLabel.setText("Company name");

        startDateLabel.setText("Start date (mm/yyyy)");

        endDateLabel.setText("End date (mm/yyyy)");

        iStillWorkHereCheckBox.setText("I still work here");
        iStillWorkHereCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                iStillWorkHereCheckBoxStateChanged(evt);
            }
        });

        jobDescriptionLabel.setText("Job description");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		cancelButtonActionPerformed(evt);
        	}
        });

        cancelButton.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startDateTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(saveButton)
                                            .addComponent(iStillWorkHereCheckBox))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jobDescriptionLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jobDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endDateTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(windowTitleLabel)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(windowTitleLabel)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(33, 33, 33))
        );

        pack();
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
    }                                                   

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	resumeInstance.addJob(titleTextField.getText(), startDateTextField.getText(), endDateTextField.getText(), jobDescriptionTextField.getText());
        resumeInstance.save();
    	JOptionPane.showMessageDialog(this,"Job saved and added to resume");
        // Close Add another job screen
        dispose();
    }          
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
    	dispose();
    }

   
    // Variables declaration                  
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JCheckBox iStillWorkHereCheckBox;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel jobDescriptionLabel;
    private javax.swing.JTextField jobDescriptionTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    private javax.swing.JLabel windowTitleLabel;
    // End of variables declaration                   
}
