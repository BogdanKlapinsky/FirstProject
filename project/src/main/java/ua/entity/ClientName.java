package ua.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
//@Table(indexes=@Index(columnList = "name"))
public class ClientName {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy="clientName")
	private List<MyOrder> myOrders=new ArrayList<>();

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
	public List<MyOrder> getMyOrders() {
		return myOrders;
	}
	public void setMyOrders(List<MyOrder> myOrders) {
		this.myOrders = myOrders;
	}

}
