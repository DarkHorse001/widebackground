package com.gt.wide.background.service.ex;

public class UsernameNotfoundException extends ServiceException {

	private static final long serialVersionUID = 1316997716304286055L;

	public UsernameNotfoundException() {
		super();
	}

	public UsernameNotfoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UsernameNotfoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsernameNotfoundException(String message) {
		super(message);
	}

	public UsernameNotfoundException(Throwable cause) {
		super(cause);
	}
	
}
