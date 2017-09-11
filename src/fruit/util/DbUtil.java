package fruit.util;

import java.sql.*;

public class DbUtil {
	private final static String URL = "jdbc:mysql://localhost:3306/fruit?autoReconnect=true&useSSL=false";
	private final static String USER = "root";
	private final static String PASSWORD = "zyk2014001997";

	protected static Statement s = null;
	protected static ResultSet rs = null;
	protected static Connection conn = null;

	
	//得到connection
	public synchronized static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	//执行查询语句
	public static int executeUpdate(String sql) {
		int result = 0;
		try {
			s = getConnection().createStatement();
			result = s.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//执行查询语句
	public static ResultSet executeQuery(String sql){
		try {
			s = getConnection().createStatement();
			rs = s.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	//动态执行sql语句
	public static PreparedStatement executePreparedStatement(String sql){
		PreparedStatement ps = null;
		try {
			ps = getConnection().prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ps;
	}
	
	//关闭连接
	public static void close(){
		try {
			if(rs!=null)rs.close();
			if(s!=null)s.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
