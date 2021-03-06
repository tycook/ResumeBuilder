/**
 * 
 */
package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 * @author derek_2
 *
 */
public class Skill extends MajorSection {
	private String title;
	private String description;
	/**
	 * @param title The Skills name, I.E. Tastey White Chocolate Chef
	 * @param description Descriptive text about the skill, I.E. Expert at whipping up dark chocolate.
	 */
	public Skill(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
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
	public void addSectionToWordDocument(XWPFDocument document) {
		// TODO Auto-generated method stub

		XWPFParagraph paragraph2 = document.createParagraph();
		createBullet(paragraph2);
		XWPFRun run2 = paragraph2.createRun();
		run2.setFontFamily(description);
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
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
