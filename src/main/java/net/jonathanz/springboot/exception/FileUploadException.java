package net.jonathanz.springboot.exception;

import java.io.IOException;

public class FileUploadException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileUploadException(IOException e) {
        super(e);
    }
}
