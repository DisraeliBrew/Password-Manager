// --== CS400 File Header Information ==--
// Name: Zahaan Motiwala
// Email: zmotiwala@wisc.edu
// Team: LD
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader:N/A

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class testDataProcessor {
	/*
	 * Test Method: used to test whether the data processor class methods work
	 * correctly adds various test sites to a single test user and sees if they were
	 * successfully added by calling the getter methods
	 * 
	 */
	@Test
	public void DataTest1() {
		DataProcessor processor = new DataProcessor();
		processor.createUser("testUse", "TestPass");
		processor.addUserSite("testsite", "testusername", "TestPass", "testUse");
		processor.addUserSite("testsite1", "testusername1", "TestPass", "testUse");
		processor.addUserSite("testsite3", "testusername3", "TestPass", "testUse");

		assertTrue(processor.getUserSites("testUse").contains("testsite1")
				&& processor.getUserSites("testUse").contains("testsite")
				&& processor.getUserSites("testUse").contains("testsite3")
				&& processor.getInfo("testsite", "testUse").contains("TestPass"));

	}

	/*
	 * Test Method: used to test whether password and username of the user has been
	 * saved successfully and if the getter methods work as intended.
	 * 
	 */
	@Test
	public void DataTest2() {
		DataProcessor processor = new DataProcessor();
		processor.createUser("testUse", "TestPass");
		processor.addUserSite("testsite", "testusername", "TestPass", "testUse");
		processor.addUserSite("testsite1", "testusername1", "TestPass", "testUse");
		processor.addUserSite("testsite3", "testusername3", "TestPass", "testUse");

		assertTrue(processor.enterUsername("testUse") && processor.enterPassword("testUse", "TestPass"));

	}

}
