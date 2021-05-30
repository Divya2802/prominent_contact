package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO class for education entity
 * @author Divya
 *
 */
@Entity
@Table(name="education")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sno;
	private String eduid;
	private String name;
	private String type;
	private String  id;
	private String linkedin_url;
	private String facebook_url;
	private String twitter_url;
	private String linkedin_id;
	private String website;
	private String domain;
	private String location;
	private String degrees;
	private String majors;
	private String minors;
	private String start_date;
	private String end_date;
	private String gpa;
	private String summary;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "main_id",referencedColumnName = "sno")
	private Main1 main_education;
	
	public Education() {
		super();
	}

	public Education(Long sno, String eduid, String name, String type, String id, String linkedin_url,
			String facebook_url, String twitter_url, String linkedin_id, String website, String domain, String location,
			String degrees, String majors, String minors, String start_date, String end_date, String gpa,
			String summary, Main1 main_education) {
		super();
		this.sno = sno;
		this.eduid = eduid;
		this.name = name;
		this.type = type;
		this.id = id;
		this.linkedin_url = linkedin_url;
		this.facebook_url = facebook_url;
		this.twitter_url = twitter_url;
		this.linkedin_id = linkedin_id;
		this.website = website;
		this.domain = domain;
		this.location = location;
		this.degrees = degrees;
		this.majors = majors;
		this.minors = minors;
		this.start_date = start_date;
		this.end_date = end_date;
		this.gpa = gpa;
		this.summary = summary;
		this.main_education = main_education;
	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getEduid() {
		return eduid;
	}

	public void setEduid(String eduid) {
		this.eduid = eduid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getFacebook_url() {
		return facebook_url;
	}

	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}

	public String getTwitter_url() {
		return twitter_url;
	}

	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}

	public String getLinkedin_id() {
		return linkedin_id;
	}

	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDegrees() {
		return degrees;
	}

	public void setDegrees(String degrees) {
		this.degrees = degrees;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getMinors() {
		return minors;
	}

	public void setMinors(String minors) {
		this.minors = minors;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Main1 getMain_education() {
		return main_education;
	}

	public void setMain_education(Main1 main_education) {
		this.main_education = main_education;
	}

	@Override
	public String toString() {
		return "Education [sno=" + sno + ", eduid=" + eduid + ", name=" + name + ", type=" + type + ", id=" + id
				+ ", linkedin_url=" + linkedin_url + ", facebook_url=" + facebook_url + ", twitter_url=" + twitter_url
				+ ", linkedin_id=" + linkedin_id + ", website=" + website + ", domain=" + domain + ", location="
				+ location + ", degrees=" + degrees + ", majors=" + majors + ", minors=" + minors + ", start_date="
				+ start_date + ", end_date=" + end_date + ", gpa=" + gpa + ", summary=" + summary + ", main_education="
				+ main_education + "]";
	}

	
}
