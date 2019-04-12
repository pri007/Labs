/**
 * 
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author GANGWAR
 *
 * 
 */
public class Myconnection {
	private static Connection con;
	static 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pri","1234");
			System.out.println("Connected!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return con;
	}

}
