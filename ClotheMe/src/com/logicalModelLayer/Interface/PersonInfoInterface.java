package com.logicalModelLayer.Interface;

import java.util.ArrayList;

import com.daogen.clotheme.PersonInformation;

public interface PersonInfoInterface {
	public int Load();
	public int getPerson(long in_PersonID,PersonInformation out_PersonInformation);
	public PersonInformation getPerson(String in_PersonName);//,PersonInformation out_PersonInformation);
	public int setPerson(long in_PersonID,PersonInformation in_PersonInformation);
	public int setPerson(PersonInformation in_PersonInformation);
	public int removePerson(long in_PersonID);
	public int removePerson(String in_PersonName);
	public ArrayList<String> getAllPersonName();
}
