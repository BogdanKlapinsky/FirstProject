package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.CatNameService;
@Entity
@Table(indexes=@Index(columnList = "name"))
public class CatName {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
//	@OneToMany(mappedBy="catName")
//	private List<AmountAndItem> amountAndItem = new ArrayList<>();
	private int version;
	private String path;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
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
//	public List<AmountAndItem> getAmountAndItem() {
//		return amountAndItem;
//	}
//	public void setAmountAndItem(List<AmountAndItem> amountAndItem) {
//		this.amountAndItem = amountAndItem;
//	}
	
}
