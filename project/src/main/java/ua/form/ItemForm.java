package ua.form;

import org.springframework.web.multipart.MultipartFile;

import ua.entity.CatName;
import ua.entity.CountryName;

public class ItemForm {
	private int id;
	private CountryName countryName;
	public CatName catName;
	public CatName getCatNAme() {
		return catName;
	}
	public void setCatName(CatName catName) {
		this.catName = catName;
	}
	private String name;
	private String time;
	private String path;
	private int version;
	private MultipartFile file;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
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
