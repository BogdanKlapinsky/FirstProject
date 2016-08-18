package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.CountryName;
public interface CountryNameRepository extends JpaRepository<CountryName, Integer>{

	CountryName findByName(String name);

}
