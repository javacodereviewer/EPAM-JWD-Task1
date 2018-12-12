package com.mrmrmr7.figure.interfaces;

/**
 * Interface of entity-class
 * @author meow
 * @version 1.0
 */
public interface FigureInterface {
	/**
	 * Method to get @link x field
	 * @return x-field
	 */
	double getX();
	
	/**
	 * Method to set @link x
	 * @param x value which we want set to @link x field
	 */
	void setX(double x);
	
	/**
	 * Method to get @link y field
	 * @return y-field
	 */
	double getY();
	
	/**
	 * Method to set @link y field
	 * @param y value which we want set to @link y field
	 */
	void setY(double y);
}
