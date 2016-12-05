/**
 * 
 */
package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
	import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**
 * A Job to go in the jobs section of a resume.
 *
 */
public class Job extends MajorSection {
	private String title;
	private String startDate;
	private String endDate;
	private String description;
	/**
	 * @param name The job name
	 * @param startDate The start date of the job
	 * @param endDate The end date of the job
	 * @param description the description of the work done.
	 */
	public Job(String name, String startDate, String endDate, String description) {
		super();
		this.title = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}
	/**
	 * @return the name
	 */
	public String getTitle() {
		return title;
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
	public void addSectionToWordDocument(XWPFDocument document) {
		XWPFParagraph paragraph = document.createParagraph();
		createBullet(paragraph);
		XWPFRun run = paragraph.createRun();
		run.setFontFamily("Times New Roman");
		run.setFontSize(12);
		run.setText("Worked for " + title + "from " + startDate +  "to " + endDate);
		paragraph.setSpacingBefore(0);
		paragraph.setSpacingAfter(0);
		paragraph.setAlignment(ParagraphAlignment.LEFT);

		XWPFParagraph paragraph2 = document.createParagraph();
		createBullet(paragraph2);
		XWPFRun run2 = paragraph2.createRun();
		run2.setFontFamily("Times New Roman");
		run2.setFontSize(12);
		run2.setText(description);
		paragraph2.setSpacingBefore(0);
		paragraph2.setSpacingAfter(0);
		paragraph2.setAlignment(ParagraphAlignment.LEFT);
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
