package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.CatName;
import ua.entity.ClientName;

public interface CatNameService {
	void save(String name);
	CatName findByName(String name);
	Page<CatName> findAll(Pageable pageable);
	void delete(int id);
	List<CatName> findAll();
}
