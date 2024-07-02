package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import _main.Index;

public class DbConnect implements AutoCloseable {

	private final String jdbcUrl = "jdbc:mysql://localhost:3306/" + Index.database + "?serverTimezone=UTC&useSSL=false";
	private final String dbId = Index.dbId;
	private final String dbPw = Index.dbPw;
	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public DbConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(jdbcUrl, dbPw, dbId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() throws Exception {
		return conn.createStatement();
	}

	public PreparedStatement getPrepare(String sql) throws Exception {
		return conn.prepareStatement(sql);
	}

	@Override
	public void close() throws Exception {
		conn.close();
	}

}
