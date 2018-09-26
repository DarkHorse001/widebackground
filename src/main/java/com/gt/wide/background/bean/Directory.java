package com.gt.wide.background.bean;

import java.io.Serializable;
import java.util.Date;

public class Directory implements Serializable {

	private static final long serialVersionUID = -1527479640429724123L;
	
	private Integer directoryId; //目录id
	private Integer pid;  //父级目录id
	private String dname; //目录名称
	private String ddescription;//目录描述
	private Date createTime; //建立时间
	private Date updateTime; //修改时间
	private String updatePerson; //修改人员姓名
	
	public Directory() {
		super();
	}
	public Directory(Integer directoryId, Integer pid, String dname, String ddescription, Date createTime,
			Date updateTime, String updatePerson) {
		super();
		setDirectoryId(directoryId);
		setPid(pid);
		setDname(dname);
		setDdescription(ddescription);
		setCreateTime(createTime);
		setUpdateTime(updateTime);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((ddescription == null) ? 0 : ddescription.hashCode());
		result = prime * result + ((directoryId == null) ? 0 : directoryId.hashCode());
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
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
		Directory other = (Directory) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (ddescription == null) {
			if (other.ddescription != null)
				return false;
		} else if (!ddescription.equals(other.ddescription))
			return false;
		if (directoryId == null) {
			if (other.directoryId != null)
				return false;
		} else if (!directoryId.equals(other.directoryId))
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
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
		return "Directory [directoryId=" + directoryId + ", pid=" + pid + ", dname=" + dname + ", ddescription="
				+ ddescription + ", createTime=" + createTime + ", updateTime=" + updateTime + ", updatePerson="
				+ updatePerson + "]";
	}
	public Integer getDirectoryId() {
		return directoryId;
	}
	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDdescription() {
		return ddescription;
	}
	public void setDdescription(String ddescription) {
		this.ddescription = ddescription;
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
