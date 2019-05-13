package project.team.oodp.desktop;

import project.team.oodp.desktop.login.SuperLogInFactory;

public class Main{
	
	public static void main(String[] args) {
		SuperLogInFactory factory = new SuperLogInFactory();
		factory.createLogIn();
	}	

}