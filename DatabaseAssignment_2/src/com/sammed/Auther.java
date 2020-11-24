package com.sammed;

public class Auther {

	
	private int autherId;
	private String autherName;
	public Auther() {}
	public Auther(int autherId, String autherName) {
		super();
		this.autherId = autherId;
		this.autherName = autherName;
	}
	public int getAutherId() {
		return autherId;
	}
	public String getAutherName() {
		return autherName;
	}
	@Override
	public String toString() {
		return "Auther [autherId=" + autherId + ", autherName=" + autherName + "]";
	}
	
	
	
	
}
