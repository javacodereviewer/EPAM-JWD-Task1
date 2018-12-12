package com.mrmrmr7.figure.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.enums.Plane;
import com.mrmrmr7.figure.exception.UndefinedPlaneException;
import com.mrmrmr7.figure.interfaces.ActionInterface;

public class SphereAction implements ActionInterface {
	private final static Logger log = LogManager.getLogger(DataAction.class);
	
	private static SphereAction instance = new SphereAction();
	
	private SphereAction() {}
	
	public static SphereAction getInstance() {
		return instance;
	}
	
	/**
	 * Method to find area of Sphere
	 * Used default formula to find area of Sphere area = 4 * PI * R^2
	 */
	public double area(Sphere a) {		
		final double radius = a.getR();
		return 4 * Math.PI * radius * radius;
	}
	
	/** 
	 * Method to find area of Sphere
	 * Used default formula for volume of Sphere: 4/3 * Pi * R^3;
	 */
	public double volume(final Sphere a) {
		final double radius = a.getR();
		return 4 * Math.PI * radius * radius * radius / 3;
	}
	
	/**
	 * Method to validate Sphere
	 */
	public boolean isRightFigure(final Sphere a) {
		return a.getR() != 0;
	}
	
	/**
	 * Method which returns devided area over undevided
	 */
	public double dissectionByPlane(final Sphere a, Plane plane) {
		double res = 0.0;
		double distToAsix = 0;
		try { 
			if (plane == Plane.XY || plane == Plane.YX) {
				distToAsix = a.getZ();
			} else if (plane == Plane.YZ || plane == Plane.ZY) {
				distToAsix = a.getX();
			} else if (plane == Plane.ZX || plane == Plane.XZ) {
				distToAsix = a.getY();
			} else {
				throw new UndefinedPlaneException();
			}
		} catch (UndefinedPlaneException e) {
			log.warn("Warning: undefined plane");
			distToAsix = a.getZ();
		}
		
		final double R = a.getR();
		
		if (distToAsix < R) {
			double volume = volume(a);
			double h = R - distToAsix;
			double segmentVolume = Math.PI * h * h  * (3 * R - h) / 3;
			res = segmentVolume / volume;
		}
		
		return res;
	}
	
	/**
	 * Method which return true if a Sphere "a" touches a plane "Plane"
	 */
	public boolean isTouchPlane(final Sphere a, Plane plane) {
	
		double distToAsix = 0;
		
		if (plane == Plane.XY || plane == Plane.YX) {
			distToAsix = a.getZ();
		} else if (plane == Plane.YZ || plane == Plane.ZY) {
			distToAsix = a.getX();
		} else if (plane == Plane.ZX || plane == Plane.XZ) {
			distToAsix = a.getY();
		}
		
		return Math.abs(distToAsix - a.getR()) < 0.01;
	}
}

