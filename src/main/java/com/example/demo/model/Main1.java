package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * POJO class for the Main1 entity.
 * @author Divya
 *
 */


@Entity
@Table(name="main1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Main1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sno;
	
	private String job_company_location_geo;
	private String job_company_name;
	private String birth_date;
	private String middle_initial;
	private String job_company_size;
	private String linkedin_username;
	private String birth_year;
	private String job_company_location_locality;
	private String id;
	private String job_title;
	private String facebook_url;
	private String job_company_id;
	private String location_region;
	private String location_street_address;
	private String location_address_line_2;
	private String job_company_location_postal_code;
	private String facebook_id;
	private String location_name;
	private String full_name;
	private String location_last_updated;
	private String version_contains;
	private String previous_version;
	private String current_version;
	private String job_company_location_street_address;
	private String job_company_founded;
	private String linkedin_url;
	private String work_email;
	private String job_company_location_region;
	private String job_company_website;
	private String gender;
	private String location_country;
	private String facebook_username;
	private String twitter_username;
	private String job_company_location_country;
	private String github_username;
	private String industry;
	private String location_geo;
	private String job_company_location_address_line_2;
	private String location_postal_code;
	private String mobile_phone;
	private String location_continent;
	private String location_locality;
	private String first_name;
	private String twitter_url;
	private String job_company_location_continent;
	private String job_company_facebook_url;
	private String job_company_linkedin_url;
	private String last_name;
	private String linkedin_id;
	private String job_last_updated;
	private String middle_name;
	private String job_company_twitter_url;
	private String job_title_role;
	private String job_company_linkedin_id;
	private String github_url;
	private String job_company_industry;
	private String job_company_location_name;
	private String[] skills;
	private String[] job_title_levels;
	private String[] countries;
	private String[] location_names;
	private String[] regions;
	private String[] street_addresses;
	private String[] phone_numbers;
	private String[] interests;
	private String inferred_salary;
	private String inferred_years_experience;
	private String summary;
	private String job_title_sub_role;
	private String job_start_date;
	
	@OneToMany(mappedBy = "main_education",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Education> education;
	
	@OneToMany(mappedBy = "main_experience",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Experience> experience;
	
	@OneToMany(mappedBy = "main_emails",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Emails> emails;
	
	@OneToMany(mappedBy = "main_profiles",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Profiles> profiles;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "version_id", referencedColumnName = "sno")
	private Version version_status;
	
	
	public Main1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Main1(Long sno, String job_company_location_geo, String job_company_name, String birth_date,
			String middle_initial, String job_company_size, String linkedin_username, String birth_year,
			String job_company_location_locality, String id, String job_title, String facebook_url,
			String job_company_id, String location_region, String location_street_address,
			String location_address_line_2, String job_company_location_postal_code, String facebook_id,
			String location_name, String full_name, String location_last_updated, String version_contains,
			String previous_version, String current_version, String job_company_location_street_address,
			String job_company_founded, String linkedin_url, String work_email, String job_company_location_region,
			String job_company_website, String gender, String location_country, String facebook_username,
			String twitter_username, String job_company_location_country, String github_username, String industry,
			String location_geo, String job_company_location_address_line_2, String location_postal_code,
			String mobile_phone, String location_continent, String location_locality, String first_name,
			String twitter_url, String job_company_location_continent, String job_company_facebook_url,
			String job_company_linkedin_url, String last_name, String linkedin_id, String job_last_updated,
			String middle_name, String job_company_twitter_url, String job_title_role, String job_company_linkedin_id,
			String github_url, String job_company_industry, String job_company_location_name, String[] skills,
			String[] job_title_levels, String[] countries, String[] location_names, String[] regions,
			String[] street_addresses, String[] phone_numbers, String[] interests, String inferred_salary,
			String inferred_years_experience, String summary, String job_title_sub_role, String job_start_date,
			List<Education> education, List<Experience> experience, List<Emails> emails, List<Profiles> profiles,
			Version version_status) {
		super();
		this.sno = sno;
		this.job_company_location_geo = job_company_location_geo;
		this.job_company_name = job_company_name;
		this.birth_date = birth_date;
		this.middle_initial = middle_initial;
		this.job_company_size = job_company_size;
		this.linkedin_username = linkedin_username;
		this.birth_year = birth_year;
		this.job_company_location_locality = job_company_location_locality;
		this.id = id;
		this.job_title = job_title;
		this.facebook_url = facebook_url;
		this.job_company_id = job_company_id;
		this.location_region = location_region;
		this.location_street_address = location_street_address;
		this.location_address_line_2 = location_address_line_2;
		this.job_company_location_postal_code = job_company_location_postal_code;
		this.facebook_id = facebook_id;
		this.location_name = location_name;
		this.full_name = full_name;
		this.location_last_updated = location_last_updated;
		this.version_contains = version_contains;
		this.previous_version = previous_version;
		this.current_version = current_version;
		this.job_company_location_street_address = job_company_location_street_address;
		this.job_company_founded = job_company_founded;
		this.linkedin_url = linkedin_url;
		this.work_email = work_email;
		this.job_company_location_region = job_company_location_region;
		this.job_company_website = job_company_website;
		this.gender = gender;
		this.location_country = location_country;
		this.facebook_username = facebook_username;
		this.twitter_username = twitter_username;
		this.job_company_location_country = job_company_location_country;
		this.github_username = github_username;
		this.industry = industry;
		this.location_geo = location_geo;
		this.job_company_location_address_line_2 = job_company_location_address_line_2;
		this.location_postal_code = location_postal_code;
		this.mobile_phone = mobile_phone;
		this.location_continent = location_continent;
		this.location_locality = location_locality;
		this.first_name = first_name;
		this.twitter_url = twitter_url;
		this.job_company_location_continent = job_company_location_continent;
		this.job_company_facebook_url = job_company_facebook_url;
		this.job_company_linkedin_url = job_company_linkedin_url;
		this.last_name = last_name;
		this.linkedin_id = linkedin_id;
		this.job_last_updated = job_last_updated;
		this.middle_name = middle_name;
		this.job_company_twitter_url = job_company_twitter_url;
		this.job_title_role = job_title_role;
		this.job_company_linkedin_id = job_company_linkedin_id;
		this.github_url = github_url;
		this.job_company_industry = job_company_industry;
		this.job_company_location_name = job_company_location_name;
		this.skills = skills;
		this.job_title_levels = job_title_levels;
		this.countries = countries;
		this.location_names = location_names;
		this.regions = regions;
		this.street_addresses = street_addresses;
		this.phone_numbers = phone_numbers;
		this.interests = interests;
		this.inferred_salary = inferred_salary;
		this.inferred_years_experience = inferred_years_experience;
		this.summary = summary;
		this.job_title_sub_role = job_title_sub_role;
		this.job_start_date = job_start_date;
		this.education = education;
		this.experience = experience;
		this.emails = emails;
		this.profiles = profiles;
		this.version_status = version_status;
	}


	public Long getSno() {
		return sno;
	}


	public void setSno(Long sno) {
		this.sno = sno;
	}


	public String getJob_company_location_geo() {
		return job_company_location_geo;
	}


	public void setJob_company_location_geo(String job_company_location_geo) {
		this.job_company_location_geo = job_company_location_geo;
	}


	public String getJob_company_name() {
		return job_company_name;
	}


	public void setJob_company_name(String job_company_name) {
		this.job_company_name = job_company_name;
	}


	public String getBirth_date() {
		return birth_date;
	}


	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}


	public String getMiddle_initial() {
		return middle_initial;
	}


	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}


	public String getJob_company_size() {
		return job_company_size;
	}


	public void setJob_company_size(String job_company_size) {
		this.job_company_size = job_company_size;
	}


	public String getLinkedin_username() {
		return linkedin_username;
	}


	public void setLinkedin_username(String linkedin_username) {
		this.linkedin_username = linkedin_username;
	}


	public String getBirth_year() {
		return birth_year;
	}


	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}


	public String getJob_company_location_locality() {
		return job_company_location_locality;
	}


	public void setJob_company_location_locality(String job_company_location_locality) {
		this.job_company_location_locality = job_company_location_locality;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getJob_title() {
		return job_title;
	}


	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}


	public String getFacebook_url() {
		return facebook_url;
	}


	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}


	public String getJob_company_id() {
		return job_company_id;
	}


	public void setJob_company_id(String job_company_id) {
		this.job_company_id = job_company_id;
	}


	public String getLocation_region() {
		return location_region;
	}


	public void setLocation_region(String location_region) {
		this.location_region = location_region;
	}


	public String getLocation_street_address() {
		return location_street_address;
	}


	public void setLocation_street_address(String location_street_address) {
		this.location_street_address = location_street_address;
	}


	public String getLocation_address_line_2() {
		return location_address_line_2;
	}


	public void setLocation_address_line_2(String location_address_line_2) {
		this.location_address_line_2 = location_address_line_2;
	}


	public String getJob_company_location_postal_code() {
		return job_company_location_postal_code;
	}


	public void setJob_company_location_postal_code(String job_company_location_postal_code) {
		this.job_company_location_postal_code = job_company_location_postal_code;
	}


	public String getFacebook_id() {
		return facebook_id;
	}


	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}


	public String getLocation_name() {
		return location_name;
	}


	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}


	public String getFull_name() {
		return full_name;
	}


	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}


	public String getLocation_last_updated() {
		return location_last_updated;
	}


	public void setLocation_last_updated(String location_last_updated) {
		this.location_last_updated = location_last_updated;
	}


	public String getVersion_contains() {
		return version_contains;
	}


	public void setVersion_contains(String version_contains) {
		this.version_contains = version_contains;
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


	public String getJob_company_location_street_address() {
		return job_company_location_street_address;
	}


	public void setJob_company_location_street_address(String job_company_location_street_address) {
		this.job_company_location_street_address = job_company_location_street_address;
	}


	public String getJob_company_founded() {
		return job_company_founded;
	}


	public void setJob_company_founded(String job_company_founded) {
		this.job_company_founded = job_company_founded;
	}


	public String getLinkedin_url() {
		return linkedin_url;
	}


	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}


	public String getWork_email() {
		return work_email;
	}


	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}


	public String getJob_company_location_region() {
		return job_company_location_region;
	}


	public void setJob_company_location_region(String job_company_location_region) {
		this.job_company_location_region = job_company_location_region;
	}


	public String getJob_company_website() {
		return job_company_website;
	}


	public void setJob_company_website(String job_company_website) {
		this.job_company_website = job_company_website;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getLocation_country() {
		return location_country;
	}


	public void setLocation_country(String location_country) {
		this.location_country = location_country;
	}


	public String getFacebook_username() {
		return facebook_username;
	}


	public void setFacebook_username(String facebook_username) {
		this.facebook_username = facebook_username;
	}


	public String getTwitter_username() {
		return twitter_username;
	}


	public void setTwitter_username(String twitter_username) {
		this.twitter_username = twitter_username;
	}


	public String getJob_company_location_country() {
		return job_company_location_country;
	}


	public void setJob_company_location_country(String job_company_location_country) {
		this.job_company_location_country = job_company_location_country;
	}


	public String getGithub_username() {
		return github_username;
	}


	public void setGithub_username(String github_username) {
		this.github_username = github_username;
	}


	public String getIndustry() {
		return industry;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	public String getLocation_geo() {
		return location_geo;
	}


	public void setLocation_geo(String location_geo) {
		this.location_geo = location_geo;
	}


	public String getJob_company_location_address_line_2() {
		return job_company_location_address_line_2;
	}


	public void setJob_company_location_address_line_2(String job_company_location_address_line_2) {
		this.job_company_location_address_line_2 = job_company_location_address_line_2;
	}


	public String getLocation_postal_code() {
		return location_postal_code;
	}


	public void setLocation_postal_code(String location_postal_code) {
		this.location_postal_code = location_postal_code;
	}


	public String getMobile_phone() {
		return mobile_phone;
	}


	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}


	public String getLocation_continent() {
		return location_continent;
	}


	public void setLocation_continent(String location_continent) {
		this.location_continent = location_continent;
	}


	public String getLocation_locality() {
		return location_locality;
	}


	public void setLocation_locality(String location_locality) {
		this.location_locality = location_locality;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getTwitter_url() {
		return twitter_url;
	}


	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}


	public String getJob_company_location_continent() {
		return job_company_location_continent;
	}


	public void setJob_company_location_continent(String job_company_location_continent) {
		this.job_company_location_continent = job_company_location_continent;
	}


	public String getJob_company_facebook_url() {
		return job_company_facebook_url;
	}


	public void setJob_company_facebook_url(String job_company_facebook_url) {
		this.job_company_facebook_url = job_company_facebook_url;
	}


	public String getJob_company_linkedin_url() {
		return job_company_linkedin_url;
	}


	public void setJob_company_linkedin_url(String job_company_linkedin_url) {
		this.job_company_linkedin_url = job_company_linkedin_url;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getLinkedin_id() {
		return linkedin_id;
	}


	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
	}


	public String getJob_last_updated() {
		return job_last_updated;
	}


	public void setJob_last_updated(String job_last_updated) {
		this.job_last_updated = job_last_updated;
	}


	public String getMiddle_name() {
		return middle_name;
	}


	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}


	public String getJob_company_twitter_url() {
		return job_company_twitter_url;
	}


	public void setJob_company_twitter_url(String job_company_twitter_url) {
		this.job_company_twitter_url = job_company_twitter_url;
	}


	public String getJob_title_role() {
		return job_title_role;
	}


	public void setJob_title_role(String job_title_role) {
		this.job_title_role = job_title_role;
	}


	public String getJob_company_linkedin_id() {
		return job_company_linkedin_id;
	}


	public void setJob_company_linkedin_id(String job_company_linkedin_id) {
		this.job_company_linkedin_id = job_company_linkedin_id;
	}


	public String getGithub_url() {
		return github_url;
	}


	public void setGithub_url(String github_url) {
		this.github_url = github_url;
	}


	public String getJob_company_industry() {
		return job_company_industry;
	}


	public void setJob_company_industry(String job_company_industry) {
		this.job_company_industry = job_company_industry;
	}


	public String getJob_company_location_name() {
		return job_company_location_name;
	}


	public void setJob_company_location_name(String job_company_location_name) {
		this.job_company_location_name = job_company_location_name;
	}


	public String[] getSkills() {
		return skills;
	}


	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	public String[] getJob_title_levels() {
		return job_title_levels;
	}


	public void setJob_title_levels(String[] job_title_levels) {
		this.job_title_levels = job_title_levels;
	}


	public String[] getCountries() {
		return countries;
	}


	public void setCountries(String[] countries) {
		this.countries = countries;
	}


	public String[] getLocation_names() {
		return location_names;
	}


	public void setLocation_names(String[] location_names) {
		this.location_names = location_names;
	}


	public String[] getRegions() {
		return regions;
	}


	public void setRegions(String[] regions) {
		this.regions = regions;
	}


	public String[] getStreet_addresses() {
		return street_addresses;
	}


	public void setStreet_addresses(String[] street_addresses) {
		this.street_addresses = street_addresses;
	}


	public String[] getPhone_numbers() {
		return phone_numbers;
	}


	public void setPhone_numbers(String[] phone_numbers) {
		this.phone_numbers = phone_numbers;
	}


	public String[] getInterests() {
		return interests;
	}


	public void setInterests(String[] interests) {
		this.interests = interests;
	}


	public String getInferred_salary() {
		return inferred_salary;
	}


	public void setInferred_salary(String inferred_salary) {
		this.inferred_salary = inferred_salary;
	}


	public String getInferred_years_experience() {
		return inferred_years_experience;
	}


	public void setInferred_years_experience(String inferred_years_experience) {
		this.inferred_years_experience = inferred_years_experience;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getJob_title_sub_role() {
		return job_title_sub_role;
	}


	public void setJob_title_sub_role(String job_title_sub_role) {
		this.job_title_sub_role = job_title_sub_role;
	}


	public String getJob_start_date() {
		return job_start_date;
	}


	public void setJob_start_date(String job_start_date) {
		this.job_start_date = job_start_date;
	}


	public List<Education> getEducation() {
		return education;
	}


	public void setEducation(List<Education> education) {
		this.education = education;
	}


	public List<Experience> getExperience() {
		return experience;
	}


	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}


	public List<Emails> getEmails() {
		return emails;
	}


	public void setEmails(List<Emails> emails) {
		this.emails = emails;
	}


	public List<Profiles> getProfiles() {
		return profiles;
	}


	public void setProfiles(List<Profiles> profiles) {
		this.profiles = profiles;
	}


	public Version getVersion_status() {
		return version_status;
	}


	public void setVersion_status(Version version_status) {
		this.version_status = version_status;
	}


	@Override
	public String toString() {
		return "Main1 [sno=" + sno + ", job_company_location_geo=" + job_company_location_geo + ", job_company_name="
				+ job_company_name + ", birth_date=" + birth_date + ", middle_initial=" + middle_initial
				+ ", job_company_size=" + job_company_size + ", linkedin_username=" + linkedin_username
				+ ", birth_year=" + birth_year + ", job_company_location_locality=" + job_company_location_locality
				+ ", id=" + id + ", job_title=" + job_title + ", facebook_url=" + facebook_url + ", job_company_id="
				+ job_company_id + ", location_region=" + location_region + ", location_street_address="
				+ location_street_address + ", location_address_line_2=" + location_address_line_2
				+ ", job_company_location_postal_code=" + job_company_location_postal_code + ", facebook_id="
				+ facebook_id + ", location_name=" + location_name + ", full_name=" + full_name
				+ ", location_last_updated=" + location_last_updated + ", version_contains=" + version_contains
				+ ", previous_version=" + previous_version + ", current_version=" + current_version
				+ ", job_company_location_street_address=" + job_company_location_street_address
				+ ", job_company_founded=" + job_company_founded + ", linkedin_url=" + linkedin_url + ", work_email="
				+ work_email + ", job_company_location_region=" + job_company_location_region + ", job_company_website="
				+ job_company_website + ", gender=" + gender + ", location_country=" + location_country
				+ ", facebook_username=" + facebook_username + ", twitter_username=" + twitter_username
				+ ", job_company_location_country=" + job_company_location_country + ", github_username="
				+ github_username + ", industry=" + industry + ", location_geo=" + location_geo
				+ ", job_company_location_address_line_2=" + job_company_location_address_line_2
				+ ", location_postal_code=" + location_postal_code + ", mobile_phone=" + mobile_phone
				+ ", location_continent=" + location_continent + ", location_locality=" + location_locality
				+ ", first_name=" + first_name + ", twitter_url=" + twitter_url + ", job_company_location_continent="
				+ job_company_location_continent + ", job_company_facebook_url=" + job_company_facebook_url
				+ ", job_company_linkedin_url=" + job_company_linkedin_url + ", last_name=" + last_name
				+ ", linkedin_id=" + linkedin_id + ", job_last_updated=" + job_last_updated + ", middle_name="
				+ middle_name + ", job_company_twitter_url=" + job_company_twitter_url + ", job_title_role="
				+ job_title_role + ", job_company_linkedin_id=" + job_company_linkedin_id + ", github_url=" + github_url
				+ ", job_company_industry=" + job_company_industry + ", job_company_location_name="
				+ job_company_location_name + ", skills=" + Arrays.toString(skills) + ", job_title_levels="
				+ Arrays.toString(job_title_levels) + ", countries=" + Arrays.toString(countries) + ", location_names="
				+ Arrays.toString(location_names) + ", regions=" + Arrays.toString(regions) + ", street_addresses="
				+ Arrays.toString(street_addresses) + ", phone_numbers=" + Arrays.toString(phone_numbers)
				+ ", interests=" + Arrays.toString(interests) + ", inferred_salary=" + inferred_salary
				+ ", inferred_years_experience=" + inferred_years_experience + ", summary=" + summary
				+ ", job_title_sub_role=" + job_title_sub_role + ", job_start_date=" + job_start_date + ", education="
				+ education + ", experience=" + experience + ", emails=" + emails + ", profiles=" + profiles
				+ ", version_status=" + version_status + "]";
	}


	
	
	
}
