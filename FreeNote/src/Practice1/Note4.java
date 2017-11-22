package Practice1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class CallableStatementTest {

	public static void main(String[] args) {

		String driver = "";
		String url = "";
		String sql;
		
		Connection con = null;
		CallableStatement cs = null;

		System.out.println("Å»ÅðÇÒ È¸¿ø¸í ÀÔ·Â?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call del_ename(?)}";
			
			cs = con.prepareCall(sql);
			cs.setString(1, name);
			cs.execute();
			
	
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}