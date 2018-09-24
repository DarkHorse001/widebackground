package com.gt.wide.background.service.ex;

public class GoodConflictException extends ServiceException {

	private static final long serialVersionUID = 1554960202828753572L;

	public GoodConflictException() {
		super();
	}

	public GoodConflictException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GoodConflictException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoodConflictException(String message) {
		super(message);
	}

	public GoodConflictException(Throwable cause) {
		super(cause);
	}

}
