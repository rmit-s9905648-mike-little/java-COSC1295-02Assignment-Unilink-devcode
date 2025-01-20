package dev.research.devcode.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectsqltest  
{
	public static void main(String[] args) 
	{
		final String DB_NAME = "testDB";
		final String TABLE_NAME = "POSTS";
		
		//use try-with-resources Statement
		try (Connection con = connectionTest.getConnection(DB_NAME);
				Statement stmt = con.createStatement();
		) {
			String query = "SELECT * FROM " + TABLE_NAME;
			
			try (ResultSet resultSet = stmt.executeQuery(query)) 
			{
				while(resultSet.next()) 
				{
					System.out.printf(
							"pst_id: %d | pst_name: %s | pst_description: %s | pst_creatid: %s | pst_date: %s  | pst_status: %s  \n",
							resultSet.getInt("pst_id"), 
							resultSet.getString("pst_name"), 
							resultSet.getString("pst_description"),
							resultSet.getString("pst_creatid"),
							resultSet.getString("pst_date"),
							resultSet.getString("pst_status")
							);
				}
			} catch (SQLException e) 
			{
				System.out.println(e.getMessage());
			}

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}

