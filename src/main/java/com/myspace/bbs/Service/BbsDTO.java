package com.myspace.bbs.Service;

public class BbsDTO {

	private int emp_id;
	private int emp_no;
	private String emp_name;
	private String country;
	private String dept;
	
	
	public BbsDTO(int emp_id, int emp_no, String emp_name, String country,

			String dept) {

		super();

		this.emp_id = emp_id;

		this.emp_no = emp_no;

		this.emp_name = emp_name;

		this.country = country;

		this.dept = dept;

	}

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
