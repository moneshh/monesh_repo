package com.hospitalmgmt.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hospitalmgmt.pojo.Patient;
@Service
public class PatientImpl {
	 
	List<Patient> pat=new ArrayList<>(Arrays.asList(new Patient(1,"Kruthi","Headache"),new Patient(2,"Monesh","jaundice")));
    List<String> doc = Arrays.asList( "jaundice", "cold", "headache");

       
	
	public List<Patient> getPatient() {

		return pat;
	}
	public Patient getPatientDetail(int pid) {

		for (int i = 0; i < pat.size(); i++) {
			if (pat.get(i).getID() == pid)
				return pat.get(i);
		}
		return null;

	}
	public String check(int pid)
	{
		String s=" ";
	
		for(int i=0;i<pat.size();i++)
		{
			String dis=pat.get(i).getDisease();
			for(int j=0;j<doc.size();j++)
			{
				if(doc.get(i)==dis)
					s="yes,available";
				else
					s="sorry!not available";
			}
		}
		return s;
	}
	public void deleteSinglePatient(int pid) {
		for(int i=0;i<pat.size();i++)
		{
			if(pat.get(i).getID()==pid)
				pat.remove(pat.get(i));
		}
		
	}
	public void createSinglePatient(Patient pat2) {
		pat.add(pat2);

	}
	public void updateSinglePatient(Patient pat2, int pid) {
		for(int i=0;i<pat.size();i++)
		{
			if(pat.get(i).getID()==pid)
				pat.set(i, pat2);
		}
		
	}

	

	
}

