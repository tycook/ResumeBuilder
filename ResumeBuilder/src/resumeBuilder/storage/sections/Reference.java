/**
 * 
 */
package resumeBuilder.storage.sections;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

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
	@Override
	public void addSectionToWordDocument(XWPFDocument document) {
		// TODO Auto-generated method stub
		
	}
}
