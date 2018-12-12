package com.mrmrmr7.figure.interfaces;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.enums.Plane;

/**
 * Action.java
 * Interface for actions with object
 * @author meow
 * @version 1.0
 */
public interface ActionInterface {
	
	/**
	 * Method to find field of a figure
	 * @param a figure, which area we want to count
	 * @return field of this figure
	 */
	double area(Sphere a);
	
	/**
	 * Method to find volume of a figure
	 * @param a figure, which volume we want to count
	 * @return volume of this figure
	 */
	double volume(Sphere a);
	
	/** Method to find ratio of volumes, devided by some flat
	 * @param a figure which ratio we want to find
	 * @param plane name of flat
	 * @return ratio of volumes (separated volume divided by other volume
	 */
	double dissectionByPlane(final Sphere a,  Plane plane);
	
	/**
	 * Method to check figure valid
	 * @param a figure, which we'll check
	 * @return true if this figure is possible and false if this figure is impossible
	 */
	boolean isRightFigure(final Sphere a);
	
	/** 
	 * Method to check if figure Touch some plane
	 * @param a figure which we'll check
	 * @param plane what the plane we want to check
	 * @return true if figure touch this plane andfalse if not
	 */
	boolean isTouchPlane(final Sphere a, Plane plane);
}
