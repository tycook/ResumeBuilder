package resumeBuilder.storage.sections;


import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

public class PersonalInfo extends MajorSection {

	/* (non-Javadoc)
	 * @see resumeBuilder.storage.sections.MajorSection#addSectionToWordDocument(org.apache.poi.xwpf.usermodel.XWPFDocument)
	 */
	@Override
	public void addSectionToWordDocument(XWPFDocument document) {
		// TODO Auto-generated method stub
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setFontFamily("Times New Roman");
		run.setFontSize(12);
		//need to change "test" to correct text from GUI
		run.setText("test");
		paragraph.setSpacingBefore(0);
		paragraph.setSpacingAfter(0);
		edu.setAlignment(ParagraphAlignment.CENTER);
	}
}
