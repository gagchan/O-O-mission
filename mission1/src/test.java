import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import work.builder;
import jdbc.lianjie;



public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = lianjie.getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO guitar(builder,price) VALUES (?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "finch");
		pstmt.setDouble(2, 0.99);
		if (pstmt.executeUpdate() > 0) {
			System.out.print("yeah");
		}

		for(int i = 0; i<builder.values().length;i++){
			System.out.println(builder.values()[i]);
		}
		
		
	}

}
