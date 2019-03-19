package com.sai.om.Entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Hotel_table")
public class HotelEntity implements Serializable {
	
	public HotelEntity() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	@Column(name="hotel_Id")
	private Integer hotelId;
	@Column(name="hotel_Nmae")
	private String hotelName;
	@Column(name="hotel_Type")
	private String hotelType;
	@Column(name="hotel_Location")
	private String hotelLocation;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel")
     private Collection<DishEntity> dishEntites; 
       
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public Collection<DishEntity> getDishEntites() {
		return dishEntites;
	}
	public void setDishEntites(Collection<DishEntity> dishEntites) {
		this.dishEntites = dishEntites;
	}
	
	

}
