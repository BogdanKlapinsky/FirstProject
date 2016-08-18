package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.ClientName;

public interface ClientNameRepository extends JpaRepository<ClientName, Integer>{

	public ClientName findByName(String name);

}
