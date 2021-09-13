package com.example.easyfind.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="service_provider")
public class ServiceProvider {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name, email, phone, city, logo;
	
//	@ManyToMany
//	@JoinTable(name="sp_meal")
//	private List<Meal> menu;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
//	public List<Meal> getMenu() {
//		return menu;
//	}
//	public void setMenu(List<Meal> menu) {
//		this.menu = menu;
//	}

}
