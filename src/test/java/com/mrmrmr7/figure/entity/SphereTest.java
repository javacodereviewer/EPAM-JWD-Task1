package com.mrmrmr7.figure.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SphereTest {
	private static Sphere sphere;
	
	@Before
	public void setUp() throws Exception {
		sphere = new Sphere(5,2,3,4);
	}
	
	@Test
	public void testGetX() {
		assertEquals("Error: bad X init: \n", 2, sphere.getX(), 0.01);
	}
	
	@Test
	public void testGetY() {
		assertEquals("Error: bad Y init: \n", 3, sphere.getY(), 0.01);
	}	
	
	@Test
	public void testGetZ() {
		assertEquals("Error: bad ZS init: \n", 4, sphere.getZ(), 0.01);
	}
	
	@Test
	public void testGetR() {
		assertEquals("Error: bad R init: \n", 5, sphere.getR(), 0.01);
	}
	
	@Test
	public void testSetX() {
		sphere.setX(3);
		assertEquals("Error: not correct setX(): \n", 3, sphere.getX(), 0.01);
	}
	
	@Test
	public void testSetY() {
		sphere.setY(3);
		assertEquals("Error: not correct setY(): \n", 3, sphere.getY(), 0.01);
	}
	
	@Test
	public void testSetZ() {
		sphere.setZ(3);
		assertEquals("Error: not correct setZ(): \n", 3, sphere.getZ(), 0.01);
	}	
	
	@Test
	public void testSetR() {
		sphere.setR(3);
		assertEquals("Error: not correct setY(): \n", 3, sphere.getR(), 0.01);
	}
}
