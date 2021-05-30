package com.example.demo.model.experience;

import java.util.Arrays;

import javax.persistence.*;

import com.example.demo.model.Experience;

/**
 * POJO class for title entity
 * @author Divya
 *
 */
@Entity
@Table(name="title")
public class Title {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sno")
	private Long sno;
	private String name;
	private String role;
	private String sub_role;
	private String[] levels;
	
	@OneToOne(mappedBy = "title")
	private Experience experience;

	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Title(Long sno, String name, String role, String sub_role, String[] levels, Experience experience) {
		super();
		this.sno = sno;
		this.name = name;
		this.role = role;
		this.sub_role = sub_role;
		this.levels = levels;
		this.experience = experience;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSub_role() {
		return sub_role;
	}

	public void setSub_role(String sub_role) {
		this.sub_role = sub_role;
	}

	public String[] getLevels() {
		return levels;
	}

	public void setLevels(String[] levels) {
		this.levels = levels;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Title [sno=" + sno + ", name=" + name + ", role=" + role + ", sub_role=" + sub_role + ", levels="
				+ Arrays.toString(levels) + ", experience=" + experience + "]";
	}
	
	
}
