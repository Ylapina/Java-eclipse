package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB implements DAO<Stuffy> {
	
	
	private Connection getConnection() throws SQLException{
		String dbURL = "jdbc:mysql://localhost:3306/stuffy?allowPublicKeyRetrieval=true&useSSL=false";
		String username = "stuffy_user";
		String password = "sesame";
		Connection Connection = DriverManager.getConnection(
				dbURL, username, password);
		return Connection;
		
	}

	@Override
	public Stuffy get(String code) {

		return null;
	}

	@Override
	public List<Stuffy> getAll() throws SQLException {
		List<Stuffy> stuffies= new ArrayList<Stuffy>();
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select*from Stuffy");
		while(rs.next()) {
			int id = rs.getInt(1);
			String type = rs.getString(2);
			String color = rs.getString(3);
			String size = rs.getString(4);
			Stuffy s = new Stuffy(id,type,color,size);
			stuffies.add(s);
		}
		rs.close();
		return stuffies;
	}

	@Override
	public boolean add(Stuffy s) throws SQLException {
		boolean success = false;
    Connection connection = getConnection();
		String query = "insert into stuffy" + 
				"(type, color, size)" + 
				"values ('"+s.getType()+"',' "+ s.getColor()+"','"+s.getSize()+"')";
		Statement stmt = connection.createStatement();
		int rowCount = stmt.executeUpdate(query);
		if(rowCount>0)success =true;
		return false;
	}

	@Override
	public boolean update(Stuffy t) {
		// not coding this right now to do later
		return false;
	}

	@Override
	public boolean delete(Stuffy s) throws SQLException {
		Connection conn = getConnection();
		String query = "DELETE from Stuffy WHERE ID ="+s.getId();
		Statement stmt = conn.createStatement();
		int rawCount = stmt.executeUpdate(query);
		boolean success = false;
		if(rawCount>0)success = true;
		return success;
	}

}
