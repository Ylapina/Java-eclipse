package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Country;

public class CountryDB implements DAO<Country> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/country?allowPublicKeyRetrieval=true&useSSL=false";
		
		String username="country_user";
		String password = "flower";
		Connection Connection = DriverManager.getConnection(dbURL,
				username, password);
		return Connection;
	}

	@Override
	public Country get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> getAll() throws SQLException {
		List<Country> countries = new ArrayList<Country>();
		Connection conn = getConnection();
		Statement stmt =conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select*from Country");
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Country c = new Country(id, name);
			countries.add(c);
		}
		rs.close();
		return countries;
			
		
	}

	@Override
	public boolean add(Country c) throws SQLException {
		boolean success = false;
		Connection Connection = getConnection();
		String query = "insert into country"+ "(id, name)"+
				"values ('"+c.getId()+"',' "+ c.getName()+"')";
		Statement stmt = Connection.createStatement();
		int rowCount = stmt.executeUpdate(query);
		if(rowCount>0)success =true;
		return false;
		
		
	}

	@Override
	public boolean update(Country c) throws SQLException {
		boolean success = false;
		Connection Connection = getConnection();
		String query = "UPDATE Country Set"+
		"  Id= '" + c.getId()+"' "+
		" name= '"+ c.getName()+"' "+
		" WHERE CountryId = '" + c.getId() + "'";
		Statement stmt = Connection.createStatement();
		int rowCount = stmt.executeUpdate(query);
		if(rowCount>0)success =true;
		
		
		return false;
	}

	@Override
	public boolean delete(Country c) throws SQLException {
		boolean success = false;
		Connection Connection = getConnection();
		String query = "DELETE FROM Country"+
		"WHERE CountryID = '"+ c.getId()+ "'";
		Statement stmt = Connection.createStatement();
		int rowCount = stmt.executeUpdate(query);
        if(rowCount>0)success =true;
		
		
		return false;
		
	}

}
