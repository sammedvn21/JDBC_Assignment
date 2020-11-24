package com.sammed;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {
	
	private Connection conn;
	
	 Service() throws ClassNotFoundException, SQLException
	{
		conn=DbConfig.ConnectDb();
		if(conn==null)
			System.out.println(" Not Connected");
		else
			System.out.println("Connected");
	}
	public void CreateBookCategory(BookCategory category) throws SQLException
	{
		String query=String.format("INSERT INTO BOOKCATEGORY(categoryid,categoryname) VALUES (%d,'%s')"
						,category.getCategoryId(),category.getCategoryName());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("Book Category Created");
				
	}
	
	public void CreateAuther(Auther auther) throws SQLException
	{
		String query=String.format("INSERT INTO AUTHER(autherid,auther_name) VALUES(%d,'%s')"
						,auther.getAutherId(),auther.getAutherName());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("Auther Created");
				
	}
	
	public void AddBook(BoookMaster bookMaster) throws SQLException
	{
		String query=String.format("INSERT INTO BOOKMASTER(bookid,book_name,fkcategoryid,fkautherid) VALUES (%d,'%s',%d,%d)"
									,bookMaster.getBookId(),bookMaster.getBookName(),bookMaster.getFkCategoryId(),bookMaster.getFkAutherId());
		
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("Book Added ");
				
	}
	
	public void ShowBookDetails() throws SQLException
	{
		String query="SELECT bookid,book_name,fkcategoryid,fkautherid FROM BOOKMASTER";
		Statement stmt=conn.createStatement();
		ResultSet R=stmt.executeQuery(query);
		
		while(true)
		{
			if(R.next())
				break;
			System.out.println(String.format("%20d,%20s,%20d,%20d",
												R.getString("bookid"),
												R.getString("book_name"),
												R.getString("fkcategoryid"),
												R.getString("fkautherid")
												));
		}
		
	}

}
