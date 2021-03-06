package fa.mockproject.model;

import fa.mockproject.entity.DeliveryType;

public class DeliveryTypeModel {
	
	private long deliveryTypeId;
	private String deliveryTypeName;
    private String remarks;
    
	public DeliveryTypeModel() {
		super();
	}

	public DeliveryTypeModel(long deliveryTypeId, String deliveryTypeName, String remarks) {
		super();
		this.deliveryTypeId = deliveryTypeId;
		this.deliveryTypeName = deliveryTypeName;
		this.remarks = remarks;
	}
	
	public DeliveryTypeModel(DeliveryType deliveryType) {
		super();
		this.deliveryTypeId = deliveryType.getDeliveryTypeId();
		this.deliveryTypeName = deliveryType.getDeliveryTypeName();
		this.remarks = deliveryType.getRemarks();
	}

	public long getDeliveryTypeId() {
		return deliveryTypeId;
	}

	public void setDeliveryTypeId(long deliveryTypeId) {
		this.deliveryTypeId = deliveryTypeId;
	}

	public String getDeliveryTypeName() {
		return deliveryTypeName;
	}

	public void setDeliveryTypeName(String deliveryTypeName) {
		this.deliveryTypeName = deliveryTypeName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "DeliveryTypeModel [deliveryTypeId=" + deliveryTypeId + ", deliveryTypeName=" + deliveryTypeName
				+ ", remarks=" + remarks + "]";
	}
    
}
