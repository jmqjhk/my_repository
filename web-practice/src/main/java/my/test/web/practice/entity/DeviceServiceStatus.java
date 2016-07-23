package my.test.web.practice.entity;

import java.sql.Date;

/**
 * 
 * @author wcao005
 * 
 */
public class DeviceServiceStatus {
	private Long id;
	private Long devicePreconfigId;
	private Long deviceInfoId;
	private String serialNumber;
	private Integer bindFlag;
	private Date firstBindTime;
	private Date lastBindTime;
	private Integer broadBandStatus = 0;
	private Integer iptvStatus = 0;
	private Integer voipStatus = 0;
	private Integer wifiStatus = 0;
	private Integer gateControlStatus = 0;
	private Long broadBandPorts;
	private Long iptvPorts;
	private Long voipPorts;
	private Long wifiPorts;
	private Long gateControlPorts;
	private String authenticationCode;
	private String logicId;
	private String customerId;
	private String pppUsername;
	private Date broadopentime;
	private Date iptvopentime;
	private Date voipopentime;
	private Date wifiopentime;
	private Date gatecontrolopentime;
	private String ssidInuse;// = StaticCode.SSID_INUSE;
	// HDM-2351
	private Integer srvReconfStatus = 0;
	private Date srvReconfTime;

	public Date getBroadopentime() {
		return broadopentime;
	}

	public void setBroadopentime(Date broadopentime) {
		this.broadopentime = broadopentime;
	}

	public Date getIptvopentime() {
		return iptvopentime;
	}

	public void setIptvopentime(Date iptvopentime) {
		this.iptvopentime = iptvopentime;
	}

	public Date getVoipopentime() {
		return voipopentime;
	}

	public void setVoipopentime(Date voipopentime) {
		this.voipopentime = voipopentime;
	}

	public void setWifiStatus(int wifiStatus) {
		this.wifiStatus = wifiStatus;
	}

	public Date getFirstBindTime() {
		return firstBindTime;
	}

	public void setFirstBindTime(Date firstBindTime) {
		this.firstBindTime = firstBindTime;
	}

	public Date getLastBindTime() {
		return lastBindTime;
	}

	public void setLastBindTime(Date lastBindTime) {
		this.lastBindTime = lastBindTime;
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

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getBindFlag() {
		return bindFlag;
	}

	public void setBindFlag(Integer bindFlag) {
		this.bindFlag = bindFlag;
	}

	public Integer getBroadBandStatus() {
		return broadBandStatus;
	}

	public void setBroadBandStatus(Integer broadBandStatus) {
		this.broadBandStatus = broadBandStatus;
	}

	public Integer getIptvStatus() {
		return iptvStatus;
	}

	public void setIptvStatus(Integer iptvStatus) {
		this.iptvStatus = iptvStatus;
	}

	public Integer getVoipStatus() {
		return voipStatus;
	}

	public void setVoipStatus(Integer voipStatus) {
		this.voipStatus = voipStatus;
	}

	public Integer getWifiStatus() {
		return wifiStatus;
	}

	public void setWifiStatus(Integer wifiStatus) {
		this.wifiStatus = wifiStatus;
	}

	public Long getBroadBandPorts() {
		return broadBandPorts;
	}

	public void setBroadBandPorts(Long broadBandPorts) {
		this.broadBandPorts = broadBandPorts;
	}

	public Long getIptvPorts() {
		return iptvPorts;
	}

	public void setIptvPorts(Long iptvPorts) {
		this.iptvPorts = iptvPorts;
	}

	public Long getVoipPorts() {
		return voipPorts;
	}

	public void setVoipPorts(Long voipPorts) {
		this.voipPorts = voipPorts;
	}

	/*
	 * public Long getWifiPorts() { return wifiPorts; }
	 * 
	 * public void setWifiPorts(Long wifiPorts) { this.wifiPorts = wifiPorts; }
	 */
	public String getAuthenticationCode() {
		return authenticationCode;
	}

	public void setAuthenticationCode(String authenticationCode) {
		this.authenticationCode = authenticationCode;
	}

	public String getLogicId() {
		return logicId;
	}

	public void setLogicId(String logicId) {
		this.logicId = logicId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPppUsername() {
		return pppUsername;
	}

	public void setPppUsername(String pppUsername) {
		this.pppUsername = pppUsername;
	}

	public Long getDeviceInfoId() {
		return deviceInfoId;
	}

	public void setDeviceInfoId(Long deviceInfoId) {
		this.deviceInfoId = deviceInfoId;
	}

	public Date getWifiopentime() {
		return wifiopentime;
	}

	public void setWifiopentime(Date wifiopentime) {
		this.wifiopentime = wifiopentime;
	}

	public Long getWifiPorts() {
		return wifiPorts;
	}

	public void setWifiPorts(Long wifiPorts) {
		this.wifiPorts = wifiPorts;
	}

	public String getSsidInuse() {
		return ssidInuse;
	}

	public void setSsidInuse(String ssidInuse) {
		this.ssidInuse = ssidInuse;
	}

	public Integer getGateControlStatus() {
		return gateControlStatus;
	}

	public void setGateControlStatus(Integer gateControlStatus) {
		this.gateControlStatus = gateControlStatus;
	}

	public Long getGateControlPorts() {
		return gateControlPorts;
	}

	public void setGateControlPorts(Long gateControlPorts) {
		this.gateControlPorts = gateControlPorts;
	}

	public Date getGatecontrolopentime() {
		return gatecontrolopentime;
	}

	public void setGatecontrolopentime(Date gatecontrolopentime) {
		this.gatecontrolopentime = gatecontrolopentime;
	}

	public Integer getSrvReconfStatus() {
		return srvReconfStatus;
	}

	public void setSrvReconfStatus(Integer srvReconfStatus) {
		this.srvReconfStatus = srvReconfStatus;
	}

	public Date getSrvReconfTime() {
		return srvReconfTime;
	}

	public void setSrvReconfTime(Date srvReconfTime) {
		this.srvReconfTime = srvReconfTime;
	}

	@Override
	public String toString() {
		return "DeviceServiceStatus [id=" + id + ", devicePreconfigId=" + devicePreconfigId
				+ ", deviceInfoId=" + deviceInfoId + ", serialNumber=" + serialNumber
				+ ", bindFlag=" + bindFlag + ", firstBindTime=" + firstBindTime + ", lastBindTime="
				+ lastBindTime + ", broadBandStatus=" + broadBandStatus + ", iptvStatus="
				+ iptvStatus + ", voipStatus=" + voipStatus + ", wifiStatus=" + wifiStatus
				+ ", gateControlStatus=" + gateControlStatus + ", broadBandPorts=" + broadBandPorts
				+ ", iptvPorts=" + iptvPorts + ", voipPorts=" + voipPorts + ", wifiPorts="
				+ wifiPorts + ", gateControlPorts=" + gateControlPorts + ", authenticationCode="
				+ authenticationCode + ", logicId=" + logicId + ", customerId=" + customerId
				+ ", pppUsername=" + pppUsername + ", broadopentime=" + broadopentime
				+ ", iptvopentime=" + iptvopentime + ", voipopentime=" + voipopentime
				+ ", wifiopentime=" + wifiopentime + ", gatecontrolopentime=" + gatecontrolopentime
				+ ", ssidInuse=" + ssidInuse + ", srvReconfStatus=" + srvReconfStatus
				+ ", srvReconfTime=" + srvReconfTime + "]";
	}

}
