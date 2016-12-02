package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public abstract class MajorSection {
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
