package com.hospitalmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmgmt.model.PatientImpl;
import com.hospitalmgmt.pojo.Patient;


@RestController
public class HosController {
	@Autowired
	PatientImpl pimpl;
	@RequestMapping("/patient")
	public List<Patient> getPatientDetails() {
		return pimpl.getPatient();
	}
	@RequestMapping("/patient/{pid}")
	public Patient getSinglePatient(@PathVariable int pid) {
		return pimpl.getPatientDetail(pid);
	}
	
	@RequestMapping("/check/{pid}")
	public String checkavail(@PathVariable int pid)
	{
		return pimpl.check(pid);
		
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/patient/{pid}")
	public void deletePatient(@PathVariable int pid) {
		pimpl.deleteSinglePatient(pid);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/patient")
	public void createPatient(@RequestBody Patient pat) {
		pimpl.createSinglePatient(pat);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/patient/{pid}")
	public void createPatient(@RequestBody Patient pat,@PathVariable int pid) {
		pimpl.updateSinglePatient(pat,pid);
	}

}
