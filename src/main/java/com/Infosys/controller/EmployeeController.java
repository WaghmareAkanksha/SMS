package com.Infosys.controller;

public class EmployeeController {
	
	private Integer eid;
	private String ename;
	private String eaddress;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "EmployeeController [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
}
