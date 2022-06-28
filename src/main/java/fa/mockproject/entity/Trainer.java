package fa.mockproject.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

<<<<<<< HEAD
import fa.mockproject.entity.enumtype.TrainerTypeEnum;
=======
import fa.mockproject.entity.enumtype.TrainerType;
>>>>>>> main
import fa.mockproject.model.TrainerModel;

@Entity
@Table(name = "Trainer")
@Cacheable
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "trainer_id")
	private long trainerId;
<<<<<<< HEAD
	
	@Column(name= "type", length = 255, nullable =  false)
	private TrainerTypeEnum type;
	
=======

	@Column(name = "type", length = 255, nullable = false)
	@Enumerated(EnumType.STRING)
	private TrainerType trainerType;

>>>>>>> main
	@ManyToOne
	@JoinColumn(name = "trainer_profile_id")
	private TrainerProfile trainerProfile;

	@ManyToOne
	@JoinColumn(name = "class_id")
	private ClassBatch classBatch;

	@Column(name = "remarks", length = 255, nullable = true)
	private String remarks;

	public Trainer() {
		super();
	}

<<<<<<< HEAD
	public Trainer(long trainerId, TrainerTypeEnum type, TrainerProfile trainerProfile, ClassBatch classBatch, String remarks) {
=======
	public Trainer(long trainerId, TrainerType trainerType, TrainerProfile trainerProfile, ClassBatch classBatch,
			String remarks) {
>>>>>>> main
		super();
		this.trainerId = trainerId;
		this.trainerType = trainerType;
		this.trainerProfile = trainerProfile;
		this.classBatch = classBatch;
		this.remarks = remarks;
	}

	public Trainer(TrainerModel trainerModel, ClassBatch classBatch) {
		super();
		this.trainerId = trainerModel.getTrainerId();
<<<<<<< HEAD
		this.type = trainerModel.getType();
		this.trainerProfile = new TrainerProfile(trainerModel);
=======
		this.trainerType = trainerModel.getTrainerType();
		this.trainerProfile = new TrainerProfile(trainerModel.getTrainerProfileId(), trainerModel.getFullName(),
				trainerModel.getDateOfBirth(), trainerModel.getGender(), trainerModel.getUnit(),
				trainerModel.getMajor(), trainerModel.getPhone(), trainerModel.getEmail(), trainerModel.getExperience(),
				trainerModel.getAccount(), trainerModel.getRemarks());
>>>>>>> main
		this.classBatch = classBatch;
		this.remarks = trainerModel.getRemarks();
	}

	public long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}

<<<<<<< HEAD
	public TrainerTypeEnum getType() {
		return type;
	}

	public void setType(TrainerTypeEnum type) {
		this.type = type;
=======
	public TrainerType getTrainerType() {
		return trainerType;
	}

	public void setTrainerType(TrainerType trainerType) {
		this.trainerType = trainerType;
>>>>>>> main
	}

	public TrainerProfile getTrainerProfile() {
		return trainerProfile;
	}

	public void setTrainerProfile(TrainerProfile trainerProfile) {
		this.trainerProfile = trainerProfile;
	}

	public ClassBatch getClassBatch() {
		return classBatch;
	}

	public void setClassBatch(ClassBatch classBatch) {
		this.classBatch = classBatch;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerType=" + trainerType + ", trainerProfile=" + trainerProfile
				+ ", classBatch=" + classBatch + ", remarks=" + remarks + "]";
	}
<<<<<<< HEAD
	
	public Trainer(TrainerModel trainerModel) {
		trainerId = trainerModel.getTrainerId();
		type = trainerModel.getType();
	}
}
=======

}
>>>>>>> main
