package fa.mockproject.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import fa.mockproject.entity.Faculty;

public interface FacultyService {

	public List<Faculty> listAll();

	public void save(Faculty faculty);

	public Faculty findById(String facultyId);

	public void delete(Faculty faculty);

	public void deleteById(String facultyId);
	
	public List<Faculty> search(@Param("word") String word);
}