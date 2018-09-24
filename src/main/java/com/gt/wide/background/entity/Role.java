package com.gt.wide.background.entity;

import java.util.Date;

public class Role {
	private int id;//角色id
	private String name;//角色名称
	private String roleDescribe;//角色说明
	private Date createTime;//建立时间
	private Date updateTime;//修改时间
	private int updatePerson;//修改人员姓名
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((roleDescribe == null) ? 0 : roleDescribe.hashCode());
		result = prime * result + updatePerson;
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
		Role other = (Role) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roleDescribe == null) {
			if (other.roleDescribe != null)
				return false;
		} else if (!roleDescribe.equals(other.roleDescribe))
			return false;
		if (updatePerson != other.updatePerson)
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
		return "Role [id=" + id + ", name=" + name + ", roleDescribe=" + roleDescribe + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", updatePerson=" + updatePerson + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoleDescribe() {
		return roleDescribe;
	}
	public void setRoleDescribe(String roleDescribe) {
		this.roleDescribe = roleDescribe;
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
	public int getUpdatePerson() {
		return updatePerson;
	}
	public void setUpdatePerson(int updatePerson) {
		this.updatePerson = updatePerson;
	}
	
	
}
