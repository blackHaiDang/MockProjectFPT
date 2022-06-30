package fa.mockproject.service;

import java.util.List;

import fa.mockproject.entity.Trainer;
import fa.mockproject.entity.TrainerProfile;
import fa.mockproject.model.TrainerModel;

public interface TrainerService {
<<<<<<< HEAD
<<<<<<< HEAD
	
	List<Trainer> getAllTrainers();
	
	void save(TrainerModel trainerModel);

	Trainer findByTrainerId(long trainerId);
=======
	List<TrainerProfile> getAllTrainers();
	void save(TrainerModel trainerModel);

	TrainerProfile findByTrainerId(long trainerId);
	
	void deleteTrainerProfileById(long id);
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
	List<TrainerProfile> getAllTrainers();
	void save(TrainerModel trainerModel);

	TrainerProfile findByTrainerId(long trainerId);
	
	void deleteTrainerProfileById(long id);
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}
