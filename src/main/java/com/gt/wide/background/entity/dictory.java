package com.gt.wide.background.entity;

import java.io.Serializable;

public class dictory implements Serializable {
	private int directory_id;
	private int pid;
	private static final long seriali = 1l;
	public int getDirectory_id() {
		return directory_id;
	}
	public void setDirectory_id(int directory_id) {
		this.directory_id = directory_id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
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
	private String dname;
	private String ddescription;
	
}
