/**
* 
*/
package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 */
public class Reference extends MajorSection {
	private String name;
	private String contactInfo;

	/**
	 * @param name
	 *            The name of the reference, I.E. President Obama
	 * @param contactInfo
	 *            I.E. Phone: 338 857 4839, Email: obama@whitehouse.gov. This
	 *            should be multi line enabled in the GUI.
	 */
	public Reference(String name, String contactInfo) {
		super();
		this.name = name;
		this.contactInfo = contactInfo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the contactInfo
	 */
	public String getContactInfo() {
		return contactInfo;
	}

	@Override
	public void addSectionToWordDocument(XWPFDocument document) {
		
		XWPFParagraph blankline = document.createParagraph();
		
		XWPFParagraph refparagraph = document.createParagraph();
		XWPFRun refrun = refparagraph.createRun();
		refrun.setFontFamily("Times New Roman");
		refrun.setBold(true);
		refrun.setFontSize(20);
		refrun.setText("References");
		refparagraph.setSpacingBefore(0);
		refparagraph.setSpacingAfter(0);
		refparagraph.setAlignment(ParagraphAlignment.LEFT);
		
		XWPFParagraph paragraph = document.createParagraph();
		createBullet(paragraph);
		XWPFRun run = paragraph.createRun();
		run.setFontFamily("Times New Roman");
		run.setBold(false);
		run.setFontSize(12);
		run.setText(name + "   						" + contactInfo);
		paragraph.setSpacingBefore(0);
		paragraph.setSpacingAfter(0);
		paragraph.setAlignment(ParagraphAlignment.LEFT);
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
}
