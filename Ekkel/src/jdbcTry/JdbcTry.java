package jdbcTry;

import java.sql.*;

class MySqlAccess {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void readDB() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/test_java?"
							+ "user=OrestO&password=OrestO2410&characterEncoding=utf8");
			// + "user=OrestO&password=OrestO2410");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			statement.execute("DROP TABLE IF EXISTS test;");
			// Result set get the result of the SQL query
			statement.execute("CREATE TABLE test  ("
					+ "id int not null auto_increment primary key, "
					+ "lastname varchar(25) not null, "
					+ "firstname varchar(25) not null, "
					+ "middlename varchar(25) not null) "
					+ "DEFAULT CHARACTER SET = utf8 "
					+ "COLLATE = utf8_general_ci;");

			statement.execute("INSERT INTO test "
					+ "VALUES(default, '����������', 'Orest', 'Igorovuch');");

			resultSet = statement.executeQuery("Select * FROM test;");
			writeResultSet(resultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void writeMetaData(ResultSet resultSet) throws SQLException {
		// Now get some metadata from the database
		// Result set get the result of the SQL query

		System.out.println("The columns in the table are: ");

		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			System.out.print("Column " + i + " "
					+ resultSet.getMetaData().getColumnName(i));
		}
		System.out.println();
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
				System.out.printf("%-10s => %-10s\n", resultSet.getMetaData()
						.getColumnName(i), resultSet.getString(i));
			}
			System.out.println();
		}
	}

	// You need to close the resultSet
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}
}

/**
 * @author orecto
 * 
 */
public class JdbcTry {
	public static void main(String[] args) throws Exception {
		MySqlAccess dao = new MySqlAccess();
		dao.readDB();
	}

}
