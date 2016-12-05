package resumeBuilder.storage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import resumeBuilder.fileSystem.SerializableManager;
import resumeBuilder.storage.sections.Job;
import resumeBuilder.storage.sections.PersonalInfo;
import resumeBuilder.storage.sections.Reference;
import resumeBuilder.storage.sections.Skill;

public class ResumeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testResume() {
		String name = "Berny Sanders";
		Resume resume = new Resume(name);
		assertSame("The names aren't the same", name, resume.getResumeName());
		assertNotNull("PersonalInfo shouldn't be null", resume.getPersonalInfo());
		assertEquals("Array list is not empty", new ArrayList<Job>(), resume.getJobs());
		assertEquals("Array list is not empty", new ArrayList<Skill>(), resume.getSkills());
		assertEquals("Array list is not empty", new ArrayList<Reference>(), resume.getReferences());
	}

	@Test
	public void testAddJob() {
		Resume resume = new Resume("test");
		assertTrue("The list should be empty",resume.getJobs().isEmpty());
		resume.addJob("Blind spy", "1/9/2016", "3/4/2038", "Worked for the CIA as a blind spy");
		assertFalse("The list should not be empty",resume.getJobs().isEmpty());
	}

	@Test
	public void testAddSkill() {
		Resume resume = new Resume("test");
		assertTrue("The list should be empty",resume.getSkills().isEmpty());
		resume.addSkill("smelling error detector", "I'm good at deteting spellimg errors and errors grammmar,");
		assertFalse("The list should not be empty",resume.getSkills().isEmpty());
	}
	@Test
	public void testAddReference() {
		Resume resume = new Resume("test");
		assertTrue("The list should be empty",resume.getReferences().isEmpty());
		resume.addReference("Person Persons", "Person@persons.com");
		assertFalse("The list should not be empty",resume.getReferences().isEmpty());
		
	}


	@Test
	public void testSave() {
		String title1 = "test";
		Resume resumeInstance = new Resume("somethingelse");
		resumeInstance.save();
		// creatre serializible manager obj 
		SerializableManager serializableManager = new SerializableManager();
		// initialize with the same name as the reusme ctreated
		serializableManager.initialize("somethingelse");
		// load and see if the resume it gibes you back has the same name
		Resume newResumeInstance = serializableManager.load();
		assertEquals(newResumeInstance.getResumeName(), resumeInstance.getResumeName());
		// modify personal info of a resume personalinfo.setnameto bob
		newResumeInstance.getPersonalInfo().setName("bob");
		// save reusme
		newResumeInstance.save();
		
		// load another resume with the serializable manager
		
	}

	@Test
	public void testExport() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetResumeName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPersonalInfo() {
		Resume resume = new Resume("test");
		PersonalInfo inf = resume.getPersonalInfo();
		assertNotNull("Personal Info is Null", inf);
		inf.getOther().put("hello", "This is a random piece of personal info");
		inf = resume.getPersonalInfo();
		inf.save();
		resume = new Resume("bob ate cheese");
		PersonalInfo inf2 = resume.getPersonalInfo();
		assertEquals("The personal info objects should have be the same name across loads", inf.getName(), inf2.getName());
	}

	@Test
	public void testGetJobs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSkills() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReferences() {
		fail("Not yet implemented");
	}

}
