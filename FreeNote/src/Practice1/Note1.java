package Practice1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Note1 {
	
	private static Note1 instance = new Note1();
	
	public static Note1 getInstance() {
		return instance;
	}
	
	public int insertMember(Note2 member) throws Exception{
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String driver = "";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "scott";
		String dbPass = "tiger";
		
		try {
			Class.forName(driver);
			
			
			
			
			
		}
		
		
		
	
		
		
		
		return result;
	}
	
	
	
	
}
