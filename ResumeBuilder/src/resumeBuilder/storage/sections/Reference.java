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
 * @author derek_2
 *
 */
public class Reference extends MajorSection {
	private final String name;
	/**
	 * @param name The name of the reference, I.E. President Obama  
	 * @param contactInfo I.E. Phone: 338 857 4839, Email: obama@whitehouse.gov. This should be multi line enabled in the GUI.
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
	private final String contactInfo;
	/* (non-Javadoc)
	 * @see resumeBuilder.storage.sections.MajorSection#addSectionToWordDocument(org.apache.poi.xwpf.usermodel.XWPFDocument)
	 */
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
	
	@Override
	public void addSectionToWordDocument(XWPFDocument document) {
		// TODO Auto-generated method stub
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
