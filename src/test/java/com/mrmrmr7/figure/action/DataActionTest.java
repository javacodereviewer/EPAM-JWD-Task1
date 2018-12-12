package com.mrmrmr7.figure.action;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

public class DataActionTest {
	@Test
	public void testReadFile() throws Exception {
		ArrayList<String> test = new ArrayList<String>();
		DataAction fr = DataAction.getInstance();
		test = fr.readFile("src/test/resources/data/data.txt");
  		assertTrue(test.get(0).equals("1.z0 2.0 3.0"));
	}	
	
	@Test 
	public void testParseData() {
		String data = "3.4 5.3 3.2 4.4";
		DataAction fr = DataAction.getInstance();
		double[] actual = fr.parseData(data);
		double[] expected = new double[] {3.4, 5.3, 3.2, 4.4};
		assertArrayEquals("Error: not correct parsing of line: \n",expected, actual, 0.1);
	}
}
