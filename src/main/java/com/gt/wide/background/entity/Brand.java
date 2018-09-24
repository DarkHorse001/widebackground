package com.gt.wide.background.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 品牌表
 * @author qin
 *
 */
public class Brand implements Serializable {

	private static final long serialVersionUID = 8505545279120018903L;
	
	private Integer brandId; //品牌id
	private Integer directoryId; //目录id
	private String brandName; //品牌名称
	private String brandDescribe; //品牌描述
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson;//修改人员姓名
	
	
	public Brand() {
		super();
	}
	public Brand(Integer brandId, Integer directoryId, String brandName, String brandDescribe, Date createTime,
			Date updateTime, String updatePerson) {
		super();
		setBrandId(brandId);
		setDirectoryId(directoryId);
		setBrandName(brandName);
		setBrandDescribe(brandDescribe);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandDescribe == null) ? 0 : brandDescribe.hashCode());
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((directoryId == null) ? 0 : directoryId.hashCode());
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
		Brand other = (Brand) obj;
		if (brandDescribe == null) {
			if (other.brandDescribe != null)
				return false;
		} else if (!brandDescribe.equals(other.brandDescribe))
			return false;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (directoryId == null) {
			if (other.directoryId != null)
				return false;
		} else if (!directoryId.equals(other.directoryId))
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
		return "Brand [brandId=" + brandId + ", directoryId=" + directoryId + ", brandName=" + brandName
				+ ", brandDescribe=" + brandDescribe + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", updatePerson=" + updatePerson + "]";
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getDirectoryId() {
		return directoryId;
	}
	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandDescribe() {
		return brandDescribe;
	}
	public void setBrandDescribe(String brandDescribe) {
		this.brandDescribe = brandDescribe;
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
