package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.entity.ClientName;

public interface ClientNameService {

	void save(String name);
	
	ClientName findByName(String name);
	
	Page<ClientName> findAll(Pageable pageable);

	void delete(int id);
	
	List<ClientName> findAll();
}
