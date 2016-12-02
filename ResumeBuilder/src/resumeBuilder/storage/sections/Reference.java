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
	private final String name;
	private final String contactInfo;

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
		XWPFParagraph paragraph = document.createParagraph();
		createBullet(paragraph);
		XWPFRun run = paragraph.createRun();
		run.setFontFamily("Times New Roman");
		run.setFontSize(12);
		run.setText(name + "   			" + contactInfo);
		paragraph.setSpacingBefore(0);
		paragraph.setSpacingAfter(0);
		paragraph.setAlignment(ParagraphAlignment.LEFT);
	}
}
