package Database;

public class Database implements SqlHelperAPI, DB_ConnectivityAPI {

	private string sql;

	/**
	 * 
	 * @param obj
	 * @param rw_mode
	 */
	public string generate(object obj, string rw_mode) {
		// TODO - implement Database.generate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public Connection connection(string sql) {
		// TODO - implement Database.connection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public int write(string sql, Connection conn) {
		// TODO - implement Database.write
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public ResultSet read(string sql, Connection conn) {
		// TODO - implement Database.read
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public void closeConn(string sql, Connection conn) {
		// TODO - implement Database.closeConn
		throw new UnsupportedOperationException();
	}

	public void backupDatabase() {
		// TODO - implement Database.backupDatabase
		throw new UnsupportedOperationException();
	}

	public void restoreDatabase() {
		// TODO - implement Database.restoreDatabase
		throw new UnsupportedOperationException();
	}

	public string getSql() {
		return this.sql;
	}

	/**
	 * 
	 * @param sql
	 */
	public void setSql(string sql) {
		this.sql = sql;
	}

	public Database() {
		// TODO - implement Database.Database
		throw new UnsupportedOperationException();
	}

}