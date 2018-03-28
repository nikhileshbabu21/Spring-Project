package com.Student.demo.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="user")
public class User {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id")
	private Integer id;
     @Column(name="name")
	private String name;
     @Column(name="Address")
	private String Address;
     @Column(name="phoneNo")
	private String phoneNo;
     @Column(name="dob")
     @Temporal(TemporalType.DATE)
	private Date dob;
     @Column(name="user_type")// A,C,T,S
     private String user_type;
     @Column(name="username")
     private String username;
     @Column(name="password")
     private String password;
     
     @Column(name="createdBy")
     @Temporal(TemporalType.DATE)
	private String createdBy;
     @Column(name="createdDate")
	private Date createdDate;
     @Column(name="modBy")
	private String modBy;
     @Column(name="modDate")
     @Temporal(TemporalType.DATE)
	private Date modDate;
     @Column(name="deleteFlag")
	private String deleteFlag;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModBy() {
		return modBy;
	}
	public void setModBy(String modBy) {
		this.modBy = modBy;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	
	
}
