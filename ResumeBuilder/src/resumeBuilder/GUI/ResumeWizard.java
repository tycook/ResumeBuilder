/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumeBuilder.GUI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import resumeBuilder.storage.Resume;
import resumeBuilder.storage.sections.PersonalInfo;
import resumeBuilder.storage.sections.*;

/**
 *
 * @author tycook1
 */
public class ResumeWizard extends javax.swing.JFrame {

	private static PersonalInfo personalInfoInstance;
	private static Resume resumeInstance;
	private ArrayList<Job> jobList;
	private ArrayList<Skill> skillList;
	private ArrayList<Reference> referenceList;
	private Job job;
	private Skill skill;
	private Reference reference;
	private static boolean creatingNewResumeInstance;
	/**
	 * Creates new form CreateOrEditResume
	 */
	public ResumeWizard(Resume resume, boolean creatingNewResume) {
		personalInfoInstance = resume.getPersonalInfo();
		resumeInstance = resume;
		creatingNewResumeInstance = creatingNewResume;
		initComponents();
	}
                         
	private void initComponents() {

		resumeTitleLabel = new javax.swing.JLabel();
		resumeTitleTextField = new javax.swing.JTextField();
		resumeTitleLabel.setLabelFor(resumeTitleTextField);
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
		titleLabel = new javax.swing.JLabel();
		titleTextField = new javax.swing.JTextField();
		titleLabel.setLabelFor(titleTextField);
		startDateLabel = new javax.swing.JLabel();
		startDateTextField = new javax.swing.JTextField();
		startDateLabel.setLabelFor(startDateTextField);
		endDateLabel = new javax.swing.JLabel();
		iStillWorkHereCheckBox = new javax.swing.JCheckBox();
		endDateTextField = new javax.swing.JTextField();
		endDateLabel.setLabelFor(endDateTextField);
		jobDescriptionLabel = new javax.swing.JLabel();
		jobDescriptionTextField = new javax.swing.JTextField();
		jobDescriptionLabel.setLabelFor(jobDescriptionTextField);
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
		referenceNameLabel.setLabelFor(referenceNameTextField);
		contactInfoLabel = new javax.swing.JLabel();
		contactInfoTextField = new javax.swing.JTextField();
		contactInfoLabel.setLabelFor(contactInfoTextField);
		addAnotherReferenceButton = new javax.swing.JButton();
		technicalSkillsTextField = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		nameTextField.setText(personalInfoInstance.getName());
		addressTextField.setText(personalInfoInstance.getAddress());
		emailTextField.setText(personalInfoInstance.getEmail());
		phoneNumberTextField.setText(personalInfoInstance.getPhoneNumber());
		resumeTitleTextField.setText(resumeInstance.getResumeName());

		// PREPOPULATE if user is editing an existing resume
		jobList = resumeInstance.getJobs();
		if(!jobList.isEmpty())
		{
			job = jobList.get(0);
			titleTextField.setText(job.getTitle());
			startDateTextField.setText(job.getStartDate());
			endDateTextField.setText(job.getEndDate());
			jobDescriptionTextField.setText(job.getDescription());
		}
		LinkedHashMap<String, String> hashMap = personalInfoInstance.getOther();
		if(!creatingNewResumeInstance) // if we're editing an existing resume
		{
			universityAttendedTextField.setText(hashMap.getOrDefault("University Attended: ", ""));
			graduationDateTextField.setText(hashMap.getOrDefault("Graduation Date: ", ""));
			majorTextField.setText(hashMap.getOrDefault("Majors: ", ""));
			skillList = resumeInstance.getSkills();
		}
		if(creatingNewResumeInstance)
		{
			universityAttendedTextField.setText("");
			graduationDateTextField.setText("");
			majorTextField.setText("");
			skillList = resumeInstance.getSkills();
		}
		if(!skillList.isEmpty())
		{
			skill = skillList.get(0);
			technicalSkillsTextField.setText(skill.getDescription());
		}
		referenceList = resumeInstance.getReferences();
		if(!referenceList.isEmpty())
		{
			reference = referenceList.get(0);
			referenceNameTextField.setText(reference.getName());
			contactInfoTextField.setText(reference.getContactInfo());
		}
		resumeTitleTextField.setText(resumeInstance.getResumeName());




		resumeTitleLabel.setText("Resume Title:");

		resumeTitleTextField.setToolTipText("");

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

		titleLabel.setText("Job Title");

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

		referencesCheckBox.setSelected(true);
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
												.addComponent(titleLabel)
												.addComponent(addMoreSkillsButton))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
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
	}                       

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
		HomeScreen m = new HomeScreen();
		m.setVisible(true);
		dispose();
	}                                            

	private void nameCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                          
		if (nameCheckBox.isSelected())
		{
			nameTextField.setEnabled(true);
		}
		else if (!nameCheckBox.isSelected())
		{
			nameTextField.setEnabled(false);
		}
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
			titleTextField.setEnabled(true);
			startDateTextField.setEnabled(true);
			endDateTextField.setEnabled(true);
			jobDescriptionTextField.setEnabled(true);
			iStillWorkHereCheckBox.setEnabled(true);
			addAnotherJobButton.setEnabled(true);
		}
		else if(!jobCheckBox.isSelected())
		{
			titleTextField.setEnabled(false);
			startDateTextField.setEnabled(false);
			endDateTextField.setEnabled(false);
			jobDescriptionTextField.setEnabled(false);
			iStillWorkHereCheckBox.setEnabled(false);
			addAnotherJobButton.setEnabled(false);
		}
	}                                        

	private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
		
	}                                                    

	private void doSave(java.awt.event.ActionEvent evt){

		if(job == null) // creation case
		{
			resumeInstance.addJob(titleTextField.getText(), startDateTextField.getText(), endDateTextField.getText(), jobDescriptionTextField.getText());

		}
		else // edit case
		{
			job.setTitle(titleTextField.getText());
			job.setStartDate(startDateTextField.getText());
			job.setEndDate(endDateTextField.getText());
			job.setDescription(jobDescriptionTextField.getText());
		}
		if(skill == null) // creation case
		{
			resumeInstance.addSkill("Technical skills: ", technicalSkillsTextField.getText());
		}
		else // edit case
		{
			skill.setDescription(technicalSkillsTextField.getText());
		}
		if(reference == null) // creation case
		{
			resumeInstance.addReference(referenceNameTextField.getText(), contactInfoTextField.getText());
		}
		else
		{
			reference.setName(referenceNameTextField.getText());
			reference.setContactInfo(contactInfoTextField.getText());
		}
		JOptionPane.showMessageDialog(this,"Resume saved");
		personalInfoInstance.setName(nameTextField.getText());
		personalInfoInstance.setAddress(addressTextField.getText());
		personalInfoInstance.setPhoneNumber(phoneNumberTextField.getText());
		personalInfoInstance.setEmail(emailTextField.getText());
		LinkedHashMap<String, String> hashMap = personalInfoInstance.getOther();
		hashMap.put("University Attended: ", universityAttendedTextField.getText());
		hashMap.put("Graduation Date: ", graduationDateTextField.getText());
		hashMap.put("Majors: ", majorTextField.getText());
		resumeInstance.setResumeName(resumeTitleTextField.getText());
		personalInfoInstance.save();
		resumeInstance.save();
		

	}
	private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.doSave(evt);
		HomeScreen m = new HomeScreen();
		m.setVisible(true);
		// Close this screen
		dispose();
	}                                          

	private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.doSave(evt);
		SaveAsExportScreen exportSaveAs = new SaveAsExportScreen(resumeInstance);
		exportSaveAs.setVisible(true);
		dispose();
	}                                            

	private void addMorePersonalInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
		NewPersonalInfoAddScreen addMorePersonalInfo = new NewPersonalInfoAddScreen(personalInfoInstance);
		addMorePersonalInfo.setVisible(true);
	}                                                         

	private void addMoreSkillsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
		NewSkillsAddScreen addMoreSkills = new NewSkillsAddScreen(resumeInstance);
		addMoreSkills.setVisible(true);
	}                                                   

	private void addAnotherJobButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
		NewJobAddScreen addAnotherJob = new NewJobAddScreen(resumeInstance);
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
		NewReferenceAddScreen addAnotherReference = new NewReferenceAddScreen(resumeInstance);
		addAnotherReference.setVisible(true);
	}                                                         

	private void referencesCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {                                                
		if(referencesCheckBox.isSelected())
		{
			referenceNameTextField.setEnabled(true);
			contactInfoTextField.setEnabled(true);
			addAnotherReferenceButton.setEnabled(true);
		}
		else
		{
			referenceNameTextField.setEnabled(false);
			contactInfoTextField.setEnabled(false);
			addAnotherReferenceButton.setEnabled(false);
		}
	}                                               

	private void addAdditionalInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
		AdditionalInfoAddScreen addAdditionalInformation = new AdditionalInfoAddScreen(personalInfoInstance);
		addAdditionalInformation.setVisible(true);
	}                                                              

	// Variables declaration                  
	private javax.swing.JButton addAdditionalInformationButton;
	private javax.swing.JButton addAnotherJobButton;
	private javax.swing.JButton addAnotherReferenceButton;
	private javax.swing.JButton addMorePersonalInfoButton;
	private javax.swing.JButton addMoreSkillsButton;
	private javax.swing.JCheckBox addressCheckBox;
	private javax.swing.JTextField addressTextField;
	private javax.swing.JButton cancelButton;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JTextField titleTextField;
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
