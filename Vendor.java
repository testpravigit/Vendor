package com.dto;

public class Vendor {
	private String name;
	private long account_num;
	private String bankName;
	private String addres1;
	private String addres2;
	private String city;
	private String country;
	private int zipcode;
	private String id;
	
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//	SETTERS&GETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccount_num() {
		return account_num;
	}
	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAddres1() {
		return addres1;
	}
	public void setAddres1(String addres1) {
		this.addres1 = addres1;
	}
	public String getAddres2() {
		return addres2;
	}
	public void setAddres2(String addres2) {
		this.addres2 = addres2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
//	CONSTRUCTOR
	public Vendor(String name, long account_num, String bankName, String addres1, String addres2, String city,
			String country, int zipcode,String id) {
		super();
		this.name = name;
		this.account_num = account_num;
		this.bankName = bankName;
		this.addres1 = addres1;
		this.addres2 = addres2;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.id=id;
	}
	//CONSTRUCTOR SUPERCLASS
	public Vendor() {
	super();
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "Vendor [name=" + name + ", account_num=" + account_num + ", bankName=" + bankName + ", addres1="
				+ addres1 + ", addres2=" + addres2 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode
				+ ", id=" + id + "]";
	}
	

}
