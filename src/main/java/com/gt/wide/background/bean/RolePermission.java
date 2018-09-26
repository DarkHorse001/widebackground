package com.gt.wide.background.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限关联关系比
 * @author qin
 *
 */
public class RolePermission implements Serializable {
	
	private static final long serialVersionUID = 4801282702399855620L;
	
	private Integer id; //角色权限id
	private Integer roleId; //角色id
	private Integer permissionsId; //权限id
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	
	
	public RolePermission() {
		super();
	}
	
	public RolePermission(Integer id, Integer roleId, Integer permissionsId, Date createTime, Date updateTime,
			String updatePerson) {
		super();
		setId(id);
		setRoleId(roleId);
		setPermissionsId(permissionsId);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
		setUpdatePerson(updatePerson);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((permissionsId == null) ? 0 : permissionsId.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
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
		RolePermission other = (RolePermission) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (permissionsId == null) {
			if (other.permissionsId != null)
				return false;
		} else if (!permissionsId.equals(other.permissionsId))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
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
		return "RolePermission [id=" + id + ", roleId=" + roleId + ", permissionsId=" + permissionsId + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", updatePerson=" + updatePerson + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getPermissionsId() {
		return permissionsId;
	}
	public void setPermissionsId(Integer permissionsId) {
		this.permissionsId = permissionsId;
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
