package com.gt.wide.background.entity;

import java.io.Serializable;
import java.util.Date;

public class City implements Serializable{

	private static final long serialVersionUID = -2880015859817475861L;
	
	private Integer cityId; //地级市id
	private Integer provinceId;//省级名称
	private String cityName; //地级市名称
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	public City() {
		super();
	}
	public City(Integer cityId, Integer provinceId, String cityName, Date createTime, Date updateTime,
			String updatePerson) {
		super();
		setCityId(cityId);
		setProvinceId(provinceId);
		setCityName(cityName);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((provinceId == null) ? 0 : provinceId.hashCode());
		result = prime * result + ((updatePerson == null) ? 0 : updatePerson.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (cityId == null) {
			if (other.cityId != null)
				return false;
		} else if (!cityId.equals(other.cityId))
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (provinceId == null) {
			if (other.provinceId != null)
				return false;
		} else if (!provinceId.equals(other.provinceId))
			return false;
		if (updatePerson == null) {
			if (other.updatePerson != null)
				return false;
		} else if (!updatePerson.equals(other.updatePerson))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", provinceId=" + provinceId + ", cityName=" + cityName + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", updatePerson=" + updatePerson + "]";
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdatePerson() {
		return updatePerson;
	}
	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}
}
