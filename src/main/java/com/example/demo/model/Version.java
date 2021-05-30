package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.*;
/**
 * POJO class for version entity
 * @author Divya
 *
 */
@Entity
@Table(name="version")
public class Version {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sno")
	private Long sno;
	private String version_id;
	private String status;
	private String[] contains;
	private String previous_version;
	private String current_version;
	
	@OneToOne(mappedBy = "version_status")
	private Main1 main;
	
	public Version() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Version(Long sno, String version_id, String status, String[] contains, String previous_version,
			String current_version, Main1 main) {
		super();
		this.sno = sno;
		this.version_id = version_id;
		this.status = status;
		this.contains = contains;
		this.previous_version = previous_version;
		this.current_version = current_version;
		this.main = main;
	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String[] getContains() {
		return contains;
	}

	public void setContains(String[] contains) {
		this.contains = contains;
	}

	public String getPrevious_version() {
		return previous_version;
	}

	public void setPrevious_version(String previous_version) {
		this.previous_version = previous_version;
	}

	public String getCurrent_version() {
		return current_version;
	}

	public void setCurrent_version(String current_version) {
		this.current_version = current_version;
	}

	public Main1 getMain() {
		return main;
	}

	public void setMain(Main1 main) {
		this.main = main;
	}

	@Override
	public String toString() {
		return "Version [sno=" + sno + ", version_id=" + version_id + ", status=" + status + ", contains="
				+ Arrays.toString(contains) + ", previous_version=" + previous_version + ", current_version="
				+ current_version + ", main=" + main + "]";
	}

	
}
