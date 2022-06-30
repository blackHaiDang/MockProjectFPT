package fa.mockproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.TraineeCandidateProfileStatus;

@Repository
<<<<<<< HEAD
<<<<<<< HEAD
public interface TraineeCandidateProfileStatusRepository extends JpaRepository<TraineeCandidateProfileStatus, String>{
=======
public interface TraineeCandidateProfileStatusRepository extends JpaRepository<TraineeCandidateProfileStatus, String> {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
public interface TraineeCandidateProfileStatusRepository extends JpaRepository<TraineeCandidateProfileStatus, String> {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

	@Query(value = "SELECT t from TraineeCandidateProfileStatus t where t.profileStatusId LIKE '%' || :word || '%' "
			+ "OR t.status LIKE '%' || :word || '%' ")
	public List<TraineeCandidateProfileStatus> search(@Param("word") String word);
}
