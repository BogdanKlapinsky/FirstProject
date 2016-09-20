package ua.service.implementation.validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.service.ItemService;
import ua.form.ItemFilterForm;

public class ItemValidator implements Validator{
	private final ItemService itemService;
	private static final Pattern p = Pattern.compile("^[0-9]{2,2}:[0-9]{2,2}:[0-9]{2,2}$");
	
	public ItemValidator(ItemService itemService){
		this.itemService = itemService;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		return ItemFilterForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
//		ItemFilterForm form = (ItemFilterForm) target;
//		if(form.getId()==0)if(itemService.findByName(form.getName())!=null){
//			errors.rejectValue("name", "", "Recipe already exists");
//		}
//		Matcher m = p.matcher(form.getTime());
//		if(!m.matches()){
//			errors.rejectValue("time", "", "Time format is hh:mm:ss");
//		}
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Can`t be empty");
		
	}
	
}
