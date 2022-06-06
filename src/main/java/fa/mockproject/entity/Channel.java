package fa.mockproject.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Channel")
@Cacheable
public class Channel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "channel_id", unique = true, nullable = false)
	private long channelId;

	@Column(name = "candidate_id", length = 200, nullable = true)
	private Candidate candidate;

	@Column(name = "remarks", length = 250, nullable = true)
	private String remarks;

	@Column(name = "channel_name", length = 250, nullable = false)
	private String channelName;

	public Channel() {
		super();
	}

	public Channel(Candidate candidate, String remarks, String channelName) {
		super();
		this.candidate = candidate;
		this.remarks = remarks;
		this.channelName = channelName;
	}

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public String toString() {
		return "Channel [channelId=" + channelId + ", remarks=" + remarks + ", channelName=" + channelName + "]";
	}

}