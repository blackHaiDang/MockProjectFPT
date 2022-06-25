package fa.mockproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Long> {
	
	List<Trainee> findAll();
}
