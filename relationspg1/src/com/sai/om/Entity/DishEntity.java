package com.sai.om.Entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Dish_Table")
public class DishEntity implements Serializable {
	
	public DishEntity() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator="inc")
	@Column(name="dish_Id")
	private Integer dishId;
	@Column(name="dish_Name")
	private String dishName;
	@Column(name="dish_Type")
	private String dishType;
	@Column(name="dish_Cost")
	private double dishCost;
	
	public DishEntity(String dishName, String dishType, double dishCost) {
		super();
	System.out.println(this.getClass().getSimpleName()+"created");
		this.dishName = dishName;
		this.dishType = dishType;
		this.dishCost = dishCost;
	}

	public Integer getDishId() {
		return dishId;
	}
	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishType() {
		return dishType;
	}
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	public double getDishCost() {
		return dishCost;
	}
	public void setDishCost(double dishCost) {
		this.dishCost = dishCost;
	}
	

}
