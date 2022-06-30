package fa.mockproject.service;

import org.springframework.data.domain.Pageable;

import fa.mockproject.model.TraineeModel;
<<<<<<< HEAD
<<<<<<< HEAD
import fa.mockproject.repository.TraineeCandidateProfileRepository;
import fa.mockproject.repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	TraineeRepository traineeRepository;
	
	@Autowired
	TraineeCandidateProfileRepository traineeCandidateProfileRepository;
	
	public List<TraineeModel> getTraineeModelList() {
		List<TraineeModel> traineeModels = new ArrayList<>();
 		ArrayList<Trainee> trainees = (ArrayList<Trainee>) traineeRepository.findAll();
		for(Trainee trainee : trainees) {
			TraineeModel traineeModel = new TraineeModel();
			traineeModel.setId(trainee.getTraineeCandidateID());
//			traineeModel.setAccount(trainee.getTraineeAccount());
			traineeModel.setFullName(trainee.getTraineeCandidateProfile().getFullName());
//			traineeModel.setStatus(trainee.getListStatus().get(0).getRemarks());
			traineeModels.add(traineeModel);
		}
		return traineeModels;
	}


	public TraineeModel getTraineeModel(long id) {
		Trainee trainee = traineeRepository.findById(id).get();
		TraineeModel traineeModel = new TraineeModel();
		traineeModel.setId(trainee.getTraineeCandidateID());
//		traineeModel.setStatus(trainee.getListStatus().get(0).getRemarks());
//		traineeModel.setAllocationStatus(trainee.get);
		traineeModel.setGender(trainee.getTraineeCandidateProfile().getGender());
		traineeModel.setFullName(trainee.getTraineeCandidateProfile().getFullName());
//		traineeModel.setDOB
//		traineeModel.setUniversityName(trainee.get);
//		traineeModel.setFalcutyName(null);
		traineeModel.setPhone(trainee.getTraineeCandidateProfile().getPhone());
		traineeModel.setEmail(trainee.getTraineeCandidateProfile().getEmail());
		
		return traineeModel;
	}


// 	public void update(TraineeModel traineeModelForm) {
// 		Optional<Trainee> trainees = traineeRepository.findById(traineeModelForm.getId());
// 		Trainee trainee = trainees.get();
// 		traineeCandidateProfileRepository.update(trainee.getTraineeCandidateProfile().getTraineeCandidateProfileId(), 
// 				traineeModelForm.getFullName(), traineeModelForm.getPhone(), traineeModelForm.getEmail(), 
// 				traineeModelForm.getGender());
// 		traineeRepository.save(trainee);
		
		
=======
import fa.mockproject.model.TraineePage;



public interface TraineeService {
	

	/*public List<TraineeModel> getTraineeModelList();*/


	public TraineeModel getTraineeModel(long id);

	public TraineePage getTraineeModels(Pageable pageable);


// 	public void update(TraineeModel traineeModelForm);
		
		

>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
import fa.mockproject.model.TraineePage;



public interface TraineeService {
	

	/*public List<TraineeModel> getTraineeModelList();*/


	public TraineeModel getTraineeModel(long id);

	public TraineePage getTraineeModels(Pageable pageable);


// 	public void update(TraineeModel traineeModelForm);
		
		

>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}
