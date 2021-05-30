package com.example.demo.model;

import javax.persistence.*;
/**
 * POJO class for emails entity
 * @author Divya
 *
 */
@Entity
@Table(name="emails")
public class Emails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sno;
	private String mailid;
	private String address;
	private String type;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "main_id",referencedColumnName = "sno")
	private Main1 main_emails;
	
	public Emails() {
		super();
	}

	public Emails(Long sno, String mailid, String address, String type, Main1 main_emails) {
		super();
		this.sno = sno;
		this.mailid = mailid;
		this.address = address;
		this.type = type;
		this.main_emails = main_emails;
	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Main1 getMain_emails() {
		return main_emails;
	}

	public void setMain_emails(Main1 main_emails) {
		this.main_emails = main_emails;
	}

	@Override
	public String toString() {
		return "Emails [sno=" + sno + ", mailid=" + mailid + ", address=" + address + ", type=" + type
				+ ", main_emails=" + main_emails + "]";
	}

}
