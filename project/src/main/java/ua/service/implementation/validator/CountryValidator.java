package ua.service.implementation.validator;
import java.util.regex.Matcher;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.CountryName;
import ua.service.CountryNameService;
public class CountryValidator implements Validator{
	
	private final CountryNameService countryNameService;
	public CountryValidator(CountryNameService countryNameService) {
		this.countryNameService = countryNameService;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		return CountryName.class.equals(clazz);	
	}

	@Override
	public void validate(Object target, Errors errors) {
		CountryName form = (CountryName) target;
		if(form.getId()==0)if(countryNameService.findByName(form.getName())!=null){
			errors.rejectValue("name", "", "Country already exists");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can`t be empty");
	}

}
