package com.gt.wide.background.entity;

import java.io.Serializable;
import java.util.Date;

public class Piture implements Serializable{
	
	private static final long serialVersionUID = 276346765989670101L;
	
	private Integer id; //图片id
	private Integer goodId;//商品id
	private String path; //图片路径
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	public Piture() {
		super();
	}
	public Piture(Integer id, Integer goodId, String path, Date createTime, Date updateTime, String updatePerson) {
		super();
		setId(id);
		setGoodId(goodId);
		setPath(path);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((goodId == null) ? 0 : goodId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		Piture other = (Piture) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (goodId == null) {
			if (other.goodId != null)
				return false;
		} else if (!goodId.equals(other.goodId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
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
		return "Piture [id=" + id + ", goodId=" + goodId + ", path=" + path + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", updatePerson=" + updatePerson + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGoodId() {
		return goodId;
	}
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
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
