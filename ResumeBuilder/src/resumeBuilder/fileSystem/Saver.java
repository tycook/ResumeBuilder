package resumeBuilder.fileSystem;

import java.util.Iterator;

import resumeBuilder.storage.MajorSection;

interface Saver {
	public void initialize(String resumeName);
	public void write(Iterator<MajorSection>sections);
}
