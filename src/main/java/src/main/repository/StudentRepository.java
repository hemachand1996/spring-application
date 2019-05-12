package src.main.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import src.main.model.StudentDetails;

import org.springframework.data.mongodb.repository.MongoRepository;

@Component
@Repository
public interface StudentRepository extends MongoRepository<StudentDetails,String> {
	  StudentDetails save(StudentDetails studentDetails);
}
