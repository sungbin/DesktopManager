package project.team.oodp.desktop;

import project.team.oodp.desktop.login.AccountList;
import project.team.oodp.desktop.login.SuperLogInFactory;
//
public class Main{
	

	public static AccountList accountList = new AccountList(4);
	public static CityList cy = new CityList(16);
	
	public static void main(String[] args) {
	  cy.addCities(new City("America"));
	    cy.addCities(new City("Brazil"));
	    cy.addCities(new City("Iceland"));
	    cy.addCities(new City("Portugal"));
	    
		SuperLogInFactory factory = new SuperLogInFactory();
		factory.createLogIn();
	}	

}