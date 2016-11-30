/**
 * OOAD project, 2016 Fall 
 */
package resumeBuilder.storage;

import java.util.ArrayList;

import resumeBuilder.storage.sections.Job;
import resumeBuilder.storage.sections.PersonalInfo;
import resumeBuilder.storage.sections.Reference;
import resumeBuilder.storage.sections.Skill;

/**
 * @author derek_2
 *Represents the general storage container for a Resume.
 */
public class Resume {
	private final String resumeName;
	private final ArrayList<PersonalInfo> personalInfo;
	private final ArrayList<Job> jobs;
	private final ArrayList<Skill> skills;
	private final ArrayList<Reference> references;
	//...
	/**
	 * @param resumeName: The resume title. Is user facing, and used for the display when restoring a saved resume.
	 */
public Resume(String resumeName) {
		super();
		this.resumeName = resumeName;
		this.personalInfo = new ArrayList<PersonalInfo>();
		this.jobs = new ArrayList<Job>();
		this.skills = new ArrayList<Skill>();
		this.references = new ArrayList<Reference>();
	}

	/**
	 * @param item The Personal Info to add.
	 * @return Void
	 */
	public void addPersonalInfo(PersonalInfo item) {
		personalInfo.add(item);
	}

	public void addJob(Job job) {
		jobs.add(job);
	}
	


	/**
	 * @param skill the skill to add.
	 */
	public void addSkill(Skill skill) {
		skills.add(skill);
	}

	/**
	 * Saves the resume to disk so it can be retreived later.
	 */
	public void save() {
		for(PersonalInfo p : personalInfo){
			//Todo: tell serializer about this.
		}

	}
}
