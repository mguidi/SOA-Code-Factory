package com.mguidi.soa.commons.service;

public interface AuthTokenManager {
	
	public void saveAuthToken(String authToken);
	public String getAuthToken();

}
