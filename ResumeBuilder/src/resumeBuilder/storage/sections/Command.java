package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Command extends MajorSection {
	private String command;

	public Command(String command) {
		super();
		this.command = command;
	}

	@Override
	public void addSectionToWordDocument(XWPFDocument document) {

	}

}
