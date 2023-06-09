package Interfaces;

import java.sql.SQLException;

import POJOS.FamilyContact;

public interface FamilyContactManager {
	
	//add a family contact
	public void addFamilyContact (FamilyContact familycontact) throws SQLException;
	
	
	//update the info of a family contact
	public void updateFamilyContactInfo(FamilyContact familycontact);
	
	public FamilyContact searchFamilyContactbyId ( int id);
	
	public int searchFamilycontacIdfromUId(int id);
	
	
	
}
