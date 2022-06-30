package fa.mockproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

import fa.mockproject.entity.Candidate;

<<<<<<< HEAD
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

	void save(TraineeCandidateProfile profile);
=======
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

	@Query(value = "SELECT c from Candidate c where c.candidateId LIKE '%' || :word || '%' "
			+ "OR c.applicationDate LIKE '%' || :word || '%' " + "OR c.status LIKE '%' || :word || '%' "
			+ "OR c.channel LIKE '%' || :word || '%' " + "OR c.location LIKE '%' || :word || '%' "
			+ "OR c.remarks LIKE '%' || :word || '%' ")
	public List<Candidate> search(@Param("word") String word);
}
