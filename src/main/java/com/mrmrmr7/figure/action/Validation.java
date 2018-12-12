package com.mrmrmr7.figure.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.exception.ImpossibleFigureException;
import com.mrmrmr7.figure.exception.NotValidDataException;
import com.mrmrmr7.figure.interfaces.ValidatorInterface;

/**
 * Class contains methods to valid data 
 * @author meow
 * @version 1.0
 */
public class Validation implements ValidatorInterface{	
	private final static Logger log = LogManager.getLogger(DataAction.class);
	
	private static Validation instance = new Validation();
	
	private Validation() {}
	
	public static Validation getInstance() {
		return instance;
	}	
	
	/**
	 * Method returns true if string data contains of 4 double numbers
	 * @param data line, which we check by {@link Matcher}
	 * @return true if data contains of 4 double numbers
	 */
	public boolean isValidData(final String data) throws NullPointerException {
		if(data == null) {
			log.error("Error: Null string found");
			throw new NullPointerException();
		}
		
		final String remade = data.trim();		
		final Pattern P = Pattern.compile("[\\d]+.+[\\d]+[\\s]+[\\d]+.+[\\d]+[\\s]+[\\d]+.+[\\d]");
		final Matcher M = P.matcher(remade);
		
		boolean flag = false;
				
		try {
			if (!M.matches()) {
				throw new NotValidDataException(data);
			}
			flag = true;
			log.info("Data valided successfully: " + data);
		} catch (NotValidDataException e) {
			log.error("Exception: bad data excepted " + e.getStackTrace());
		} catch (Exception e) {
			log.error("Exception: " + e.getStackTrace());
		}
		
		return flag;
	} 

	/**
	 * Method for validation of file path
	 * @param path way to file
	 * @return true if file by path "path" is exist
	 */
	public boolean isValidFile(String path) {
		boolean isExist = false;
		
		try {
			File file = new File(path);
			if (!file.exists()) {
				throw new FileNotFoundException("Path to file is not correct");
			}
			isExist = true;
			log.info("File valided successfully: \"" + path + "\"");
		} catch (NullPointerException e) {
			log.error("Error: path return a null pointer: " + e.getStackTrace());
		} catch (FileNotFoundException e) {
			log.error("Error: file not found: " + e.getStackTrace());
		} 
		
		return isExist;
	}
	
	/**
	 * Method to validate Figure
	 * @param figure, which we check
	 * @return true if this figure is possible
	 */
	public boolean isValidFigure(Sphere figure) {
		boolean res = false;
		
		try {
			if (figure.getR() <= 0) {
				throw new ImpossibleFigureException("Sphere is not possible: " + figure.toString());
			} else {
				res = true;
				log.info("Figure valided successfully: " + figure.toString());
			}
		} catch (ImpossibleFigureException e) {
			log.error("Error: impossible figure found: " + e);
		}
		return res;
	}

}
