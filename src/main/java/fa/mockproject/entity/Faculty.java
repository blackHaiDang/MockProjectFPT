package fa.mockproject.entity;

<<<<<<< HEAD
import java.util.Set;
=======
import java.util.List;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Faculty")
@Cacheable
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "faculty_id", length = 20, unique = true, nullable = false)
	private String facultyId;

	@Column(name = "faculty_name", length = 255, unique = true, nullable = false)
	private String facultyName;

	@Column(name = "remarks", length = 255, nullable = true)
	private String remarks;

	@OneToMany(mappedBy = "faculty")
<<<<<<< HEAD
	private Set<TraineeCandidateProfile> traineeCandidateProfile;
=======
	private List<TraineeCandidateProfile> traineeCandidateProfile;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

	public Faculty() {
		super();
	}

	public Faculty(String facultyId, String facultyName, String remarks,
<<<<<<< HEAD
			Set<TraineeCandidateProfile> traineeCandidateProfile) {
=======
			List<TraineeCandidateProfile> traineeCandidateProfile) {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.remarks = remarks;
		this.traineeCandidateProfile = traineeCandidateProfile;
	}

	public Faculty(Faculty findById) {
		this.facultyId = findById.facultyId;
		this.facultyName = findById.facultyName;
		this.remarks = findById.remarks;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

<<<<<<< HEAD
	public Set<TraineeCandidateProfile> getTraineeCandidateProfile() {
		return traineeCandidateProfile;
	}

	public void setTraineeCandidateProfile(Set<TraineeCandidateProfile> traineeCandidateProfile) {
		this.traineeCandidateProfile = traineeCandidateProfile;
	}

=======
	public List<TraineeCandidateProfile> getTraineeCandidateProfile() {
		return traineeCandidateProfile;
	}

	public void setTraineeCandidateProfile(List<TraineeCandidateProfile> traineeCandidateProfile) {
		this.traineeCandidateProfile = traineeCandidateProfile;
	}

	@Override
	public String toString() {
		return facultyName;
	}

>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
}
