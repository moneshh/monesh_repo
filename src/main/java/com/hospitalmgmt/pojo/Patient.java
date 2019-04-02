package com.hospitalmgmt.pojo;

public class Patient {
	int pid;
	String name;
	String disease;
	
	public Patient()
	{
		
	}
	public Patient(int pid,String name,String disease)
	{
		this.pid=pid;
		this.name=name;
		this.disease=disease;
	}
	public int getID()
	{
	  return pid;	
	}
	
	public void setID()
	{
		this.pid=pid;
	}
	public String getName()
	{
	  return name;	
	}
	
	public void setName()
	{
		this.name=name;
	}
	
	public String getDisease()
	{
	  return disease;	
	}
	
	public void setDisease()
	{
		this.disease=disease;
	}
	
	

}
