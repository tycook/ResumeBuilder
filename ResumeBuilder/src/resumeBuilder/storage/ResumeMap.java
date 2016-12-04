/**
 * 
 */
package resumeBuilder.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 * ResumeMap holds key/value pairs of resume name -> appropriate file name.
 * It's there for the GUI to prevent the GUI from having to futz around with decoding resume Names from the keys.
 * This class has static method load which should be used. it yields a singleton object, empty, or initialized from disk.
 */
public final class ResumeMap implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4817039169745314736L;
	transient private static final ResumeMap instance = ResumeMap.load();
	private final HashMap<String, String> map;

	private static File getSavePath(){
		return new File(System.getProperty("user.home")+File.separator+".resumeBuilder"+File.separator+"resumeMap.ser");
	}

	public static String[] getResumeNames(){
		ResumeMap map = ResumeMap.load();
		return map.listResumes();
	}

	public static ResumeMap load(){
		if(ResumeMap.instance!=null)
			return ResumeMap.instance; //Singleton.
		File fn = getSavePath();
		try {
			FileInputStream file = new FileInputStream(fn);
			ObjectInputStream o = new ObjectInputStream(file);
			ResumeMap map = (ResumeMap) o.readObject();
			o.close();
			file.close();
			return map;
		} catch (FileNotFoundException e) {
			if(fn.exists())
				return null; //ouch, that hurt.
			//This is the first time we've created this. let's create an instance now!
			try {
				fn.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return new ResumeMap(); //empty instance
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String[] listResumes() {
		return this.map.keySet().toArray(new String[0]);
	}

	private ResumeMap() {
		super();
		this.map = new HashMap<String, String>();
	}

	public void add(String key, String value){
		this.map.put(key, value);
	}
	public String get(String key){
		return map.get(key);
	}
	public boolean contains(String key){
		return map.containsKey(key);
	}
	public boolean save(){
		File file = getSavePath();
		try {
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(out);
			o.writeObject(this);
			o.close();
			out.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
