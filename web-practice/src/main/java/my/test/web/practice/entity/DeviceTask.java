package my.test.web.practice.entity;

public class DeviceTask {
	private Long id;
	private Long devicePreconfigId;
	private String workAsgnId;
	private Integer serviceType;
	private Integer serviceOpt;
	private String BussinessParameter;
	private Integer status;
//	private DevicePreConfig devicePREConfig;
	private String note;
	private Integer businessType;
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDevicePreconfigId() {
		return devicePreconfigId;
	}

	public void setDevicePreconfigId(Long devicePreconfigId) {
		this.devicePreconfigId = devicePreconfigId;
	}

	public String getWorkAsgnId() {
		return workAsgnId;
	}

	public void setWorkAsgnId(String workAsgnId) {
		this.workAsgnId = workAsgnId;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public Integer getServiceOpt() {
		return serviceOpt;
	}

	public void setServiceOpt(Integer serviceOpt) {
		this.serviceOpt = serviceOpt;
	}

	public String getBussinessParameter() {
		return BussinessParameter;
	}

	public void setBussinessParameter(String bussinessParameter) {
		BussinessParameter = bussinessParameter;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

//	public DevicePreConfig getDevicePREConfig() {
//		return devicePREConfig;
//	}
//
//	public void setDevicePREConfig(DevicePreConfig devicePREConfig) {
//		this.devicePREConfig = devicePREConfig;
//	}

	public Integer getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

	@Override
	public String toString() {
		return "DeviceTask [id=" + id + ", devicePreconfigId=" + devicePreconfigId + ", workAsgnId="
				+ workAsgnId + ", serviceType=" + serviceType + ", serviceOpt=" + serviceOpt
				+ ", BussinessParameter=" + BussinessParameter + ", status=" + status + ", note="
				+ note + ", businessType=" + businessType + "]";
	}

}
