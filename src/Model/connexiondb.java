package Model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connexiondb {




	
		
		private static  String url = "jdbc:mysql://localhost:3306/stock06_08_2019";
		private static  String user = "root";
		private static  String passwd = "28121993A";
		private static Connection conn;
		
	public static Connection  getconnection() {
		
		
		try {
			if (conn==null ||conn.isClosed()) {
				
				 conn = DriverManager.getConnection(url, user,
						passwd);
			}
			//System.out.println("Driver O.K.");
			
			
			
				
			System.out.println("Connexion effective !");
			} catch (SQLException e) {
			
			System.err.println("accesso rifiutato al DB");
			throw new RuntimeException("error di accesso", e);
			}
	return conn;
	}
	

}
