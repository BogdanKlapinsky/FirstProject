package ua.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.CatName;
public interface CatNameService {
	List<CatName> findAll();
	void save(CatName catName);
	void delete(int id);
	CatName findOne(int id);
	CatName findByName(String name);
	Page<CatName> findAll(Pageable pageable);
	//Page<CatName> findAll(Pageable pageable, CatNameFilter filter);
	//CatName findAll(int id);
}
