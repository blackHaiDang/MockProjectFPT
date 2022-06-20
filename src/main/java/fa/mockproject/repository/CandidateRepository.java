package fa.mockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Candidate;
import fa.mockproject.entity.TraineeCandidateProfile;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

	void save(TraineeCandidateProfile profile);

}
