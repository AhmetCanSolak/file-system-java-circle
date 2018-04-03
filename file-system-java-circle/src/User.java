
public class User {
	String username;
	String password;//hash
	boolean isAdmin;
	
	public User(String username, String pass) {
		this.username = username;
		this.password = pass;
		this.isAdmin = false;
	}
	
	//database for login
	
	public boolean isAdmin() {
		return isAdmin;
	}
}
