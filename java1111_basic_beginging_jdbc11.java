//package mavnm2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Basicstartingjdbc {
	private static String url="jdbc:postgresql://localhost:5432/School";
	private static String user="postgres";
	
	private static String password="123";

	public static void main(String [] pkl)  {
				
		
			try {
				// 1st step 
				Class.forName("org.postgresql.Driver");
				System.out.println("driver created");
				
				// 2nd step 
				Connection connection=DriverManager.getConnection(url,user,password);
				System.out.println("connection creted");
				
				String sql="insert into t1 values(3,123,24)";
				
				//3 rd step
				Statement pstm =connection.createStatement();
				System.out.println("statement object created ");
				
				// 4step
				pstm.execute(sql);
				System.out.println("sql statement executed");
				
				
				// 5 step 
				pstm.close();
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		
			
			
		
		
		
	}
			
			

		
}
