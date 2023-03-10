import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    static String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe";
    static String user = "system";
    static String pass = "root";
    
	public static void main(String[] args) {
		
		getConnection();

	}
	
	public static void getConnection() {
		
		
		try {
			
			//set class for jdbc
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection(dbUrl,user,pass);
			
			if(con!=null) {
				System.out.println("Setting connection");
			}
			else {
				System.out.println("Error");
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
