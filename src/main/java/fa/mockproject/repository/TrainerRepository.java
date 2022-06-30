package fa.mockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.mockproject.entity.Trainer;
import fa.mockproject.entity.TrainerProfile;

@Repository
<<<<<<< HEAD
public interface TrainerRepository extends JpaRepository<Trainer,Long>{
=======
public interface TrainerRepository extends JpaRepository<TrainerProfile,Long>{
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

}
