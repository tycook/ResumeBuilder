package resumebuilder;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

public class WriteTo {

	   //Handles formatting of text
	   //http://stackoverflow.com/questions/28437337/how-to-set-a-font-family-to-an-entire-document-xwpf-apache-poi
	   public static XWPFRun createRun(XWPFParagraph paragraph, int fontSize, boolean bold, String text){
		XWPFRun run = paragraph.createRun();
	    run.setFontFamily("Times New Roman");
	    run.setBold(bold);
	    run.setFontSize(fontSize);
	    run.setText(text);
	    paragraph.setSpacingBefore(0);
	    paragraph.setSpacingAfter(0);
	    return run;
		}
	   
	   public static void main(String[] args)throws Exception 
	   {
	   //Create Document Document
	   XWPFDocument document= new XWPFDocument(); 
	   //Write the Document in file system
	   FileOutputStream out = new FileOutputStream(
	//TODO to Name + "Resume"
	   new File("createdocument.docx"));
	   
	   XWPFParagraph name = document.createParagraph();
	   XWPFRun runName = createRun(name, 20, true, "David Pasquale");
	   name.setAlignment(ParagraphAlignment.CENTER);

	   XWPFParagraph email = document.createParagraph();
	   XWPFRun runemail = createRun(email, 12, false, "Davpasquale@gmail.com");
	   email.setAlignment(ParagraphAlignment.CENTER);
	   
	   XWPFParagraph phone = document.createParagraph();
	   XWPFRun phonerun = createRun(phone, 12, false, "720-555-5555");	   
	   phone.setAlignment(ParagraphAlignment.CENTER);
	   
	   
	   
	   
	   
	   document.write(out);
	   out.close();
	   System.out.println(
	   "createdocument.docx written successully");
	   document.close();
	   }
}