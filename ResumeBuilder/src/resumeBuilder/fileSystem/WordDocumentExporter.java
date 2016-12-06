package resumeBuilder.fileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

import resumeBuilder.storage.sections.*;

//Creates and initializes a word document and file output stream.
public class WordDocumentExporter {
	private XWPFDocument document;
	private FileOutputStream out;

	public void initialize(File resumeName){
		//Don't touch, very fragile
		//Create Document Document 
		try {
			//Write the Document in file system
			out = new FileOutputStream(resumeName); 
		} 
		catch (IOException e) {
			e.printStackTrace(); }

	}

	public void write(Iterator<MajorSection> sections) {
		//MajorSectionsIterator i = Iterator (sections);\

		while(sections.hasNext() == true) {
			MajorSection itr = sections.next();
			itr.addSectionToWordDocument(document);
		}

		try{
			document.write(out);
			document.close();
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public WordDocumentExporter(){
		document = new XWPFDocument();
	}
	
}



