package ua.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.entity.CatName;
import ua.repository.CatNameRepository;
@Service
public class CatNameServiceImpl implements CatNameService {
	@Autowired
	private CatNameRepository catNameRepository;

	@Override
	public List<CatName> findAll() {
		return catNameRepository.findAll();
	}

	@Override
	public void save(CatName catName) {
		catNameRepository.save(catName);	
	}

	@Override
	public void delete(int id) {
		catNameRepository.delete(id);
	}

	@Override
	public CatName findOne(int id) {
		return catNameRepository.findOne(id);
		
	}

	@Override
	public CatName findByName(String name) {
		
		return catNameRepository.findByName(name);
	}

	@Override
	public Page<CatName> findAll(Pageable pageable) {
		return catNameRepository.findAll(pageable);
	}

//	@Override
//	public CatName findAll(int id) {
//		
//		return catNameRepository.findAll();
//	}
}
