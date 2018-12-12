/**
 * 
 */
package com.mrmrmr7.figure.action;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mrmrmr7.figure.entity.Sphere;

/**
 * @author meow
 *
 */
public class ValidationTest {
	boolean valid;
	Validation validation;
	/**
	 * @throws java.lang.Exception This method can find some troubles in time of working
	 */
	@Before
	public void setUp() throws Exception {
		valid = false;
		validation = Validation.getInstance();
	}

	/**
	 * Test method for {@link com.mrmrmr7.figure.action.Validation#isValidData(java.lang.String)}.
	 */
	@Test
	public void testIsValidData() {
		valid = validation.isValidData("3.3 5.554 7.723");
		assertTrue("Error: not correct data detected ", valid);
	}

	/**
	 * Test method for @link com.mrmrmr7.figure.action.Validation#isValidFile(java.io.File).
	 * @throws  
	 */
	@Test
	public void testIsValidFile() {
		valid = validation.isValidFile("src/test/resources/data/data.txt");
		assertTrue("Error: not correct file path detected", valid);
	}

	/**
	 * Test method for @link com.mrmrmr7.figure.action.Validation#isValidFigure(com.mrmrmr7.figure.entity.Figure).
	 */
	@Test
	public void testIsValidFigure() {
		Sphere figure = new Sphere(4,1,2,3);
		valid = validation.isValidFigure(figure);
		assertTrue("Error: not correct figure detected", valid);
	}

}
