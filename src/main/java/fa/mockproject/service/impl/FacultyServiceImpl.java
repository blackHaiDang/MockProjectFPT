package fa.mockproject.service.impl;

<<<<<<< HEAD

=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.data.repository.query.Param;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.stereotype.Service;

import fa.mockproject.entity.Faculty;
import fa.mockproject.repository.FacultyRepository;
<<<<<<< HEAD

@Service
public class FacultyServiceImpl {
=======
import fa.mockproject.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService{
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
	@Autowired
	private FacultyRepository repo;

	public List<Faculty> listAll() {
		return (List<Faculty>) repo.findAll();
	}

	public void save(Faculty faculty) {
		repo.save(faculty);
	}

	public Faculty findById(String facultyId) {
		Optional<Faculty> location = repo.findById(facultyId);
		return location.get();
	}

	public void delete(Faculty faculty) {
		repo.delete(faculty);
	}

	public void deleteById(String facultyId) {
		repo.deleteById(facultyId);
	}

<<<<<<< HEAD
=======
	public List<Faculty> search(@Param("word") String word) {
		return (List<Faculty>) repo.search(word);
	}
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}
