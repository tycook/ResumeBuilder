/**
 * 
 */
package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 * @author derek_2
 *
 */
public class Skill extends MajorSection {
	private final String title;
	private final String description;
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

	}

}
