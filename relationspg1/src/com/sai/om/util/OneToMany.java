package com.sai.om.util;

import java.util.ArrayList;
import java.util.Collection;

import com.sai.om.Entity.DishEntity;
import com.sai.om.Entity.HotelEntity;
import com.sai.om.repositary.HotelRepositary;

public class OneToMany {
	
	public static void main(String[] args) {
		HotelEntity hotel=new HotelEntity();
		hotel.setHotelName("kusum");
		hotel.setHotelType("2star");
		hotel.setHotelLocation("Msr");
		
		DishEntity dish=new DishEntity("spring-dosa","veg",120.00);
		DishEntity dish1=new DishEntity("mushroom","veg",129.00);
		
		Collection<DishEntity> collection=new ArrayList<>();
		collection.add(dish);
		collection.add(dish1);
		
		hotel.setDishEntites(collection);
		
		HotelRepositary repositary=new HotelRepositary();
		repositary.save(hotel);
	}

}
