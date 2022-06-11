package fa.mockproject.service.mockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Audit;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Long> {

}
