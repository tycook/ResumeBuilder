/**
 * OOAD project, 2016 Fall 
 */
package resumeBuilder.storage;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import resumeBuilder.fileSystem.SerializableManager;
import resumeBuilder.fileSystem.WordDocumentExporter;
import resumeBuilder.storage.sections.Job;
import resumeBuilder.storage.sections.MajorSection;
import resumeBuilder.storage.sections.MajorSectionsIterator;
import resumeBuilder.storage.sections.PersonalInfo;
import resumeBuilder.storage.sections.Reference;
import resumeBuilder.storage.sections.Skill;

/**
 * @author derek_2
 *Represents the general storage container for a Resume.
 */
public class Resume  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6097268218720330532L;
	/**
	 * 
	 */
	private String resumeName;
	transient private PersonalInfo personalInfo;
	private final ArrayList<Job> jobs;
	private final ArrayList<Skill> skills;
	private final ArrayList<Reference> references;
	//...
	//Internal use only:
	private boolean hasChangedName=false; //Todo: delete orfen files if deleted.
	/**
	 * @param resumeName: The resume title. Is user facing, and used for the display when restoring a saved resume.
	 */
public Resume(String resumeName) {
		super();
		this.resumeName = resumeName;
		this.personalInfo = PersonalInfo.load();
		System.out.println(this.personalInfo);
		this.jobs = new ArrayList<Job>();
		this.skills = new ArrayList<Skill>();
		this.references = new ArrayList<Reference>();
	}

	public void addJob(String title, String startDate, String endDate, String description) {
		jobs.add(new Job(title, startDate, endDate, description));
	}
	


	/**
	 * @param skill the skill to add.
	 */
	public void addSkill(String title, String description) {
		skills.add(new Skill(title, description));
	}

	/**
	 * @param skill the skill to add.
	 */
	public void addReference(String refName, String contactInfo) {
		references.add(new Reference(refName, contactInfo));
	}

	/**
	 * Saves the resume to disk so it can be retreived later.
	 */
	public void save() {
		SerializableManager saver = new SerializableManager();
		saver.initialize(resumeName);
		saver.write(this);
	}

	public void export(File fileName){
		personalInfo.save();
		WordDocumentExporter doc = new WordDocumentExporter();
		doc.initialize(fileName);
		ArrayList<MajorSection> allSections = new ArrayList<MajorSection>();
		allSections.add(this.personalInfo);
		allSections.addAll(this.skills);
		allSections.addAll(this.jobs);
		allSections.addAll(this.references);
		MajorSectionsIterator sections = new MajorSectionsIterator(allSections);
		doc.write(sections);

	}
	/**
	 * @return the resumeName
	 */
	public String getResumeName() {
		return resumeName;
	}

	/**
	 * @return the personalInfo
	 */
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	/**
	 * @return the jobs
	 */
	public ArrayList<Job> getJobs() {
		return jobs;
	}

	/**
	 * @return the skills
	 */
	public ArrayList<Skill> getSkills() {
		return skills;
	}

	/**
	 * @return the references
	 */
	public ArrayList<Reference> getReferences() {
		return references;
	}

	/**
	 * @param resumeName the resumeName to set
	 */
	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
		this.hasChangedName=true;
		this.save();
	}

	/**
	 * @return the hasChangedName
	 */
	public boolean getHasChangedName() {
		return hasChangedName;
	}
	private void readObject(java.io.ObjectInputStream in)
		throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		this.personalInfo = PersonalInfo.load();
	}
}
