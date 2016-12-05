/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import resumeBuilder.storage.Resume;
import resumeBuilder.fileSystem.SerializableManager;
import resumeBuilder.storage.ResumeMap;

/**
 *
 * @author tycook1
 */
public class ExistingResumePicker extends javax.swing.JFrame {

	private static Resume resumeInstance;
	
    /**
     * Creates new form EditExistingResumePicker
     */
    public ExistingResumePicker() {
        initComponents();
    }
                         
    private void initComponents() {

        chooseResumeToEditLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumeList = new javax.swing.JList<>();
        chooseResumeToEditLabel.setLabelFor(resumeList);
        OKButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseResumeToEditLabel.setText("Choose the resume you wish to edit");

        resumeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ResumeMap.getResumeNames();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(resumeList);

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(chooseResumeToEditLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(OKButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseResumeToEditLabel)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(cancelButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
        SerializableManager serializableManager = new SerializableManager();
    	serializableManager.initialize(resumeList.getSelectedValue());
    	resumeInstance = serializableManager.load();
        ResumeWizard r = new ResumeWizard(resumeInstance, false);
        r.setVisible(true);
    }                                        

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
        HomeScreen h = new HomeScreen();
        h.setVisible(true);
    }                                        

    // Variables declaration                    
    private javax.swing.JButton OKButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel chooseResumeToEditLabel;
    private javax.swing.JList<String> resumeList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
