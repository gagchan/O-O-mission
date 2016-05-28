package jdbc;
import java.sql.*;


public class lianjie {
	//static String url="jdbc:sqlserver://localhost:1433; DatabaseName=test";
	static String url="jdbc:sqlite://e:/study/oo/homework/mission2.db";
	static Connection conn=null;
	public static Connection getConnection(){
		
	  try{
		 Class.forName("org.sqlite.JDBC");	
		 conn=DriverManager.getConnection(url);
		 System.out.println("Success loading Sqlite Driver!");  
		}catch(ClassNotFoundException e){
			
		}		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("e loading Sqlite Driver!");

			e.printStackTrace();
		}
		
		return conn;
	}

}
