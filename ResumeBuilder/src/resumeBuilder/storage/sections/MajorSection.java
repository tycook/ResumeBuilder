package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public abstract class MajorSection {
public XWPFRun createBullet(XWPFParagraph paragraph) {
	XWPFRun run = paragraph.createRun();
	run.setFontFamily("Wingdings");
	run.setBold(true);
	run.setFontSize(8);
	run.setText("      l ");
	paragraph.setSpacingBefore(0);
	paragraph.setSpacingAfter(0);
	return run;
		}
private boolean shouldBeExported = true;

/**
 * @param shouldBeExported Set whether this item should be exported to the pretty resume.
 */
public void setShouldBeExported(boolean shouldBeExported) {
	this.shouldBeExported = shouldBeExported;
}

/**
 * @return the shouldBeExported
 */
public boolean exportMe() {
	return shouldBeExported;
}
public abstract void addSectionToWordDocument(XWPFDocument document);

	

}
