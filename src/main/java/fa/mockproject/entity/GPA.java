package fa.mockproject.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import javax.persistence.OneToOne;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
import javax.persistence.OneToOne;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
import javax.persistence.Table;

@Entity
@Table(name = "Gpa")
@Cacheable
public class GPA {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "gpa_id", nullable = false)
    private long gpaId;

    @OneToOne
    @JoinColumn(name = "attendant_status_id",nullable = true)
    private AttendantStatus attendantStatus;

    @ManyToOne
<<<<<<< HEAD
<<<<<<< HEAD
    @JoinColumn(name = "trainee_candidate id", nullable = false)
    private Trainee trainee;
=======
=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
    @JoinColumn(name = "trainee_candidate_id", nullable = false)
    private Trainee trainee;

    @OneToOne
    @JoinColumn(name = "allowance_id",nullable = true)
    private Allowance allowance;
<<<<<<< HEAD
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

    @Column(name = "gpa_result",length = 255,nullable = true)
    private String gpaResult;

    @Column(name = "remarks",length = 255,nullable = true)
    private String remarks;

    @Column(name = "GPAGPA_id",length = 255,nullable = true)
    private long gpaGpaId;

    public GPA() {
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public GPA(long gpaId, Trainee trainee, Integer attendantId, Integer allowanceId,
			Integer gpaResult, Integer remarks, int gpaGpaId) {
		super();
		this.gpaId = gpaId;
		this.trainee = trainee;
		this.attendantId = attendantId;
		this.allowanceId = allowanceId;
		this.gpaResult = gpaResult;
		this.remarks = remarks;
		this.gpaGpaId = gpaGpaId;
	}

	public long getGpaId() {
        return gpaId;
    }
=======

	public GPA(long gpaId, Trainee trainee, AttendantStatus attendantStatus, Allowance allowance, String gpaResult,
			String remarks, long gpaGpaId) {
		super();
		this.gpaId = gpaId;
		this.trainee = trainee;
		this.attendantStatus = attendantStatus;
		this.allowance = allowance;
		this.gpaResult = gpaResult;
		this.remarks = remarks;
		this.gpaGpaId = gpaGpaId;
	}
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

	public long getGpaId() {
		return gpaId;
	}

<<<<<<< HEAD
    public Trainee getTrainee() {
=======

	public GPA(long gpaId, Trainee trainee, AttendantStatus attendantStatus, Allowance allowance, String gpaResult,
			String remarks, long gpaGpaId) {
		super();
		this.gpaId = gpaId;
		this.trainee = trainee;
		this.attendantStatus = attendantStatus;
		this.allowance = allowance;
		this.gpaResult = gpaResult;
		this.remarks = remarks;
		this.gpaGpaId = gpaGpaId;
	}

	public long getGpaId() {
		return gpaId;
	}

	public void setGpaId(long gpaId) {
		this.gpaId = gpaId;
	}

	public Trainee getTrainee() {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
<<<<<<< HEAD
=======
	public void setGpaId(long gpaId) {
		this.gpaId = gpaId;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public AttendantStatus getAttendantStatus() {
		return attendantStatus;
	}
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c

	public void setAttendantStatus(AttendantStatus attendantStatus) {
		this.attendantStatus = attendantStatus;
	}

	public Allowance getAllowance() {
		return allowance;
	}

	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

	public String getGpaResult() {
		return gpaResult;
	}

	public void setGpaResult(String gpaResult) {
		this.gpaResult = gpaResult;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public long getGpaGpaId() {
		return gpaGpaId;
	}

	public void setGpaGpaId(long gpaGpaId) {
		this.gpaGpaId = gpaGpaId;
	}

=======

	public AttendantStatus getAttendantStatus() {
		return attendantStatus;
	}

	public void setAttendantStatus(AttendantStatus attendantStatus) {
		this.attendantStatus = attendantStatus;
	}

	public Allowance getAllowance() {
		return allowance;
	}

	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

	public String getGpaResult() {
		return gpaResult;
	}

	public void setGpaResult(String gpaResult) {
		this.gpaResult = gpaResult;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public long getGpaGpaId() {
		return gpaGpaId;
	}

	public void setGpaGpaId(long gpaGpaId) {
		this.gpaGpaId = gpaGpaId;
	}

>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
   
}
