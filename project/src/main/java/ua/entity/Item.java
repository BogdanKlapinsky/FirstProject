package ua.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
//@Table(indexes=@Index(columnList = "catName_id"))
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int quantity;
	@ManyToOne(fetch=FetchType.LAZY)
	private CatName catName;
	@ManyToOne(fetch=FetchType.LAZY)
	private CountryName countryName;
	@OneToMany(mappedBy="item")
	private List<MyOrder> myOrders=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public CatName getCatName() {
		return catName;
	}
	public void setCatName(CatName catName) {
		this.catName = catName;
	}
	
	public CountryName getCountryName() {
		return countryName;
	}
	public void setCountryName(CountryName countryName) {
		this.countryName = countryName;
	}
	public List<MyOrder> getMyOrders() {
		return myOrders;
	}
	public void setMyOrders(List<MyOrder> myOrders) {
		this.myOrders = myOrders;
	}
	
}