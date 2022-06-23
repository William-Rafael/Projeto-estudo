package com.example.uploaddownload.exception;

public class FileStorageException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//contructor 
	public FileStorageException(String message) {
		super(message);
	}
	
	//novo contrutor para observar a causa da excecao
	public FileStorageException(String message, Throwable cause) {
		super(message,cause);
	}
	
}
