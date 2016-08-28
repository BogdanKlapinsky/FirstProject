/*package ua.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class AmountAndItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch=FetchType.LAZY)
	private Item item;
	
	private int amount;
//	@OneToMany(fetch = FetchType.LAZY, mappedBy="amountAndItem")
//	private List<CountryName> countryName = new ArrayList<>();
	private String path;
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
	private int version;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
//	public List<CountryName> getCountryName() {
//		return countryName;
//	}
//	public void setCountryName(List<CountryName> countryName) {
//		this.countryName = countryName;
//	}
	
}*/
