package com.mrmrmr7.figure.interfaces;


import java.io.FileNotFoundException;

import com.mrmrmr7.figure.entity.Sphere;

public interface ValidatorInterface {	
	/**
	 * Method to validate data
	 * If line consists of 4 float numbers it return true, but if expected some errors it return false
	 * @param data string that we'll check
	 * @return true if data is valid
	 */
	boolean isValidData(String data) throws NullPointerException;
	
	/**
	 * Method to validate file
	 * @param path way to file
	 * @return true if path is valid
	 * @throws FileNotFoundException 
	 */
	boolean isValidFile(String path) throws FileNotFoundException;
	
	/**
	 * Method to validate figure
	 * @param figure Sphere to validate
	 * @return true if Sphere is possible
	 */
	boolean isValidFigure(Sphere figure);
}
