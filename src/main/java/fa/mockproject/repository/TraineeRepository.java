package fa.mockproject.repository;

<<<<<<< HEAD
import java.util.List;

=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Long> {
	
<<<<<<< HEAD
	List<Trainee> findAll();
=======
	Trainee findByTraineeCandidateId(long id);
	
	
	Page<Trainee> findAll(Pageable pageable);
	
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}
