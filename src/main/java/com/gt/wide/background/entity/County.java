package com.gt.wide.background.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qin
 *
 */
public class County implements Serializable {
	
	private static final long serialVersionUID = -8295396907503500919L;
	
	private Integer countyId;//县级市id
	private Integer cityId; //地级市id
	private String name; //县级市名称
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	public County() {
		super();
	}
	public County(Integer countyId, Integer cityId, String name, Date createTime, Date updateTime,
			String updatePerson) {
		super();
		setCountyId(countyId);
		setCityId(cityId);
		setName(name);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result + ((countyId == null) ? 0 : countyId.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		County other = (County) obj;
		if (cityId == null) {
			if (other.cityId != null)
				return false;
		} else if (!cityId.equals(other.cityId))
			return false;
		if (countyId == null) {
			if (other.countyId != null)
				return false;
		} else if (!countyId.equals(other.countyId))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return "County [countyId=" + countyId + ", cityId=" + cityId + ", name=" + name + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", updatePerson=" + updatePerson + "]";
	}
	public Integer getCountyId() {
		return countyId;
	}
	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
