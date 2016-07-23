package my.test.web.practice.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DevicePreConfig implements Serializable {

	protected static final Log log = LogFactory.getLog(DevicePreConfig.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = -5243964327695556122L;

	private long id = 0;

	private String serialNumber = "";

	private String oldSerialNumber = "";

	private String pppUsername = "";// ==ad_account==subscriberId

	private String oldPppUsername = "";

	private String areaCode = "";

	private String subAreaCode = "";

	private String contantName = "";

	private String address = "";

	private String phoneNumber = "";

	private int rgMode = 0;

	private int broadBandStatus = 0;

	private int iptvStatus = 0;

	private int voipStatus = 0;

	private int wifiStatus = 0;

	private int gateStatus = 0;

	private int broadBandPorts = 0;

	private int iptvPorts = 0;

	private int voipPorts = 0;

	private int wifiPorts = 0;

	private int gatePorts = 0;

	private String serviceSet = "";

	private int rgType = 0;

	private int psdRetryTimes = 0;

	private String logicId = "";

	private String oldLogicId = "";

	private String authenticationCode = "";

	private String customerId = "";

	private int userType = 0;

	private String idNumber = "";

	private String email = "";

	private String lineInfo = "";

	private String cardNo = "";

	private String cardEncryptCode = "";

	private String oui = "";

	private String product_class = "";

	private long radiusUserId = 0;

	private String ssid_Inuse;// = NBIContants.SSID_INUSE_DEFAULT;

	private String deviceinfoId;

	private Date insertTime;

	private Date updateTime;

	private List<DevicePreConfigParam> paraList = new ArrayList<DevicePreConfigParam>();

	private DeviceServiceStatus dss = new DeviceServiceStatus();

	// public void parseOuiAndProductClassBySn(String terminalSN) {
	// try {
	// if (StringUtils.isNotBlank(terminalSN)) {
	// String p[] = terminalSN.split(NBIContants.SN_SPLIT);
	// if (p.length == 3) {
	// this.oui = p[0];
	// this.product_class = p[1];
	// } else {
	// log.debug("terminalSN pattern error:" + terminalSN);
	// }
	// } else {
	// log.debug("terminalSN is null");
	// }
	// } catch (Exception e) {
	// log.debug("terminalSN pattern error:" + terminalSN);
	// }
	// }

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * @return the authenticationCode
	 */
	public String getAuthenticationCode() {
		return authenticationCode;
	}

	/**
	 * @return the broadBandPorts
	 */
	public int getBroadBandPorts() {
		return broadBandPorts;
	}

	/**
	 * @return the broadBandStatus
	 */
	public int getBroadBandStatus() {
		return broadBandStatus;
	}

	/**
	 * @return the cardEncryptCode
	 */
	public String getCardEncryptCode() {
		return cardEncryptCode;
	}

	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * @return the contantName
	 */
	public String getContantName() {
		return contantName;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	public DeviceServiceStatus getDss() {
		return dss;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	public int getGatePorts() {
		return gatePorts;
	}

	public int getGateStatus() {
		return gateStatus;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * @return the iptvPorts
	 */
	public int getIptvPorts() {
		return iptvPorts;
	}

	/**
	 * @return the iptvStatus
	 */
	public int getIptvStatus() {
		return iptvStatus;
	}

	/**
	 * @return the lineInfo
	 */
	public String getLineInfo() {
		return lineInfo;
	}

	/**
	 * @return the logicId
	 */
	public String getLogicId() {
		return logicId;
	}

	/**
	 * @return the oldLogicId
	 */
	public String getOldLogicId() {
		return oldLogicId;
	}

	/**
	 * @return the oldPppUsername
	 */
	public String getOldPppUsername() {
		return oldPppUsername;
	}

	/**
	 * @return the oldSerialNumber
	 */
	public String getOldSerialNumber() {
		return oldSerialNumber;
	}

	public String getOui() {
		return oui;
	}

	/**
	 * @return the paraList
	 */
	public List<DevicePreConfigParam> getParaList() {
		return paraList;
	}

	/**
	 * 从deviceCfgParaList里得到指定paraName的paraValue
	 * 
	 * @param paraName
	 * @return
	 */
	public String getParaValueFromParaList(String paraName, int serviceType) {
		if (paraList == null) {
			return null;
		}
		for (Iterator<DevicePreConfigParam> iter = paraList.iterator(); iter.hasNext();) {
			DevicePreConfigParam deviceCfg = iter.next();
			if (paraName.equals(deviceCfg.getParaName())
					&& serviceType == deviceCfg.getServiceType()) {
				return deviceCfg.getParaValue();
			}
		}
		return null;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the pppUsername
	 */
	public String getPppUsername() {
		return pppUsername;
	}

	public String getProduct_class() {
		return product_class;
	}

	/**
	 * @return the psdRetryTimes
	 */
	public int getPsdRetryTimes() {
		return psdRetryTimes;
	}

	public long getRadiusUserId() {
		return radiusUserId;
	}

	/**
	 * @return the rgMode
	 */
	public int getRgMode() {
		return rgMode;
	}

	/**
	 * @return the rgType
	 */
	public int getRgType() {
		return rgType;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * 获取业务下发相关参数
	 * 
	 * @param servicetype
	 *            业务类型 NBIContants.WBAND_SERVICE 1 宽带业务参数
	 *            NBIContants.IPTV_SERVICE 2 IPTV业务参数 NBIContants.VOIP_SERVICE 3
	 *            VOIP业务参数 NBIContants.WIFI_SERVICE 4 WIFI业务参数
	 * @return
	 * @throws @author
	 *             zhengxiaohu
	 * @date 2012-7-23
	 */
	public HashMap<String, String> getServicePara(int servicetype) {
		HashMap<String, String> servicepara = new HashMap<String, String>();
		for (int i = 0; i < paraList.size(); i++) {
			DevicePreConfigParam dpcpara = paraList.get(i);
			if (dpcpara.getServiceType() == servicetype) {
				servicepara.put(dpcpara.getParaName(), dpcpara.getParaValue());
			}
		}
		return servicepara;
	}

	/**
	 * @return the serviceSet
	 */
	public String getServiceSet() {
		return serviceSet;
	}

	public String getSsid_Inuse() {
		return ssid_Inuse;
	}

	/**
	 * @return the subAreaCode
	 */
	public String getSubAreaCode() {
		return subAreaCode;
	}

	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}

	/**
	 * @return the voipPorts
	 */
	public int getVoipPorts() {
		return voipPorts;
	}

	/**
	 * @return the voipStatus
	 */
	public int getVoipStatus() {
		return voipStatus;
	}

	/**
	 * @return the wifiPort
	 */
	public int getWifiPorts() {
		return wifiPorts;
	}

	/**
	 * @return the wifiStatus
	 */
	public int getWifiStatus() {
		return wifiStatus;
	}

	/**
	 * 判断是否是机顶盒业务
	 * 
	 * @return
	 */
	public boolean isStbBusiness() {
		boolean result = false;

		for (DevicePreConfigParam dpp : paraList) {
			if (dpp.getServiceType() == DevicePreConfigParam.SERVICE_TYPE_STB_IPTV
					|| dpp.getServiceType() == DevicePreConfigParam.SERVICE_TYPE_STB_IMS) {
				result = true;
				break;
			}
		}

		return result;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param areaCode
	 *            the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * @param authenticationCode
	 *            the authenticationCode to set
	 */
	public void setAuthenticationCode(String authenticationCode) {
		this.authenticationCode = authenticationCode;
	}

	/**
	 * @param broadBandPorts
	 *            the broadBandPorts to set
	 */
	public void setBroadBandPorts(int broadBandPorts) {
		this.broadBandPorts = broadBandPorts;
	}

	/**
	 * @param broadBandStatus
	 *            the broadBandStatus to set
	 */
	public void setBroadBandStatus(int broadBandStatus) {
		this.broadBandStatus = broadBandStatus;
	}

	/**
	 * @param cardEncryptCode
	 *            the cardEncryptCode to set
	 */
	public void setCardEncryptCode(String cardEncryptCode) {
		this.cardEncryptCode = cardEncryptCode;
	}

	/**
	 * @param cardNo
	 *            the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @param contantName
	 *            the contantName to set
	 */
	public void setContantName(String contantName) {
		this.contantName = contantName;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setDss(DeviceServiceStatus dss) {
		this.dss = dss;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public void setGatePorts(int gatePorts) {
		this.gatePorts = gatePorts;
	}

	public void setGateStatus(int gateStatus) {
		this.gateStatus = gateStatus;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param idNumber
	 *            the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @param iptvPorts
	 *            the iptvPorts to set
	 */
	public void setIptvPorts(int iptvPorts) {
		this.iptvPorts = iptvPorts;
	}

	/**
	 * @param iptvStatus
	 *            the iptvStatus to set
	 */
	public void setIptvStatus(int iptvStatus) {
		this.iptvStatus = iptvStatus;
	}

	/**
	 * @param lineInfo
	 *            the lineInfo to set
	 */
	public void setLineInfo(String lineInfo) {
		this.lineInfo = lineInfo;
	}

	/**
	 * @param logicId
	 *            the logicId to set
	 */
	public void setLogicId(String logicId) {
		this.logicId = logicId;
	}

	/**
	 * @param oldLogicId
	 *            the oldLogicId to set
	 */
	public void setOldLogicId(String oldLogicId) {
		this.oldLogicId = oldLogicId;
	}

	/**
	 * @param oldPppUsername
	 *            the oldPppUsername to set
	 */
	public void setOldPppUsername(String oldPppUsername) {
		this.oldPppUsername = oldPppUsername;
	}

	/**
	 * @param oldSerialNumber
	 *            the oldSerialNumber to set
	 */
	public void setOldSerialNumber(String oldSerialNumber) {
		this.oldSerialNumber = oldSerialNumber;
	}

	public void setOui(String oui) {
		this.oui = oui;
	}

	/**
	 * @param paraList
	 *            the paraList to set
	 */
	public void setParaList(List<DevicePreConfigParam> paraList) {
		this.paraList = paraList;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @param pppUsername
	 *            the pppUsername to set
	 */
	public void setPppUsername(String pppUsername) {
		this.pppUsername = pppUsername;
	}

	public void setProduct_class(String product_class) {
		this.product_class = product_class;
	}

	/**
	 * @param psdRetryTimes
	 *            the psdRetryTimes to set
	 */
	public void setPsdRetryTimes(int psdRetryTimes) {
		this.psdRetryTimes = psdRetryTimes;
	}

	public void setRadiusUserId(long radiusUserId) {
		this.radiusUserId = radiusUserId;
	}

	/**
	 * @param rgMode
	 *            the rgMode to set
	 */
	public void setRgMode(int rgMode) {
		this.rgMode = rgMode;
	}

	/**
	 * @param rgType
	 *            the rgType to set
	 */
	public void setRgType(int rgType) {
		this.rgType = rgType;
	}

	/**
	 * @param serialNumber
	 *            the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @param serviceSet
	 *            the serviceSet to set
	 */
	public void setServiceSet(String serviceSet) {
		this.serviceSet = serviceSet;
	}

	public void setSsid_Inuse(String ssid_Inuse) {
		this.ssid_Inuse = ssid_Inuse;
	}

	/**
	 * @param subAreaCode
	 *            the subAreaCode to set
	 */
	public void setSubAreaCode(String subAreaCode) {
		this.subAreaCode = subAreaCode;
	}

	/**
	 * @param userType
	 *            the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}

	/**
	 * @param voipPorts
	 *            the voipPorts to set
	 */
	public void setVoipPorts(int voipPorts) {
		this.voipPorts = voipPorts;
	}

	/**
	 * @param voipStatus
	 *            the voipStatus to set
	 */
	public void setVoipStatus(int voipStatus) {
		this.voipStatus = voipStatus;
	}

	/**
	 * @param wifiPort
	 *            the wifiPort to set
	 */
	public void setWifiPorts(int wifiPort) {
		this.wifiPorts = wifiPort;
	}

	/**
	 * @param wifiStatus
	 *            the wifiStatus to set
	 */
	public void setWifiStatus(int wifiStatus) {
		this.wifiStatus = wifiStatus;
	}

	public String getDeviceinfoId() {
		return deviceinfoId;
	}

	public void setDeviceinfoId(String deviceinfoId) {
		this.deviceinfoId = deviceinfoId;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "DevicePreConfig [id=" + id + ", serialNumber=" + serialNumber + ", oldSerialNumber="
				+ oldSerialNumber + ", pppUsername=" + pppUsername + ", oldPppUsername="
				+ oldPppUsername + ", areaCode=" + areaCode + ", subAreaCode=" + subAreaCode
				+ ", contantName=" + contantName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", rgMode=" + rgMode + ", broadBandStatus=" + broadBandStatus
				+ ", iptvStatus=" + iptvStatus + ", voipStatus=" + voipStatus + ", wifiStatus="
				+ wifiStatus + ", gateStatus=" + gateStatus + ", broadBandPorts=" + broadBandPorts
				+ ", iptvPorts=" + iptvPorts + ", voipPorts=" + voipPorts + ", wifiPorts="
				+ wifiPorts + ", gatePorts=" + gatePorts + ", serviceSet=" + serviceSet
				+ ", rgType=" + rgType + ", psdRetryTimes=" + psdRetryTimes + ", logicId=" + logicId
				+ ", oldLogicId=" + oldLogicId + ", authenticationCode=" + authenticationCode
				+ ", customerId=" + customerId + ", userType=" + userType + ", idNumber=" + idNumber
				+ ", email=" + email + ", lineInfo=" + lineInfo + ", cardNo=" + cardNo
				+ ", cardEncryptCode=" + cardEncryptCode + ", oui=" + oui + ", product_class="
				+ product_class + ", radiusUserId=" + radiusUserId + ", ssid_Inuse=" + ssid_Inuse
				+ ", deviceinfoId=" + deviceinfoId + ", insertTime=" + insertTime + ", updateTime="
				+ updateTime + ", paraList=" + paraList + ", dss=" + dss + "]";
	}

	/**
	 * 更新deviceCfgParaList里的值
	 * 
	 * @param paraName
	 * @param paraValue
	 * @param serviceType
	 * @return
	 */
	public void updValueToParaList(String paraName, String paraValue, int serviceType) {
		if (paraList == null) {
			paraList = new ArrayList<DevicePreConfigParam>();
		}
		boolean notExist = true;
		DevicePreConfigParam deviceCfg = null;
		for (Iterator<DevicePreConfigParam> iter = paraList.iterator(); iter.hasNext();) {
			deviceCfg = iter.next();
			if (paraName.equals(deviceCfg.getParaName())
					&& deviceCfg.getServiceType() == serviceType) {
				notExist = false;
				if (StringUtils.isNotBlank(paraValue)) {
					deviceCfg.setParaValue(paraValue);
				} else {
					iter.remove();
				}
				break;
			}
		}
		if (notExist && StringUtils.isNotBlank(paraValue)) {
			deviceCfg = new DevicePreConfigParam(0, paraName, paraValue, serviceType);
			paraList.add(deviceCfg);
		}
	}

}
