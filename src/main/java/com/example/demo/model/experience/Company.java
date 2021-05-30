package com.example.demo.model.experience;

import javax.persistence.*;

import com.example.demo.model.Experience;
/**
 * POJO class for company entity
 * @author Divya
 *
 */
@Entity
@Table(name="company")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sno")
	private Long sno;
	private String name;
	private String size;
	private String id;
	private String founded;
	private String industry;
	private String linkedin_url;
	private String linkedin_id;
	private String facebook_url;
	private String twitter_url;
	private String website;
	
	@OneToOne(mappedBy = "company")
	private Experience experience;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "sno")
	private Location location;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(Long sno, String name, String size, String id, String founded, String industry, String linkedin_url,
			String linkedin_id, String facebook_url, String twitter_url, String website, Experience experience,
			Location location) {
		super();
		this.sno = sno;
		this.name = name;
		this.size = size;
		this.id = id;
		this.founded = founded;
		this.industry = industry;
		this.linkedin_url = linkedin_url;
		this.linkedin_id = linkedin_id;
		this.facebook_url = facebook_url;
		this.twitter_url = twitter_url;
		this.website = website;
		this.experience = experience;
		this.location = location;
	}

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getLinkedin_id() {
		return linkedin_id;
	}

	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [sno=" + sno + ", name=" + name + ", size=" + size + ", id=" + id + ", founded=" + founded
				+ ", industry=" + industry + ", linkedin_url=" + linkedin_url + ", linkedin_id=" + linkedin_id
				+ ", facebook_url=" + facebook_url + ", twitter_url=" + twitter_url + ", website=" + website
				+ ", experience=" + experience + ", location=" + location + "]";
	}

	
	
}
