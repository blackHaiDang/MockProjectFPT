package fa.mockproject.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Supplier/Partner")
@Cacheable
public class SupplierPartner {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name= "supplier_partner_id")
	private int supplierPartnerId;
	
	@Column(name = "supplier_partner_name", length = 255, nullable = false)
	private String supplierPartnerName;
	
	@OneToOne
	@JoinColumn(name = "class_id", nullable = false)
	private ClassBatch classBatch;
	
	@Column(name= "remarks",  length = 255, nullable = true)
	private String remarks;

	public SupplierPartner() {
		super();
	}

	public SupplierPartner(int supplierPartnerId, String supplierPartnerName, ClassBatch classBatch, String remarks) {
		super();
		this.supplierPartnerId = supplierPartnerId;
		this.supplierPartnerName = supplierPartnerName;
		this.classBatch = classBatch;
		this.remarks = remarks;
	}

	public int getSupplierPartnerId() {
		return supplierPartnerId;
	}

	public void setSupplierPartnerId(int supplierPartnerId) {
		this.supplierPartnerId = supplierPartnerId;
	}

	public String getSupplierPartnerName() {
		return supplierPartnerName;
	}

	public void setSupplierPartnerName(String supplierPartnerName) {
		this.supplierPartnerName = supplierPartnerName;
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
		return "SupplierPartner [supplierPartnerId=" + supplierPartnerId + ", supplierPartnerName="
				+ supplierPartnerName + ", classBatch=" + classBatch + ", remarks=" + remarks + "]";
	}
	
}
