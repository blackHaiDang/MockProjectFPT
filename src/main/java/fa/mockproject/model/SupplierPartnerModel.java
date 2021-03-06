package fa.mockproject.model;

import fa.mockproject.entity.SupplierPartner;

public class SupplierPartnerModel {

	private long supplierPartnerId;
	private String supplierPartnerName;
	private String remarks;
	
	public SupplierPartnerModel() {
		super();
	}
	public SupplierPartnerModel(long supplierPartnerId, String supplierPartnerName, String remarks) {
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
	
	public long getSupplierPartnerId() {
		return supplierPartnerId;
	}
	public void setSupplierPartnerId(long supplierPartnerId) {
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
