package fa.mockproject.service.impl;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.mockproject.entity.Trainer;
import fa.mockproject.entity.TrainerProfile;
import fa.mockproject.model.TrainerModel;
import fa.mockproject.repository.TrainerRepository;
import fa.mockproject.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService{
	@Autowired
	private TrainerRepository trainerRepository;
	
	@Override
	public List<TrainerProfile> getAllTrainers() {
		return trainerRepository.findAll();
	}

	@Override
	public void save(TrainerModel trainerModel) {
<<<<<<< HEAD
<<<<<<< HEAD
//		Trainer trainer = new Trainer(trainerModel);
//		trainerRepository.save(trainer);
	}

	private Trainer Trainer(TrainerModel trainerModel) {
		// TODO Auto-generated method stub
		return null;
=======
=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		TrainerProfile trainerProfile = new TrainerProfile(trainerModel);
		Trainer trainer = new Trainer(trainerModel);
		trainerRepository.save(trainerProfile);
	}

	@Override
	public TrainerProfile findByTrainerId(long trainerId) {
		Optional<TrainerProfile> optional = trainerRepository.findById(trainerId);
		TrainerProfile trainer = null;
		if(optional.isPresent()) {
			trainer = optional.get();
		}else {
			throw new RuntimeException("Trainer not found for id"+trainerId);
		}
		return trainer;
<<<<<<< HEAD
=======
	}

	@Override
	public void deleteTrainerProfileById(long id) {
		this.trainerRepository.deleteById(id);
		
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
	}

	@Override
	public void deleteTrainerProfileById(long id) {
		this.trainerRepository.deleteById(id);
		
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
	}

	@Override
	public Trainer findByTrainerId(long trainerId) {
		Optional<Trainer> optional = trainerRepository.findById(trainerId);
		Trainer trainer = null;
		if(optional.isPresent()) {
			trainer = optional.get();
		}else {
			throw new RuntimeException("Trainer not found for id"+trainerId);
		}
		return trainer;
	}


}



