package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import resumeBuilder.fileSystem.MajorSectionsIterator;
import resumeBuilder.storage.sections.MajorSection;
import resumeBuilder.storage.sections.Reference;
import resumeBuilder.storage.sections.Skill;

public class MajorSectionsIteratorInvalidSectionsAreSkipped {

	@Test
	public void testHasNext() {
	ArrayList<MajorSection> s = new ArrayList<MajorSection>();
		MajorSectionsIterator i = new MajorSectionsIterator(s);
		assertFalse("The iterator claims there are items to yield in an empty list.", i.hasNext());
		s.add(new Skill("test", "test"));
		i = new MajorSectionsIterator(s);
		assertTrue("HasNext fails to return true when items exist and the itterator hasn't advanced", i.hasNext());
		//advance the iterator, and try again.
		i.next();
		assertFalse("hasNext returns true when the iterator advanced to the end.", i.hasNext());
		Skill s1 = new Skill("flake", "flakey");
		s1.setShouldBeExported(false);
		s.add(s1);
		i = new MajorSectionsIterator(s);
		assertTrue("hasNext fails to return true for the first item that is indeed exportable", i.hasNext());
		i.next();
		assertFalse("hasNext fails to properly classify that there are no more exportable items.", i.hasNext());
		s = new ArrayList<MajorSection>();
		//set item 1 as a non-exportable skill.
		s1 = new Skill("nothing", "Worthless, don't hire me.");
		s1.setShouldBeExported(false);
		s.add(s1);
		i = new MajorSectionsIterator(s);
		assertFalse("A non-exportable item is the only thing", i.hasNext());
		s.add(new Reference("John doe", "john.doe@gmail.com"));
		i = new MajorSectionsIterator(s);
		assertTrue("One item exists, after a non-exportable item.", i.hasNext());
		i.next();
		assertFalse("Walking past the item should yield the end of the list as next, and therefore, hasNext should be false", i.hasNext());
	}

	@Test
	public void testNext() {
		ArrayList<MajorSection> s = new ArrayList<MajorSection>();
		MajorSectionsIterator i = new MajorSectionsIterator(s);
		assertNull("An empty list has no next item.", i.next());
		Skill s0 = new Skill("Brave", "I'm brave");
		s.add(s0);
		Skill s1 = new Skill("Worthless", "Don't hire me");
		s1.setShouldBeExported(false);
		s.add(s1);
		Skill s2 = new Skill("I'm a good worker", "It's true");
		s.add(s2);
		Reference r1 = new Reference("Donald Trump", "333-333-3333");
		r1.setShouldBeExported(false);
		s.add(r1);
		i = new MajorSectionsIterator(s);
		assertSame("Should not skip over exportable item", i.next(), s0);
		assertSame("Should skip over s1, because it's not exportable", i.next(), s2);
		assertNull("No more items should exist since the last one is not exportable", i.next());
	}

}
