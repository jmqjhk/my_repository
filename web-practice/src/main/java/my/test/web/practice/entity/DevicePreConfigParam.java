package my.test.web.practice.entity;

import java.io.Serializable;

public class DevicePreConfigParam implements Serializable {

	private static final long serialVersionUID = -6140355505957125559L;

	public static final int SERVICE_TYPE_BROADBAND = 1;
	public static final int SERVICE_TYPE_IPTV = 2;
	public static final int SERVICE_TYPE_VOIP = 3;
	public static final int SERVICE_TYPE_WIFI = 4;
	public static final int SERVICE_TYPE_GATE_CONTROL = 5;
	public static final int SERVICE_TYPE_STB_IPTV = 6;
	public static final int SERVICE_TYPE_STB_IMS = 7;

	private long id;

	private String paraName = "";

	private String paraValue = "";

	private int serviceType = 0;

	public DevicePreConfigParam(){}
	
	public DevicePreConfigParam(long id, String paraName, String paraValue,
			int serviceType) {
		super();
		this.id = id;
		this.paraName = paraName;
		this.paraValue = paraValue;
		this.serviceType = serviceType;
	}

	/**
	 * @return the paraName
	 */
	public String getParaName() {
		return paraName;
	}

	/**
	 * @return the paraValue
	 */
	public String getParaValue() {
		return paraValue;
	}

	/**
	 * @return the serviceType
	 */
	public int getServiceType() {
		return serviceType;
	}

	/**
	 * @param paraName
	 *            the paraName to set
	 */
	public void setParaName(String paraName) {
		this.paraName = paraName;
	}

	/**
	 * @param paraValue
	 *            the paraValue to set
	 */
	public void setParaValue(String paraValue) {
		this.paraValue = paraValue;
	}

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DevicePreConfigParam [id=" + id + ", paraName=" + paraName
				+ ", paraValue=" + paraValue + ", serviceType=" + serviceType
				+ "]";
	}
}
