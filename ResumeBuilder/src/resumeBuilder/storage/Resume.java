/**
 * OOAD project, 2016 Fall 
 */
package resumeBuilder.storage;

import java.util.ArrayList;

/**
 * @author derek_2
 *Represents the general storage container for a Resume.
 */
public class Resume {
	private final String resumeName;
	private ArrayList<PersonalInfo> personalInfo;
	private ArrayList<Job> jobs;
	//...
	/**
	 * @param resumeName: The resume title. Is user facing, and used for the display when restoring a saved resume.
	 */
	public Resume(String resumeName) {
		super();
		this.resumeName = resumeName;
		this.personalInfo = new ArrayList<PersonalInfo>();
		this.jobs = new ArrayList<Job>();
	}

	/**
	 * @param item The Personal Info to add.
	 * @return Void
	 */
	public void addPersonalInfo(PersonalInfo item) {
		return personalInfo.add(item);
	}

	public void addJob(Job job) {
		jobs.add(job);
	}

	/**
	 * @return the resumeName
	 */
	public String getResumeName() {
		return resumeName;
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
