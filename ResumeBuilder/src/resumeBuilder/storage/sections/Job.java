/**
 * 
 */
package resumeBuilder.storage.sections;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;


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
	/* (non-Javadoc)
	 * @see resumeBuilder.storage.sections.MajorSection#addSectionToWordDocument(org.apache.poi.xwpf.usermodel.XWPFDocument)
	 */
	@Override
	
	public static XWPFRun createBullet(XWPFParagraph paragraph){
		XWPFRun run = paragraph.createRun();
		run.setFontFamily("Wingdings");
		run.setBold(true);
		run.setFontSize(8);
		run.setText("      l ");
		paragraph.setSpacingBefore(0);
		paragraph.setSpacingAfter(0);
		return run;
			}
	public void addSectionToWordDocument(XWPFDocument document) {
		// TODO Auto-generated method stub
		XWPFParagraph paragraph = document.createParagraph();
		createBullet(paragraph);
		XWPFRun run = paragraph.createRun();
		run.setFontFamily("Times New Roman");
		run.setFontSize(12);
		run.setText("Worked for " + name + "from " + startDate +  "to " + endDate);
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

}
