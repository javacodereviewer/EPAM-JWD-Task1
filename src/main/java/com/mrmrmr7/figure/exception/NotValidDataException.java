package com.mrmrmr7.figure.exception;

@SuppressWarnings("serial")
public class NotValidDataException extends Exception {
	public NotValidDataException() {
		super();
	};
	
	public NotValidDataException(String msg) {
		super(msg);
	}
}
