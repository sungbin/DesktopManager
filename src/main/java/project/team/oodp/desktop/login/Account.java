package project.team.oodp.desktop.login;
//
public class Account {
	private String id;
	private String password;
	
	
	public Account(String id, String password){
		this.id = id;
		this.password = password;
	}
	
	
	public String getId(){
		return id;
	}
	
	public String getPassword(){
		return password;
	}
	
	

}
