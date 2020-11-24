package com.sammed;

public class BoookMaster {
	
	private int bookId;
	private String bookName;
	private int fkCategoryId;
	private int fkAutherId;
	public void BookMaster() {}
	public BoookMaster(int bookId, String bookName, int fkCategoryId, int fkAutherId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.fkCategoryId = fkCategoryId;
		this.fkAutherId = fkAutherId;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public int getFkCategoryId() {
		return fkCategoryId;
	}
	public int getFkAutherId() {
		return fkAutherId;
	}
	@Override
	public String toString() {
		return "BoookMaster [bookId=" + bookId + ", bookName=" + bookName + ", fkCategoryId=" + fkCategoryId
				+ ", fkAutherId=" + fkAutherId + "]";
	}
	
	
	
	

}
