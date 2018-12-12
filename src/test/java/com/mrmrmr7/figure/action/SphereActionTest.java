package com.mrmrmr7.figure.action;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.enums.Plane;
import com.mrmrmr7.figure.action.SphereAction;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SphereActionTest {
	public static Sphere sphere;
	public SphereAction calculate = SphereAction.getInstance();
	
	@Before
	public void setUp() throws Exception {
		sphere = new Sphere(4, 1, 2, 3);
	}

	@Test
	public void testArea() {
		double square = calculate.area(sphere);
		assertEquals("Error: not correct square calculate: \n" , 201.056, square, 0.01);
	}
	
	@Test
	public void testVolume() {
		double volume = calculate.volume(sphere);
		assertEquals("Error: not correct volume calculate: \n", 268.08, volume, 0.01);
	}
	
	@Test 
	public void testIsRightFigure() {
		assertTrue("Error: not correct checking of figure: \n", calculate.isRightFigure(sphere));
	}
	
	@Test
	public void testDissectionByPlaneWithXY() {
		double ratio = calculate.dissectionByPlane(sphere, Plane.XY);
		assertEquals("Error: not correct ratio for XY: \n", 0.04, ratio, 0.01);
	}
	
	@Test
	public void testDissectionByPlaneWithXZ() {
		double ratio = calculate.dissectionByPlane(sphere, Plane.XZ);
		assertEquals("Error: not correct ratio for XY: \n", 0.162, ratio, 0.01);
	}
	
	@Test
	public void testDissectionByPlaneWithZY() {
		double ratio = calculate.dissectionByPlane(sphere, Plane.ZY);
		assertEquals("Error: not correct ratio for XY: \n", 0.31, ratio, 0.01);
	}

	@Test
	public void testIsTouchPlaneXY() {
		boolean isTouch = calculate.isTouchPlane(sphere, Plane.XY);
		assertEquals("Error: not correct comparing: \n", false, isTouch);
	}
	
	@Test
	public void testIsTouchPlaneXZ() {
		boolean isTouch = calculate.isTouchPlane(sphere, Plane.XZ);
		assertEquals("Error: not correct comparing: \n", false, isTouch);
	}
	
	@Test
	public void testIsTouchPlaneYZ() {
		boolean isTouch = calculate.isTouchPlane(sphere, Plane.ZY);
		assertEquals("Error: not correct comparing: \n", false, isTouch);
	}
}