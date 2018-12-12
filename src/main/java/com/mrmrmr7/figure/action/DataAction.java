package com.mrmrmr7.figure.action;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class to work with data
 * @author meow
 * @version 1.0
 */
public class DataAction {	
	private final static Logger log = LogManager.getLogger(DataAction.class);

	private static DataAction instance = new DataAction();
	
	private DataAction() {}
	
	public static DataAction getInstance() {
		return instance;
	}
	/**
	 * Method to parse file in ArrayList{@code <String>} line by line
	 * @param path - way to file that must be parsed
	 * @return ArrayList{@code <String>} with lines of File from "path"
	 */
	public ArrayList<String> readFile(String path) throws IOException {
		ArrayList<String> arr = new ArrayList<String>();
		
		try {
			Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(arr::add);
		} catch (IOException e) {
			log.error("Error occour: " + e.getStackTrace());
			throw new IOException();
		}
		
		log.info("File readed successfully: \"" + path + "\"");
		return arr;
	}
	
	/**
	 * Method to parse line and return Sphere from line
	 * @param data string, contained information for creating Sphere
	 * @return object of class Sphere
	 */
	public double[] parseData(String data) {		
		String[] stringValue = data.split(" ");
		double[] doubleValue = new double[4];
		
		for (int i = 0; i < 4; i++) {
			doubleValue[i] = Double.valueOf(stringValue[i]);
		}
		
		log.info("Data parsed successfully: " + Arrays.toString(doubleValue));
		return doubleValue;
	}

}
