/**
 * 
 */
package resumeBuilder.storage.sections;

/**
 * A Job to go in the jobs section of a resume.
 *
 */
public class Job extends MajorSection {
	private final String name;
	private final String startDate;
	private final String endDate;
	private final String description;
	/**
	 * @param name The job name
	 * @param startDate The start date of the job
	 * @param endDate The end date of the job
	 * @param description the description of the work done.
	 */
	public Job(String name, String startDate, String endDate, String description) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
