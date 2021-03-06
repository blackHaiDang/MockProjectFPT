package fa.mockproject.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import fa.mockproject.entity.TraineeCandidateProfileStatus;

public interface TraineeCandidateProfileStatusService {
	public List<TraineeCandidateProfileStatus> listAll();

	public void save(TraineeCandidateProfileStatus status);

	public TraineeCandidateProfileStatus findById(String statusId);

	public void delete(TraineeCandidateProfileStatus status);

	public void deleteById(String statusId);
	
	public List<TraineeCandidateProfileStatus> search(@Param("word") String word);
}

