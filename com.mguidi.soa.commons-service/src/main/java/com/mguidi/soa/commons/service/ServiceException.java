package com.mguidi.soa.commons.service;

public interface ServiceException {
	
	public static final int STATUS_CODE = 209;
	
	public int getCode();

	public String getMsg();
	
}
