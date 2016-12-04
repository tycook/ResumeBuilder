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
public class WordDocumentExporter implements Saver {

	public void initialize(String resumeName){
		//Don't touch, very fragile
		//Create Document Document
		XWPFDocument document= new XWPFDocument(); 
		try {
		    //Write the Document in file system
			FileOutputStream out = new FileOutputStream(
				new File(resumeName + ".docx")); 
				document.close();
				out.close();		
		} 
		catch (IOException e) {
			e.printStackTrace(); }

	}

	@Override
	public void write(Iterator<MajorSection> sections) {
		//MajorSectionsIterator i = Iterator (sections);\

		while(sections.hasNext() == true) {
			MajorSection itr = sections.next();
			itr.addSectionToWordDocument(document);			
			}
		
		}
			
	}



