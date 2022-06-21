package fa.mockproject.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import fa.mockproject.model.TraineeCandidateProfileModel;

@Entity
@Table(name = "Candidate")
@Cacheable
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "candidate_id", unique = true, nullable = false)
	private long candidateId;

	@OneToOne(mappedBy = "candidate", cascade = CascadeType.MERGE)
	@JoinColumn(name = "trainee_candidate_profile_id", unique = true, nullable = true)
	private TraineeCandidateProfile traineeCandidateProfile;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@Column(name = "application_date", nullable = false)
	private LocalDateTime applicationDate;

	@ManyToOne
	@JoinColumn(name = "channel_id", nullable = true)
	private Channel channel;

	@ManyToOne
	@JoinColumn(name = "location_id", nullable = true)
	private Location location;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "entry_test_id", nullable = true)
	private Set<EntryTest> entryTests;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "interview_id", nullable = true)
	private Set<Interview> interviews;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "offer_id", nullable = true)
	private Set<Offer> offers;

	@ManyToOne
	@JoinColumn(name = "status", nullable = true)
	private TraineeCandidateProfileStatus status;

	@Column(name = "remarks", length = 255, nullable = true)
	private String remarks;

	public Candidate() {
		super();
	}

	public long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public TraineeCandidateProfile getTraineeCandidateProfile() {
		return traineeCandidateProfile;
	}

	public void setTraineeCandidateProfile(TraineeCandidateProfile traineeCandidateProfile) {
		this.traineeCandidateProfile = traineeCandidateProfile;
	}

	public LocalDateTime getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDateTime applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Set<EntryTest> getEntryTests() {
		return entryTests;
	}

	public void setEntryTests(Set<EntryTest> entryTests) {
		this.entryTests = entryTests;
	}

	public Set<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(Set<Interview> interviews) {
		this.interviews = interviews;
	}

	public Set<Offer> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	public TraineeCandidateProfileStatus getStatus() {
		return status;
	}

	public void setStatus(TraineeCandidateProfileStatus status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Candidate(TraineeCandidateProfileModel model, Channel channel2, Location location2,
		 TraineeCandidateProfileStatus status2) {
		LocalDate localDateApplicationDate = model.getApplicationDate();
		this.applicationDate = localDateApplicationDate.atStartOfDay();
		this.channel = channel2;
		this.location = location2;
		this.status = status2;
		this.remarks = model.getRemarks();
	}

	public Candidate(Candidate findbyId) {
		this.candidateId = findbyId.getCandidateId();
		this.traineeCandidateProfile = findbyId.getTraineeCandidateProfile();
		this.applicationDate = findbyId.getApplicationDate();
		this.channel = findbyId.getChannel();
		this.location = findbyId.getLocation();
		this.entryTests = findbyId.getEntryTests();
		this.interviews = findbyId.getInterviews();
		this.offers = findbyId.getOffers();
		this.status = findbyId.getStatus();
		this.remarks = findbyId.getRemarks();
	}

	public Candidate(Candidate candidate2, Channel channel2, Location location2,TraineeCandidateProfileStatus status2) {
		this.applicationDate = candidate2.getApplicationDate();
		this.channel = channel2;
		this.location = location2;
		this.status = status2;
		this.remarks = candidate2.getRemarks();
		this.traineeCandidateProfile = candidate2.getTraineeCandidateProfile();
	}

}