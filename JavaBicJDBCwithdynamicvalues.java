//package mavnm2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BisJDBC2withdynamicdatainsertions {
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
				
				String sql="insert into t1 values(?,?,?)";
				
				
				//3 rd step
				PreparedStatement ps=connection.prepareStatement(sql);
				System.out.println("statement object created ");
				
				// 4step
				ps.setInt(1,4);
				ps.setInt(2,111);
				ps.setInt(3,21);
				ps.execute();
				
				
				
				// 5 step 
				ps.close();
				connection.close();
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		
			
			
		
		
		
	}
			
			

		
}
