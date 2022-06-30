package fa.mockproject.model;

import fa.mockproject.entity.SupplierPartner;

public class SupplierPartnerModel {

<<<<<<< HEAD
<<<<<<< HEAD
	private int supplierPartnerId;
=======
	private long supplierPartnerId;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
	private long supplierPartnerId;
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
	private String supplierPartnerName;
	private String remarks;
	
	public SupplierPartnerModel() {
		super();
	}
<<<<<<< HEAD
<<<<<<< HEAD
	public SupplierPartnerModel(int supplierPartnerId, String supplierPartnerName, String remarks) {
=======
	public SupplierPartnerModel(long supplierPartnerId, String supplierPartnerName, String remarks) {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
	public SupplierPartnerModel(long supplierPartnerId, String supplierPartnerName, String remarks) {
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		super();
		this.supplierPartnerId = supplierPartnerId;
		this.supplierPartnerName = supplierPartnerName;
		this.remarks = remarks;
	}
	public SupplierPartnerModel(SupplierPartner supplierPartner) {
		super();
		this.supplierPartnerId = supplierPartner.getSupplierPartnerId();
		this.supplierPartnerName = supplierPartner.getSupplierPartnerName();
		this.remarks = supplierPartner.getRemarks();
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	public int getSupplierPartnerId() {
		return supplierPartnerId;
	}
	public void setSupplierPartnerId(int supplierPartnerId) {
=======
=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
	public long getSupplierPartnerId() {
		return supplierPartnerId;
	}
	public void setSupplierPartnerId(long supplierPartnerId) {
<<<<<<< HEAD
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
=======
>>>>>>> 69598419c24d8ad9df66a5e2c8a25e15cec0967c
		this.supplierPartnerId = supplierPartnerId;
	}
	public String getSupplierPartnerName() {
		return supplierPartnerName;
	}
	public void setSupplierPartnerName(String supplierPartnerName) {
		this.supplierPartnerName = supplierPartnerName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "SupplierPartnerModel [supplierPartnerId=" + supplierPartnerId + ", supplierPartnerName="
				+ supplierPartnerName + ", remarks=" + remarks + "]";
	}
	
}
