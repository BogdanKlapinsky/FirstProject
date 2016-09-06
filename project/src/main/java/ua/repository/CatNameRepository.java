package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.CatName;
import ua.entity.ClientName;

public interface CatNameRepository  extends JpaRepository<CatName, Integer>{
	public CatName findByName(String name);
}
