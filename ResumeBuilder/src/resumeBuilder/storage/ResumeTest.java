package resumeBuilder.storage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import resumeBuilder.storage.sections.Job;
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
		fail("Not yet implemented");
	}

	@Test
	public void testAddSkill() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
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
