package cn.com.springmvc.entitys;

import java.io.Serializable;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7593149132468129355L;
	private Integer id;
	private String CustomerName;
	private String CustomerSex;
	private String CustomerAge;
	private String CustomerAddress;
	private String CustomerEmail;
	private String CustomerPhoto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerSex() {
		return CustomerSex;
	}
	public void setCustomerSex(String customerSex) {
		CustomerSex = customerSex;
	}
	public String getCustomerAge() {
		return CustomerAge;
	}
	public void setCustomerAge(String customerAge) {
		CustomerAge = customerAge;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public String getCustomerPhoto() {
		return CustomerPhoto;
	}
	public void setCustomerPhoto(String customerPhoto) {
		CustomerPhoto = customerPhoto;
	}
}
