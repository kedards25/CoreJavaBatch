package com.learning.storedproceduredemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedureDemo {
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


	public void createProcedure() {
		if (getConnected()) {
			try {
				String proc = "create procedure myProc2 " + 
								"as " + 
								"select *" + 
								" from students ";
				st = con.createStatement();
				int result = st.executeUpdate(proc);

				if (result > 0) {
					System.out.println("Procedure created successfully");
				} else {
					System.out.println("Procedure is either created already" + 
										"or creation failed");
				}

			} catch (SQLException e) {
				System.out.println("SQLException in creating procedure " + e);
			}
		} else {
			System.out.println("Connection failed");
		}
	}

	public void execProcedure() {
		if (getConnected()) {
			try {
				String execProc = "exec myProc2 ";
				CallableStatement callSt = con.prepareCall(execProc);
				rs = callSt.executeQuery();
				while (rs.next()) {
					int id = rs.getInt("stdId");
					String name = rs.getString(2);
					String mail = rs.getString("EmailId");
					String addr = rs.getString("addr");
					System.out.println(id + "\t" + name + "\t" + mail + "" + "\t" + addr);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		StoredProcedureDemo demo = new StoredProcedureDemo();
		//demo.createProcedure();
		demo.execProcedure();

	}

}
