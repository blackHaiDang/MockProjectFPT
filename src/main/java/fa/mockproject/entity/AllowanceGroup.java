
package fa.mockproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "AllowanceGroup")
@Cacheable
public class AllowanceGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "group_id", nullable = false)
    private long groupId;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    @OneToOne(mappedBy = "allowanceGroup", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
=======
    @OneToOne(mappedBy = "allowanceGroup",cascade = CascadeType.ALL)
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
    @OneToOne(mappedBy = "allowanceGroup",cascade = CascadeType.ALL)
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
    @OneToOne(mappedBy = "allowanceGroup",cascade = CascadeType.ALL)
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
    private Allowance allowance;

    @Column(name = "remarks")
    private Integer remarks;

    public AllowanceGroup() {
    }

    public AllowanceGroup(long groupId, Allowance allowance, Integer remarks) {
		super();
		this.groupId = groupId;
		this.allowance = allowance;
		this.remarks = remarks;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public Allowance getAllowance() {
		return allowance;
	}

	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

	public Integer getRemarks() {
		return remarks;
	}

	public void setRemarks(Integer remarks) {
		this.remarks = remarks;
	}

}
