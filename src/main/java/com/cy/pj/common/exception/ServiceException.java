package com.cy.pj.common.exception;

/**
 * 自定义的统一异常类
 * @author Administrator
 *
 */
public class ServiceException extends RuntimeException{

	private static final long serialVersionUID = -6143071993418352986L;

	public ServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
