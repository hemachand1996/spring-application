package src.main.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.main.model.StudentDetails;
import src.main.service.Service;

@Component
@RestController

public class Controller {
	
	@Autowired
	Service service;
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public ResponseEntity<?> fetchStudentDetails(@RequestBody StudentDetails studentDetails){
		
		String response=service.insertStudentDetails(studentDetails);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
}
