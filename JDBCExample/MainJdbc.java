import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		selectExample();
		insertExample();
		updateExample();
		deleteExample();
	}
	public static void deleteExample() throws SQLException{
		DbHelper helper = new DbHelper();
		Connection connection = null;
		PreparedStatement  statement = null;
		ResultSet resultSet;

		try {
			connection = helper.GetConnection();
			System.out.println("Connected to database");
			String sql = "delete from city where name = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "Düzce");
			int result = statement.executeUpdate();
			System.out.println("Record Deleted to Database: " + result);
		} catch (SQLException sqlException) {
			helper.showErrorMessage(sqlException);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	public static void updateExample() throws SQLException{
		DbHelper helper = new DbHelper();
		Connection connection = null;
		PreparedStatement  statement = null;
		ResultSet resultSet;

		try {
			connection = helper.GetConnection();
			System.out.println("Connected to database");
			String sql = "update city set population = 4000 where name = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "Düzce");
			int result = statement.executeUpdate();
			System.out.println("Record Updated to Database: " + result);
		} catch (SQLException sqlException) {
			helper.showErrorMessage(sqlException);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	public static void insertExample() throws SQLException{
		DbHelper helper = new DbHelper();
		Connection connection = null;
		PreparedStatement  statement = null;
		ResultSet resultSet;

		try {
			connection = helper.GetConnection();
			System.out.println("Connected to database");
			String sql = "insert into city(name, countryCode, district, population) values (?, ?, ?, ?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "Düzce");
			statement.setString(2, "Tur");
			statement.setString(3, "Düzce");
			statement.setInt(4, 1324);
			int result = statement.executeUpdate();
			System.out.println("Record Added to Database: " + result);
		} catch (SQLException sqlException) {
			helper.showErrorMessage(sqlException);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	public static void selectExample() throws SQLException{
		DbHelper helper = new DbHelper();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet;

		try {
			connection = helper.GetConnection();
			System.out.println("Connected to database");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
			ArrayList<Country> countryList = new ArrayList<Country>();
			
			while (resultSet.next()) {
				countryList.add(new Country(
						resultSet.getString("code"), 
						resultSet.getString("name"), 
						resultSet.getString("continent"), 
						resultSet.getString("region")));
				System.out.println(resultSet.getString("name"));
			}
			System.out.println(countryList.size());
		} catch (SQLException sqlException) {
			helper.showErrorMessage(sqlException);
		} finally {
			statement.close();
			connection.close();
		}
	}
}
