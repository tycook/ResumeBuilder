package resumeBuilder.fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import resumeBuilder.storage.Resume;
import resumeBuilder.storage.ResumeMap;

public class SerializableManager implements Loader {

	private String resumeName;
	private ResumeMap resumeMap;

	private String getResumeFilename() {
		return System.getProperty("user.home")+File.separator+".resumeBuilder"+File.separator+this.resumeName+".resume";
	}

	@Override
	public void initialize(String resumeName) {
		resumeMap = ResumeMap.load();
		if(!resumeMap.contains(resumeName)){
			resumeMap.add(resumeName, Base64.getUrlEncoder().encodeToString(resumeName.getBytes()));
			resumeMap.save();
		}
		this.resumeName = resumeMap.get(resumeName);
	}

	@Override
	public Resume load() {
		String fn = this.getResumeFilename();
		try{
			FileInputStream file= new FileInputStream(fn);
			ObjectInputStream reader = new ObjectInputStream(file);
			Resume res = (Resume) reader.readObject();
			reader.close();
			file.close();
			return res;
		}catch (IOException evt){
			System.out.println(evt.getMessage());
			return null;
		} catch (ClassNotFoundException evt){
			System.out.println(evt.getMessage());
			return null;
		}
	}

	public void write(Resume resume) {
		try {
			String fn = this.getResumeFilename();
			FileOutputStream file = new FileOutputStream(fn);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(resume);
			out.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
