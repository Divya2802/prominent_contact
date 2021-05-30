package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;
/**
 * POJO class for profiles entity
 * @author Divya
 *
 */
@Entity
@Table(name = "profiles")
public class Profiles implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sno;
	private String network;
	private String id;
	private String url;
	private String username;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "main_id",referencedColumnName = "sno")
	private Main1 main_profiles;

	public Profiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profiles(Long sno, String network, String id, String url, String username, Main1 main_profiles) {
		super();
		this.sno = sno;
		this.network = network;
		this.id = id;
		this.url = url;
		this.username = username;
		this.main_profiles = main_profiles;
	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Main1 getMain_profiles() {
		return main_profiles;
	}

	public void setMain_profiles(Main1 main_profiles) {
		this.main_profiles = main_profiles;
	}

	@Override
	public String toString() {
		return "Profiles [sno=" + sno + ", network=" + network + ", id=" + id + ", url=" + url + ", username="
				+ username + ", main_profiles=" + main_profiles + "]";
	}

	
}
