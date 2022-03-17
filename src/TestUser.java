// --== CS400 File Header Information ==--
// Name: Zahaan Motiwala
// Email: zmotiwala@wisc.edu
// Team: LD
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader:N/A

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestUser {

	/*
	 * Test Method: used to test whether the addSite setter method works as intended
	 * and adds the sites to site map
	 * 
	 */
	@Test
	public void UserTest1() {
		User siteTest = new User("test", "pass");
		siteTest.addSite("FB", new Site("FB", "zm", "one"));
		siteTest.addSite("Google", new Site("Google", "zm", "two"));
		siteTest.addSite("Insta", new Site("Insta", "zm", "three"));
		siteTest.addSite("Snap", new Site("Snap", "zm", "four"));

		assertTrue(siteTest.getPassword().equals("pass"));

	}

	/*
	 * Test Method: used to test whether the username of site is saved successfully
	 * by the method
	 * 
	 */
	@Test
	public void UserTest2() {
		User siteTest = new User("test", "pass");
		siteTest.addSite("FB", new Site("FB", "zm", "one"));
		siteTest.addSite("Google", new Site("Google", "zm", "two"));
		siteTest.addSite("Insta", new Site("Insta", "zm", "three"));
		siteTest.addSite("Snap", new Site("Snap", "zm", "four"));

		assertTrue(siteTest.getUsername().equals("test"));
	}

	/*
	 * Test Method: used to test whether individual site information is successfully
	 * saved in the method and whether the getter methods work as intended
	 * 
	 */
	@Test
	public void UserTest3() {
		User siteTest = new User("test", "pass");
		siteTest.addSite("FB", new Site("FB", "zm", "one"));
		siteTest.addSite("Google", new Site("Google", "zm", "two"));
		siteTest.addSite("Insta", new Site("Insta", "zm", "three"));
		siteTest.addSite("Snap", new Site("Snap", "zm", "four"));

		assertTrue(siteTest.getSiteList().contains("FB") && siteTest.getSiteList().contains("Insta"));

	}

}
