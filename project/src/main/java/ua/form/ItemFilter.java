package ua.form;

import ua.entity.CountryName;

public class ItemFilter {
	private int id;
	private CountryName countryName;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CountryName getCountryName() {
		return countryName;
	}
	public void setCountryName(CountryName countryName) {
		this.countryName = countryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
