package src.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.model.StudentDetails;
import src.main.wrapper.Wrapper;

@Component
public class Service {
	@Autowired
	Wrapper wrapper;
	
	public String insertStudentDetails(StudentDetails studentDetails) {
		String response=wrapper.insertStudentDetails(studentDetails);
		return response;
	}
}
