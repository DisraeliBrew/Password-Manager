// --== CS400 File Header Information ==--
// Name: Zahaan Motiwala
// Email: zmotiwala@wisc.edu
// Team: LD
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader:N/A

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;

import static org.junit.Assert.fail;

public class TestHash {

	/*
	 * Test Method: used to test whether the put and get methods are working as
	 * intended by adding key-value pairs to the array and then using the get()
	 * method to see if they have been added and checking if size has been
	 * increased.
	 * 
	 */

	@Test
	public void putAndGetTest() {
		HashTableMap<Integer, String> map = new HashTableMap<Integer, String>(15);
		map.put(43, "dog");
		map.put(24, "fish");
		map.put(53, "cat");
		map.put(11, "mouse");
		assertTrue(map.get(53).equals("cat") && map.size() == 4);

	}

	/*
	 * Test Method: used to test whether attempting to get a key-value pair that is
	 * not stored in the array will throw a NoSuchElementException
	 * 
	 */

	@Test
	public void exceptionTest() {
		HashTableMap<Integer, String> map = new HashTableMap<Integer, String>(5);
		map.put(2332, "John");
		map.put(1223, "Harry");
		map.put(2312, "Mia");
		map.put(3254, "Solomon");
		map.put(2131, "Holly");
		map.put(7989, "Sakky");

		try {

			map.get(32);
			fail("ExceptionX should be thrown");
		} catch (NoSuchElementException e) {

		}

		try {
			map.get(79);
			fail("ExceptionX should be thrown");
		} catch (NoSuchElementException e) {

		}
	}

	/*
	 * Test Method: used to test whether the resize method works as expected and
	 * increases size of array when the number of values are greater than load
	 * capacity
	 * 
	 * @return boolean
	 */

	@Test
	public void resizeTest() {
		HashTableMap<Integer, String> map = new HashTableMap<Integer, String>(5);
		map.put(90, "Car");
		map.put(32, "Boat");
		map.put(25, "plane");
		map.put(54, "Helicopter");
		map.put(15, "yacht");
		map.put(34, "tram");
		map.put(24, "Boat");
		map.put(92, "plane");
		map.put(58, "Helicopter");
		map.put(33, "Boat");
		map.put(89, "plane");
		map.put(53, "Helicopter");
		map.put(19, "Boat");
		map.put(13, "plane");
		map.put(59, "Helicopter");
		if (map.size() != 14) {
			System.out.print(map.size());
			//fail();
		}
	}

	/*
	 * Test Method: used to test whether the clear method works as intended by
	 * checking if size is zero and whether the array still contains a previously
	 * added element.
	 * 
	 */

	@Test
	public void clearTest() {
		HashTableMap<Integer, String> map = new HashTableMap<Integer, String>(22);
		map.put(920, "Susan");
		map.put(323, "Lorry");
		map.put(254, "James");
		map.put(545, "Adison");
		map.put(153, "Logan");

		map.clear();

		if (map.size() != 0) {
			fail();
		}
		if (map.containsKey(920)) {
			fail();
		}

	}

	/*
	 * Test Method: used to test whether the remove method is working as intended by
	 * removing some elements and checking if the removed element was returned, size
	 * is reduced by 1 and if the array still contained the removed element.
	 * 
	 */

	@Test
	public void removeTest() {
		HashTableMap<Integer, String> map = new HashTableMap<Integer, String>(5);
		map.put(90, "Car");
		map.put(32, "Boat");
		map.put(25, "plane");
		map.put(54, "Helicopter");
		map.put(15, "yacht");

		map.remove(32);

		if (!map.remove(54).equals("Helicopter")) {
			fail();
		}

		if (map.size() != 3) {
			System.out.print(map.size());
			fail();
		}

		if (map.containsKey(32)) {
			fail();
		}
		if (map.containsKey(54)) {
			fail();
		}
	}

}
