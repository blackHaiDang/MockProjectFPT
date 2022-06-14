package fa.mockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.ClassBatch;
import fa.mockproject.entity.enumtype.ClassBatchStatusEnum;

@Repository
public interface ClassBatchRepository extends JpaRepository<ClassBatch, Long> {

	void save(ClassBatchStatusEnum plannedstatus);

}
