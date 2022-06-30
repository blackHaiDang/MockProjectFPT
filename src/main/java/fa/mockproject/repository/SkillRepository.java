package fa.mockproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, String>{

	@Query(value = "SELECT f from Skill f where f.skillId LIKE '%' || :word || '%' "
			+ "OR f.skillName LIKE '%' || :word || '%' " + "OR f.remarks LIKE '%' || :word || '%' ")
	public List<Skill> search(@Param("word") String word);
}
