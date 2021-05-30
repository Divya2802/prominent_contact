package com.example.demo.model.experience;

import javax.persistence.*;

/**
 * POJO class for location entity
 * @author Divya
 *
 */
@Entity
@Table(name="location")
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sno")
	private Long sno;
	private String name;
	private String locality;
	private String region;
	private String country;
	private String continent;
	private String street_address;
	private String address_line_2;
	private String postal_code;
	private String geo;

	@OneToOne(mappedBy = "location")
	private Company company;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(Long sno, String name, String locality, String region, String country, String continent,
			String street_address, String address_line_2, String postal_code, String geo, Company company) {
		super();
		this.sno = sno;
		this.name = name;
		this.locality = locality;
		this.region = region;
		this.country = country;
		this.continent = continent;
		this.street_address = street_address;
		this.address_line_2 = address_line_2;
		this.postal_code = postal_code;
		this.geo = geo;
		this.company = company;
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

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getGeo() {
		return geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Location [sno=" + sno + ", name=" + name + ", locality=" + locality + ", region=" + region
				+ ", country=" + country + ", continent=" + continent + ", street_address=" + street_address
				+ ", address_line_2=" + address_line_2 + ", postal_code=" + postal_code + ", geo=" + geo + ", company="
				+ company + "]";
	}
	
}
