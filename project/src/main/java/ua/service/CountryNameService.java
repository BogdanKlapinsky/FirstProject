package ua.service;
import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.CountryName;
import ua.form.CountryFilterForm;
public interface CountryNameService {
	void save(String name);
	CountryName findByName(String name);
	public void delete(int id);
	List<CountryName> findAll();
	Page<CountryName> findAll(Pageable pageable, CountryFilterForm form);
}
