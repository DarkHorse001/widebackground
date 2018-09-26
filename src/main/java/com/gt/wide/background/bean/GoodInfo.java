package com.gt.wide.background.bean;

import java.io.Serializable;
import java.util.Date;

public class GoodInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;	//商品信息id
	private Integer goodId; //商品id
	private String detail; //商品
	private Date createTime; //创建时间
	private Date updateTime; //修改时间
	private String updateperson; //修改人员姓名
	
	public GoodInfo() {
		super();
	}

	public GoodInfo(Integer id, Integer goodId, String detail, Date createTime, Date updateTime, String updateperson) {
		super();
		setId(id);
		setGoodId(goodId);
		setDetail(detail);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdateperson(updateperson);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((detail == null) ? 0 : detail.hashCode());
		result = prime * result + ((goodId == null) ? 0 : goodId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((updateperson == null) ? 0 : updateperson.hashCode());
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
		GoodInfo other = (GoodInfo) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (detail == null) {
			if (other.detail != null)
				return false;
		} else if (!detail.equals(other.detail))
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
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (updateperson == null) {
			if (other.updateperson != null)
				return false;
		} else if (!updateperson.equals(other.updateperson))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GoodInfo [id=" + id + ", goodId=" + goodId + ", detail=" + detail + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", updateperson=" + updateperson + "]";
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
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
	public String getUpdateperson() {
		return updateperson;
	}
	public void setUpdateperson(String updateperson) {
		this.updateperson = updateperson;
	}
	
	
}
