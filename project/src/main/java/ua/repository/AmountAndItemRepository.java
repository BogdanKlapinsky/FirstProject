package ua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import ua.entity.AmountAndItem;

//public interface AmountAndItemRepository extends JpaRepository<AmountAndItem, Integer>, JpaSpecificationExecutor<AmountAndItem> {

	/*@Query("SELECT ai FROM AmountAndItem ai LEFT JOIN FETCH "
			+ "ai.measuringSystem LEFT JOIN FETCH ai.item")
	List<AmountAndItem> findAll();
	
	@Query("SELECT ai FROM AmountAndItem ai LEFT JOIN FETCH "
			+ "ai.measuringSystem LEFT JOIN FETCH ai.ingredient "
			+ "WHERE ai.id=:id")*/
//	AmountAndItem findOneItemMsInited(@Param("id") int id);
//}
