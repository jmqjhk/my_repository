package my.test.web.practice.entity;

import java.sql.Timestamp;

public class DeviceInfo {
	private Long id;
	private String serialNumber;
	private String deviceTypeName;
	private String macAddress;
	private String mgtIpAddress;
	private String mgtUsername;
	private String mgtPassword;
	private String voltageRating;
	private String currentRating;
	private Integer deviceWan;
	private String oui;
	private String productClass;
	private String protocolId;
	private String softwareversion;
	private String hardwareversion;
	private String externalIpAddress;
	private int activity = 0;
	private int firmwarestatus;
	private Timestamp upgradetime;
    private String failuremsg;
    private String targetversion;
    private String adminpassword;
    private Timestamp updatetime;

	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public int getFirmwarestatus() {
		return firmwarestatus;
	}
	public void setFirmwarestatus(int firmwarestatus) {
		this.firmwarestatus = firmwarestatus;
	}
	public Timestamp getUpgradetime() {
		return upgradetime;
	}
	public void setUpgradetime(Timestamp upgradetime) {
		this.upgradetime = upgradetime;
	}
	
	public String getFailuremsg() {
		return failuremsg;
	}
	public void setFailuremsg(String failuremsg) {
		this.failuremsg = failuremsg;
	}
	public String getTargetversion() {
		return targetversion;
	}
	public void setTargetversion(String targetversion) {
		this.targetversion = targetversion;
	}

	public int getActivity() {
		return activity;
	}

	public void setActivity(int activity) {
		this.activity = activity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDeviceTypeName() {
		return deviceTypeName;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getMgtIpAddress() {
		return mgtIpAddress;
	}

	public void setMgtIpAddress(String mgtIpAddress) {
		this.mgtIpAddress = mgtIpAddress;
	}

	public String getMgtUsername() {
		return mgtUsername;
	}

	public void setMgtUsername(String mgtUsername) {
		this.mgtUsername = mgtUsername;
	}

	public String getMgtPassword() {
		return mgtPassword;
	}

	public void setMgtPassword(String mgtPassword) {
		this.mgtPassword = mgtPassword;
	}

	public String getVoltageRating() {
		return voltageRating;
	}

	public void setVoltageRating(String voltageRating) {
		this.voltageRating = voltageRating;
	}

	public String getCurrentRating() {
		return currentRating;
	}

	public void setCurrentRating(String currentRating) {
		this.currentRating = currentRating;
	}

	public Integer getDeviceWan() {
		return deviceWan;
	}

	public void setDeviceWan(Integer deviceWan) {
		this.deviceWan = deviceWan;
	}

	public String getOui() {
		return oui;
	}

	public void setOui(String oui) {
		this.oui = oui;
	}

	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	public String getProtocolId() {
		return protocolId;
	}

	public void setProtocolId(String protocolId) {
		this.protocolId = protocolId;
	}

	public String getSoftwareversion() {
		return softwareversion;
	}

	public void setSoftwareversion(String softwareversion) {
		this.softwareversion = softwareversion;
	}
	
	public String getHardwareversion() {
		return hardwareversion;
	}

	public void setHardwareversion(String hardwareversion) {
		this.hardwareversion = hardwareversion;
	}

	public String getExternalIpAddress() {
		return externalIpAddress;
	}

	public void setExternalIpAddress(String externalIpAddress) {
		this.externalIpAddress = externalIpAddress;
	}


}
