package fa.mockproject.service;

import java.util.List;

<<<<<<< HEAD
=======
import org.springframework.data.repository.query.Param;

>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import fa.mockproject.entity.Faculty;

public interface FacultyService {

	public List<Faculty> listAll();

	public void save(Faculty faculty);

	public Faculty findById(String facultyId);

	public void delete(Faculty faculty);

	public void deleteById(String facultyId);
<<<<<<< HEAD
=======
	
	public List<Faculty> search(@Param("word") String word);
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}