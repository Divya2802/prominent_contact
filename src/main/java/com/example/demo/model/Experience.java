package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.*;

import com.example.demo.model.experience.Company;
import com.example.demo.model.experience.Title;
/**
 * POJO class for experience entity
 * @author Divya
 *
 */
@Entity
@Table(name="experience")
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sno;
	private String expid;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "sno")
	private Company company;
	
	private String start_date;
	private String end_date;
	private String[] location_names;
	private String is_primary;
	private String summary;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "title_id", referencedColumnName = "sno")
	private Title title;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "main_id",referencedColumnName = "sno")
	private Main1 main_experience;
	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Experience(Long sno, String expid, Company company, String start_date, String end_date,
			String[] location_names, String is_primary, String summary, Title title, Main1 main_experience) {
		super();
		this.sno = sno;
		this.expid = expid;
		this.company = company;
		this.start_date = start_date;
		this.end_date = end_date;
		this.location_names = location_names;
		this.is_primary = is_primary;
		this.summary = summary;
		this.title = title;
		this.main_experience = main_experience;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getExpid() {
		return expid;
	}
	public void setExpid(String expid) {
		this.expid = expid;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
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
	public String[] getLocation_names() {
		return location_names;
	}
	public void setLocation_names(String[] location_names) {
		this.location_names = location_names;
	}
	public String getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(String is_primary) {
		this.is_primary = is_primary;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Main1 getMain_experience() {
		return main_experience;
	}
	public void setMain_experience(Main1 main_experience) {
		this.main_experience = main_experience;
	}
	@Override
	public String toString() {
		return "Experience [sno=" + sno + ", expid=" + expid + ", company=" + company + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", location_names=" + Arrays.toString(location_names) + ", is_primary="
				+ is_primary + ", summary=" + summary + ", title=" + title + ", main_experience=" + main_experience
				+ "]";
	}
	
}
