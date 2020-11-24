package com.sammed;

public class BookCategory {
	
	private int categoryId;
	 private String categoryName;
	 public void libs() {}
	public BookCategory(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	@Override
	public String toString() {
		return "BookCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	
	 

}
