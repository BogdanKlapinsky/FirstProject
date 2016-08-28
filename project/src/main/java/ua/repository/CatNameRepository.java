package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.CatName;

public interface CatNameRepository  extends JpaRepository<CatName, Integer>{

	CatName findByName(String name);

}
