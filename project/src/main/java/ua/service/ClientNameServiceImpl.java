package ua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.entity.ClientName;
import ua.repository.ClientNameRepository;
@Service
public class ClientNameServiceImpl implements ClientNameService {
	@Autowired
	private ClientNameRepository clientNameRepository;
	@Override
	public void save(String name) {
		ClientName clientName = new ClientName();
		clientName.setName(name);
		clientNameRepository.save(clientName);
	}

	@Override
	public  ClientName findByName(String name) {		
		return clientNameRepository.findByName(name);
	}
	@Override
	public List<ClientName> findAll() {
		return clientNameRepository.findAll();
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public Page<ClientName> findAll(Pageable pageable) {
		return clientNameRepository.findAll(pageable);
	}
}
