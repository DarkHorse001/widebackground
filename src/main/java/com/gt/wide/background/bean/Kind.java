package com.gt.wide.background.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 种类表
 * @author qin
 *
 */
public class Kind implements Serializable{
	
	private static final long serialVersionUID = 5078162045909000585L;
	
	private Integer kindId; //种类id
	private Integer directoryId; //目录id
	private String kindName; //种类名称
	private String kindDescribe; //种类描述
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	public Kind(Integer kindId, Integer directoryId, String kindName, String kindDescribe, Date createTime,
			Date updateTime, String updatePerson) {
		super();
		setKindId(kindId);
		setDirectoryId(directoryId);
		setKindName(kindName);
		setKindDescribe(kindDescribe);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((directoryId == null) ? 0 : directoryId.hashCode());
		result = prime * result + ((kindDescribe == null) ? 0 : kindDescribe.hashCode());
		result = prime * result + ((kindId == null) ? 0 : kindId.hashCode());
		result = prime * result + ((kindName == null) ? 0 : kindName.hashCode());
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
		Kind other = (Kind) obj;
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
		if (kindDescribe == null) {
			if (other.kindDescribe != null)
				return false;
		} else if (!kindDescribe.equals(other.kindDescribe))
			return false;
		if (kindId == null) {
			if (other.kindId != null)
				return false;
		} else if (!kindId.equals(other.kindId))
			return false;
		if (kindName == null) {
			if (other.kindName != null)
				return false;
		} else if (!kindName.equals(other.kindName))
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
		return "Kind [kindId=" + kindId + ", directoryId=" + directoryId + ", kindName=" + kindName + ", kindDescribe="
				+ kindDescribe + ", createTime=" + createTime + ", updateTime=" + updateTime + ", updatePerson="
				+ updatePerson + "]";
	}


	public Integer getKindId() {
		return kindId;
	}
	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}
	public Integer getDirectoryId() {
		return directoryId;
	}
	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
	}
	public String getKindName() {
		return kindName;
	}
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	public String getKindDescribe() {
		return kindDescribe;
	}
	public void setKindDescribe(String kindDescribe) {
		this.kindDescribe = kindDescribe;
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
