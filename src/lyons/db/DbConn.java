package lyons.db;
/**
 * 链接数据库
 * @author Lyons
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn
{
	public static Connection getConn()
	{
		Connection conn = null;
		
		String user 	= "root";
		String passwd	= "root";
		String url = "jdbc:mysql://127.0.0.1:3306/ebay?characterEncoding=UTF-8";
		
		//已加载驱动
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url,user,passwd);
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			
		return conn;
	}
	
}
