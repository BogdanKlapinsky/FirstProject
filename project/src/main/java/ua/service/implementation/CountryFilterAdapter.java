package ua.service.implementation;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import ua.entity.CountryName;
import ua.form.CountryFilterForm;
public class CountryFilterAdapter implements Specification<CountryName>{
	private String search = "";
	public CountryFilterAdapter(CountryFilterForm form){
		search = form.getSearch();
	}
	@Override
	public Predicate toPredicate(Root<CountryName> root,
			CriteriaQuery<?> query, CriteriaBuilder cb) {
		if(query.getResultType() != Long.class && query.getResultType()
				!=long.class){
			root.fetch("item");
			root.fetch("measuringSystem");
			query.distinct(true);
		}
		Expression<String> exp = root.get("name");
		return cb.like(cb.upper(exp), search.toUpperCase()+"%"); 
	}
	
	
}
