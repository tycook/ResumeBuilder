/**
 * 
 */
package resumeBuilder.fileSystem;

import java.util.ArrayList;
import java.util.Iterator;

import resumeBuilder.storage.MajorSection;

/**
 * @author derek_2
 *
 */
class MajorSectionsIterator implements Iterator<MajorSection> {
	private ArrayList<MajorSection> sections;
	private MajorSection nextItem;
	private Iterator<MajorSection> sectionsIterator;

	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return this.nextItem!=null;
	}

	private void findNext(){
		do {
			if(this.sectionsIterator.hasNext()){
				this.nextItem = this.sectionsIterator.next();
			}else{
				this.nextItem=null;
			}
		}
		while(this.nextItem!=null && !this.nextItem.exportMe());
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public MajorSection next() {
		MajorSection result = this.nextItem;
		this.findNext();
		return result;
	}

	/**
	 * @param sections
	 */
	public MajorSectionsIterator(ArrayList<MajorSection> sections) {
		super();
		this.sections = sections;
		this.sectionsIterator = this.sections.iterator();
		this.findNext();
	}

}
