package resumeBuilder.storage.sections;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class PersonalInfo extends MajorSection{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6030072760275239677L;
	transient private static final PersonalInfo instance=null;
	private String name;
	private HashMap<String, String> other;

	private static File getSavePath(){
		return new File(System.getProperty("user.home")+File.separator+".resumeBuilder"+File.separator+"personalInfo.ser");
	}
	public static PersonalInfo load(){
		if(PersonalInfo.instance!=null)
			return PersonalInfo.instance;
		File fn = getSavePath();
		try {
			FileInputStream file = new FileInputStream(fn);
			ObjectInputStream o = new ObjectInputStream(file);
			PersonalInfo info = (PersonalInfo) o.readObject();
			o.close();
			file.close();
			return info;
		} catch (FileNotFoundException e) {
			if(fn.exists())
				return null; //ouch, that hurt.
			//This is the first time we've created this. let's create an instance now!
			try {
				fn.getParentFile().mkdirs();
				fn.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			PersonalInfo p = new PersonalInfo(); //empty instance
			System.out.println(p);
			return p;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	private PersonalInfo() {
		super();
		this.name="Default Name";
		this.other = new HashMap<String, String>();
		this.other.put("Email", "");
		this.other.put("phone Number", "");
		this.other.put("Address", "");
		this.save();
	}
	/* (non-Javadoc)
	 * @see resumeBuilder.storage.sections.MajorSection#addSectionToWordDocument(org.apache.poi.xwpf.usermodel.XWPFDocument)
	 */
	@Override
	public void addSectionToWordDocument(XWPFDocument document) {
		//Todo: remove blanks.
		// TODO Auto-generated method stub
		 
		XWPFParagraph nameparagraph = document.createParagraph();
		XWPFRun namerun = nameparagraph.createRun();
		namerun.setFontFamily("Times New Roman");
		namerun.setFontSize(20);
		namerun.setBold(true);
		this.getName();
		namerun.setText(this.getName());
		nameparagraph.setSpacingBefore(0);
		nameparagraph.setSpacingAfter(0);
		nameparagraph.setAlignment(ParagraphAlignment.CENTER);
		
		//for entries in hashmap
		Iterator it = other.entrySet().iterator();
	    while (it.hasNext()) {
	    	Map.Entry pair = (Map.Entry)it.next();
	    	
	    	XWPFParagraph paragraph = document.createParagraph();
			XWPFRun run = nameparagraph.createRun();
			run.setFontFamily("Times New Roman");
			run.setFontSize(12);
			run.setText(pair.getValue().toString());
			paragraph.setSpacingBefore(0);
			paragraph.setSpacingAfter(0);
			paragraph.setAlignment(ParagraphAlignment.CENTER);	
			
			XWPFParagraph blankLine = document.createParagraph();
	    	
	    }
	}
	public String getAddress(){
		return this.other.get("Address");
	}
	public String getEmail(){
		return this.other.get("Email");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the other attributes
	 */
	public HashMap<String, String> getOther() {
		return other;
	}
	public String getPhoneNumber(){
		return this.other.get("Phone Number");
	}

	public void save(){
		File perFile = getSavePath();
		try {
			FileOutputStream out = new FileOutputStream(perFile);
			ObjectOutputStream o = new ObjectOutputStream(out);
			o.writeObject(this);
			o.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void setAddress(String addr){
		this.other.put("Address", addr);
	}
	public void setEmail(String emailAddr){
		this.other.put("Email", emailAddr);
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber){
		this.other.put("Phone Number", phoneNumber);
	}

}
