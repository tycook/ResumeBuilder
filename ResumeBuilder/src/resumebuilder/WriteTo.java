package resumebuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;

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
	   
	   public static XWPFRun createBullet(XWPFParagraph paragraph, String text){
		XWPFRun run = paragraph.createRun();
		    run.setFontFamily("Wingdings");
		    run.setBold(true);
		    run.setFontSize(8);
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
	   
	   XWPFParagraph foo = document.createParagraph();
	   
	   XWPFParagraph edu = document.createParagraph();
	   XWPFRun runedu = createRun(edu, 16, true, "Education");
	   edu.setAlignment(ParagraphAlignment.LEFT);
	   
	   XWPFParagraph education = document.createParagraph();
	   XWPFRun bullet1 = createBullet(education, "      l ");
	   XWPFRun university = createRun(education, 12, false, "Attended " + "University of Colorado Boulder " + "and graduated on " + "11/1993.");
	   
	   XWPFParagraph major = document.createParagraph();
	   XWPFRun bullet2 = createBullet(major, "      l ");
	   XWPFRun majorrun = createRun(major, 12, false, "Majored in " + "Computer Science");
	   
	   XWPFParagraph foo1 = document.createParagraph();
	   XWPFParagraph exp = document.createParagraph();
	   XWPFRun exprun = createRun(exp, 16, true, "Work Experience");

	   
	   XWPFParagraph workexp = document.createParagraph();
	   XWPFRun bullet3 = createBullet(workexp, "      l ");
	   XWPFRun workexprun = createRun(workexp, 12, false, "Worked for " + "Company " + "from " + "12/1993 " + "to " + "1/1994");
	   
	   XWPFParagraph jobDesc = document.createParagraph();
	   XWPFRun bullet4 = createBullet(jobDesc, "      l ");
	   XWPFRun jobDescRun = createRun(jobDesc, 12, false, "Cleaned toilets, balanced checkbooks, and bathed grandmas");
	   
	   XWPFParagraph foo2 = document.createParagraph();
	   XWPFParagraph ref = document.createParagraph();
	   XWPFRun refrun = createRun(ref, 16, true, "Referenes");

	   XWPFParagraph reference1 = document.createParagraph();
	   XWPFRun bullet5 = createBullet(reference1, "      l ");
	   XWPFRun ref1run = createRun(reference1, 12, false, "John Snow 999-999-9999");
	   
	   


	   
	   
	   document.write(out);
	   out.close();
	   System.out.println(
	   "createdocument.docx written successully");
	   document.close();
	   }
}