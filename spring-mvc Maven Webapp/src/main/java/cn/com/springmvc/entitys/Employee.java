package cn.com.springmvc.entitys;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1453444383638695589L;
	private Integer id;
	
	private String employeeName;

	private String EmployeeEmail;
	//1 ÄÐ, 0 Å®
	private Integer EmployeeSex;
	
	private String EmployeeAge;
	
	private String EmployeePhoto;
	
	private String EmployeeAddress;
	
	private String EmployeeSalary;
	
	private Department EmployeeDepartment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return EmployeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}

	public Integer getEmployeeSex() {
		return EmployeeSex;
	}

	public void setEmployeeSex(Integer employeeSex) {
		EmployeeSex = employeeSex;
	}

	public String getEmployeeAge() {
		return EmployeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		EmployeeAge = employeeAge;
	}

	public String getEmployeePhoto() {
		return EmployeePhoto;
	}

	public void setEmployeePhoto(String employeePhoto) {
		EmployeePhoto = employeePhoto;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public String getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public Department getEmployeeDepartment() {
		return EmployeeDepartment;
	}

	public void setEmployeeDepartment(Department employeeDepartment) {
		EmployeeDepartment = employeeDepartment;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName
				+ ", EmployeeEmail=" + EmployeeEmail + ", EmployeeSex="
				+ EmployeeSex + ", EmployeeAge=" + EmployeeAge
				+ ", EmployeePhoto=" + EmployeePhoto + ", EmployeeAddress="
				+ EmployeeAddress + ", EmployeeSalary=" + EmployeeSalary
				+ ", EmployeeDepartment=" + EmployeeDepartment + "]";
	}
	

}
