package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
//@Table(indexes=@Index(columnList = "name"))
public class CountryName{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy="countryName")
	private List<Item> items=new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
