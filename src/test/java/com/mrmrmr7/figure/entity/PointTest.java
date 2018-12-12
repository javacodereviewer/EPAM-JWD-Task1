package com.mrmrmr7.figure.entity;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.mrmrmr7.figure.entity.Point;

public class PointTest {
	private static Point point;
	
	@Before
	public void setUp() throws Exception {
		point = new Point(5,4);
	}
	
	@Test
	public void testGetX() {
		assertEquals("Error: not correct X init: \n", point.getX(), 5, 0.01);
	}
	
	@Test
	public void testGetY() {
		assertEquals("Error: not correct Y init: \n", point.getY(), 4, 0.01);
	}
	
	@Test
	public void testSetX() {
		Point pt = new Point();
		pt.setX(3);
		assertEquals("Error: not correct setX(): \n", pt.getX(), 3, 0.01);
	}
	
	@Test
	public void testSetY() {
		Point pt = new Point();
		pt.setY(3);
		assertEquals("Error: not correct setY(): \n", pt.getY(), 3, 0.01);
	}
}
