package resumeBuilder.storage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResumeMapTest {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testLoad() {
		ResumeMap map = ResumeMap.load();
		map.add("fish", "test");
		map.add("dog", "test3");
		map.save();
		String[] them = ResumeMap.getResumeNames();
		System.out.println(them[0]);
		assertFalse("Error", them.length>2);
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

}
