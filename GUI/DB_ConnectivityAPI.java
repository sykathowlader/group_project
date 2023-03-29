package GUI;

public abstract interface DB_ConnectivityAPI {

	/**
	 * 
	 * @param sql
	 */
	abstract Connection connection(string sql);

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract int write(string sql, Connection conn);

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract ResultSet read(string sql, Connection conn);

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract void closeConn(string sql, Connection conn);

	abstract void backupDatabase();

	abstract void restoreDatabase();

}