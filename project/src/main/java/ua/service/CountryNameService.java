package ua.service;
import java.util.*;
import ua.entity.CountryName;
public interface CountryNameService {
	void save(String name);
	CountryName findByName(String name);
	public void delete(int id);
	List<CountryName> findAll();
	
}
