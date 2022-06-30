package fa.mockproject.service;

import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.stereotype.Service;
=======
import org.springframework.data.repository.query.Param;

import fa.mockproject.entity.Candidate;
import fa.mockproject.entity.TraineeCandidateProfile;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

=======
import org.springframework.data.repository.query.Param;

import fa.mockproject.entity.Candidate;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import fa.mockproject.entity.TraineeCandidateProfile;

@Service
public interface TraineeCandidateProfileService {
	
	public List<TraineeCandidateProfile> listAll();
	

	public void save(TraineeCandidateProfile profile);

	public TraineeCandidateProfile findById(long profileId);

	public void delete(TraineeCandidateProfile profile);

	public void deleteById(long profileId);
	
	public List<TraineeCandidateProfile> search(@Param("word") String word);
	
	public TraineeCandidateProfile findByCandidate(Candidate candidateId);
}
