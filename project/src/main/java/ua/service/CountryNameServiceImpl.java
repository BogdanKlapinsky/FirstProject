package ua.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.CountryName;
import ua.form.CountryFilterForm;
import ua.repository.CountryNameRepository;
import ua.service.implementation.CountryFilterAdapter;
@Service
@Transactional
public class CountryNameServiceImpl implements CountryNameService {
	@Autowired
	private CountryNameRepository countryNameRepository;
	@Override
	public void save(String name) {
		CountryName countryName = new CountryName();
		countryName.setName(name);
		countryNameRepository.save(countryName);
		}
	@Override
	public CountryName findByName(String name){
		return countryNameRepository.findByName(name);
	}
	@Override
	public void delete(int id) {
		countryNameRepository.delete(id);	
	}
	@Override
	public List<CountryName> findAll() {
		return countryNameRepository.findAll();
	}
	@Override
	public Page<CountryName> findAll(Pageable pageable, CountryFilterForm form) {
		return countryNameRepository.findAll(pageable);
	}

}
