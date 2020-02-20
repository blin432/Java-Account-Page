package loginGUI;

public class User {
	
	
	private String Name;
	
	private String Username;
	
	private String PW;
	
	
	
	
	
	

	public User(String name, String username, String pW) {
		super();
		Name = name;
		Username = username;
		PW = pW;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}
	
	
	
	
	
	

}
