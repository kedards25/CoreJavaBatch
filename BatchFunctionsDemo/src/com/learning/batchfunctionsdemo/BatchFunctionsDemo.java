package com.learning.batchfunctionsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchFunctionsDemo {

	String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB";
	String user = "sa";
	String password = "sasa";
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;

	int[] rows;

	// Checking for successful connection
	boolean getConnected() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException in connecting DB " + e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ClassNotFoundException " + e);
		}
		return false;
	}

	void createBatch() {
		if (getConnected()) {
			try {
				// making sure that all statements are getting executed in
				// batch and not as single statement
				con.setAutoCommit(false);
				st = con.createStatement();
				st.addBatch("insert into students values(12,'Nikita','nikita@gmail.com','Goregaon')");
				st.addBatch("insert into students values(13,'Aniket','aniket@gmail.com','Goregaon')");
				st.addBatch("insert into students values(14,'Mihir','mihir@gmail.com','Parle')");
				rows = st.executeBatch();
				con.commit();
				if (rows.length > 0) {
					System.out.println("Batch executed successfully");
				} else {
					System.out.println("Batch execution failed");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		BatchFunctionsDemo demo = new BatchFunctionsDemo();
		demo.createBatch();
	}

}
