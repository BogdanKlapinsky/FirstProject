package ua.entity;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.*;




public class Main {
	public static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
	public static final EntityManager em = factory.createEntityManager();

	public static void main(String[] args) {
		
		em.getTransaction().begin();
		ClientName clientName=new ClientName();
		//clientName.setName("Pavlo");
		em.persist(clientName);
		MyOrder myOrder2 = new MyOrder();
		myOrder2.setClientName(clientName);
		MyOrder myOrder= em.find(MyOrder.class, 1);
		Item item4 = em.find(Item.class, 2);
		myOrder2.setItem(item4);
		em.persist(myOrder2);
		ClientName clientName3 = em.find(ClientName.class, 2);
		CatName catName = new CatName();
		//catName.setName("Oil");
		em.persist(catName);
		CountryName countryName = em.find(CountryName.class,1);
		Item item = new Item();
		
//		CountryName countryName1 = em.createQuery("select c from CountryName c where c.name =:name",CountryName.class )
//				.setParameter("name","Ukrain").getSingleResult();
//		CountryName countryName2 = em.createQuery("select c from CountryName c where c.name =:name",CountryName.class )
//				.setParameter("name","Italy").getSingleResult();
//		CatName catName1 = em.createQuery("select c from CatName c where c.name =:name", CatName.class)
//				.setParameter("name", "Brake pad").getSingleResult();
//		CatName catName2 = em.createQuery("select c from CatName c where c.name =:name",CatName.class)
//				.setParameter("name","Filter").getSingleResult();
//		ClientName clientName1 = em.createQuery("select c from ClientName c where c.name =:name", ClientName.class)
//				.setParameter("name", "Ivan").getSingleResult();
//		ClientName clientName2 = em.createQuery("select c from ClientName c where c.name =:name", ClientName.class)
//				.setParameter("name","Ivan").getSingleResult();
//		Item item1 = em.createQuery("select c from Item c where c.quantity =:quantity",Item.class)
//				.setParameter("quantity", 2).getSingleResult();
//		Item item2 = em.createQuery("select c from Item c where c.quantity =:quantity",Item.class)
//				.setParameter("quantity", 2).getSingleResult();
//		List <Item> item3 = em.createQuery("select r from Item r join r.countryName c where c.name=:name ",Item.class)
//				.setParameter("name","Ukrain" ).getResultList();
//		MyOrder myOrder4 = em.createQuery("select r from MyOrder r join r.ClientName c where c.name=:name ",MyOrder.class)
//				.setParameter("name","Ivan" ).getSingleResult();
		
		
		
//		List<CountryName> countryName3 = em.createQuery("Select distinct c from c.CountryName c"
//				+ "JOIN fetch c.catName "
//				+ "Where r.name=:name", CountryName.class).setParameter("name", "Italy").getResultList();
//		List<CountryName> countryName4 = em.createQuery("Select distinct c from c.CountryName c"
//				+ "JOIN fetch c.catName "
//				+ "Where c.name=:name", CountryName.class).setParameter("name", "USA").getResultList();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Item> cq =cb.createQuery(Item.class);
		Root<Item> root  =  cq.from(Item.class);
		Predicate findByItemName = cb.equal(root.join("catName").get("name"), "Oil");
		cq.where(findByItemName);
		root.fetch("countryName");
		List<Item> item20 = em.createQuery(cq).getResultList();
		Join<Item, CountryName> ItemjoinCountryName = root.join("countryName");//показуЇм до €кого пол€ доступаЇмось з обЇднаних таблиць
		cq.distinct(true);
		Predicate findByCountryName = cb.equal(ItemjoinCountryName.get("name"), "Italy");
		Join<Order, Item> orderJoinItem = root.join("quantity");
		//Expression<Integer>	ex = orderJoinItem.get(orderJoinItem);
		
		
		//em.persist(item);
		
		//Item item5 = em.createQuery("select r from Item r join r.item c where c.catName ")
		
//		countryName.setName("UK");
		/*  int i= 1;+
		    while (i==1){		    
	   		System.out.println("¬вед≥ть назву товару ");		    
		    catName.setName(readerString());
		    System.out.println("¬вед≥ть крањну виробника ");
		    countryName.setName(readerString());		 
		    item.setCatName(catName);
		    item.setCountryName(countryName);
		    System.out.println("¬вед≥ть к≥льк≥сть товару ");
		    item.setQuantity(readerInt());
		    System.out.println("ўоб додати наступний товар натисн≥ть 1 ");
		    }*/
		    
		    
	/*	CountryName countryName = em.find(CountryName.class,1);
		CatName catName = em.find(CatName.class,1);
		countryName.setName("Italy");
		Item item = em.find(Item.class, 1);
		item.setCatName(catName);
		item.setCountryName(countryName);
		item.setQuantity(5);
		//countryName.setItems(items);
		//CountryName countryName = new CountryName();
		
		catName.setName("Brake");
		em.persist(countryName);*/
		//
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	public static String readerString(){
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
	    return b;
	}
	public static int readerInt(){
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
	    int k = sc.nextInt();
	    return k;
	}

}
