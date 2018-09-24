package com.gt.wide.background.service.ex;

/**
 * 查询不到商品时返回的异常
 * @author qin
 *
 */
public class GoodNotFoundException extends ServiceException {

	private static final long serialVersionUID = 8145579071193099081L;

	public GoodNotFoundException() {
		super();
	}

	public GoodNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GoodNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoodNotFoundException(String message) {
		super(message);
	}

	public GoodNotFoundException(Throwable cause) {
		super(cause);
	}
}
