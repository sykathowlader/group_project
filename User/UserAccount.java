package User;

public class UserAccount {

	private int id;
	private string name;
	private string surname;
	private string username;
	private string password;
	private string email;
	private strin role;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public string getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	public string getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(string surname) {
		this.surname = surname;
	}

	public string getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(string username) {
		this.username = username;
	}

	public string getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(string password) {
		this.password = password;
	}

	public string getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(string email) {
		this.email = email;
	}

	public strin getRole() {
		return this.role;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(strin role) {
		this.role = role;
	}

	public void login() {
		// TODO - implement UserAccount.login
		throw new UnsupportedOperationException();
	}

	public void logout() {
		// TODO - implement UserAccount.logout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param username
	 */
	public UserAccount(int id, string username) {
		// TODO - implement UserAccount.UserAccount
		throw new UnsupportedOperationException();
	}

}