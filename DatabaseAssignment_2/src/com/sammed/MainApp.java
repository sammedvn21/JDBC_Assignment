package com.sammed;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		int choice;
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Create Book Category\n2.Create Auther\n3.Add Book\n4.Show Book Details");
			choice=scan.nextInt();
			switch(choice)
			{
			   case 1: 
				   BookCategory bk=new BookCategory(2,"Adventure");
				   Service s1=new Service();
				   s1.CreateBookCategory(bk);
				   break;
				   
			   case 2:
				   Auther a1=new Auther(2,"Sammed");
				   Service s2=new Service();
				   s2.CreateAuther(a1);
				   break;
				   
			   case 3:
				   BoookMaster bm=new BoookMaster(2,"ABC",2,21);
				   Service s3=new Service();
				   s3.AddBook(bm);
				   break;
				   
			   case 4:Service s4=new Service();
			   			s4.ShowBookDetails();
			   			
				   	    break;
			   default:
				   System.out.println("INVALID");
				   
			}
		}

	}

}
