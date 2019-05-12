package src.main.wrapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.model.StudentDetails;
import src.main.repository.StudentRepository;

@Component
public class Wrapper {
	
	@Autowired
	 StudentRepository studentRepository;
	
	public String insertStudentDetails(StudentDetails studentDetails) {
		studentRepository.save(studentDetails);
		return "data inserted successfully";
		
	}
}
