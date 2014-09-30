package util;

import java.sql.*;

public class DataBaseConnection {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/progra1";
	private static final String USER="root";
	private static final String PASSWORD="root";
	
	static{
		try{
			Class.forName(DRIVER);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

		public static Connection opemConnection(){
			Connection con=null;
			try{
				con=DriverManager.getConnection(URL, USER, PASSWORD);
				if(!con.isClosed()){
					System.out.println("Se abrio la conexion");
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
			return con;
		}
		public static void closeConnection(Connection con){
			if(con!=null){
				try{
					con.close();
					System.out.println("Se cerro la conexion");
				} catch (SQLException e){
					System.out.println("No se cerro la conexion");
					e.printStackTrace();
				}
			}
		}
}
