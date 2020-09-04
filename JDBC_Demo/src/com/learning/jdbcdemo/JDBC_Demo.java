package com.learning.jdbcdemo;

import java.sql.*;

public class JDBC_Demo {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB";
	String user = "sa";
	String password = "sasa";
	Connection con = null;
	Statement st = null;
	String q = null;
	ResultSet rs = null;
	PreparedStatement pSt=null;
	int rowsAffected=0;
	int id;
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

	// code to read data
	void readData() {
		// code will be executed only if connection is successful
		if (getConnected()) {
			try {
				st = con.createStatement();
				q = "select * from students";
				//we pass query as param to executeQuery() method when we use statement object
				rs = st.executeQuery(q);
				System.out.println("id:  \tname  \tmail  \t\taddr");
				while (rs.next()) {
					int id = rs.getInt("stdId");
					String name = rs.getString(2);
					String mail = rs.getString("EmailId");
					String addr = rs.getString("addr");
					System.out.println(id + "\t" + name + "\t" + mail + "" + "\t" + addr);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQLException while reading data " + e);
			}
		} else {
			System.out.println("Connection failed");
		}
	}

	void createData() {
		id=11;
		String name="Mihir";
		String mail="mihir@gmail.com";
		String address="santacruz";
		
		if(getConnected())
		{
			try {
				String q="insert into students values(?,?,?,?)";
				//we pass query as param to preparedStatment when we use preparedStatement object
				pSt=con.prepareStatement(q);
				pSt.setInt(1, id);
				pSt.setString(2, name);
				pSt.setString(3, mail);
				pSt.setString(4, address);
				//After inserting the data we get number of rows affected
				//i.e. integer value so we will use function which will
				//return number of rows affected
				rowsAffected=pSt.executeUpdate();
				if(rowsAffected>0)
				{
					System.out.println("Data inserted");
				}
				else
				{
					System.out.println("Data insertion failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQLException while inserting data " + e);
			}
		}	
	}
	
	void updateData(int id)
	{
		this.id=id;
		String addres="Khar";
		
		if(getConnected())
		{
			try {
				String q="update students "
						+ "set addr=? "
						+ "where stdid=?";
				//we pass query as param to preparedStatment when we use preparedStatement object
				pSt=con.prepareStatement(q);
				pSt.setInt(2, id);
				pSt.setString(1, addres);
			
				//After inserting the data we get number of rows affected
				//i.e. integer value so we will use function which will
				//return number of rows affected
				rowsAffected=pSt.executeUpdate();
				if(rowsAffected>0)
				{
					System.out.println("Data updated");
				}
				else
				{
					System.out.println("Data updation failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQLException while updating data " + e);
			}
		}
	}

	public static void main(String[] args) {

		JDBC_Demo demo = new JDBC_Demo();
		demo.readData();
		//demo.createData();
		//demo.updateData(11);

	}

}
