package com.caledonhillsracing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cyclist 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTIY assumes MySQL has auto increment
	private long id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="age")
	private int age;
	@Column(name="hometown")
	private String homeTown;
	@Column(name="cyclingspecialties")
	private String cyclingSpecialties;
	@Column(name="favoritesong")
	private String favoriteSong;
	@Column(name="favoritecyclingevent")
	private String favoriteCyclingEvent;
	@Column(name="favoritefood")
	private String favoriteFood;
	@Column(name="cyclingicon")
	private String cyclingIcon;
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public int getage()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getHomeTown()
	{
		return homeTown;
	}
	
	public void setHomeTown(String homeTown)
	{
		this.homeTown = homeTown;
	}
	
	public String getCyclingSpecialties()
	{
		return cyclingSpecialties;
	}
	
	public void setCyclingSpecialties(String cyclingSpecialties)
	{
		this.cyclingSpecialties = cyclingSpecialties;
	}
	
	public String getFavoriteSong()
	{
		return favoriteSong;
	}
	
	public void setFavoriteSong(String favoriteSong)
	{
		this.favoriteSong = favoriteSong;
	}
	
	public String getFavoriteCyclingEvent()
	{
		return favoriteCyclingEvent;
	}
	
	public void setFavoriteCyclingEvent(String favoriteCyclingEvent)
	{
		this.favoriteCyclingEvent = favoriteCyclingEvent;
	}
	
	public String getFavoriteFood()
	{
		return favoriteFood;
	}
	
	public void setFavoriteFood(String favoriteFood)
	{
		this.favoriteFood = favoriteFood;
	}
	
	public String getCyclingIcon()
	{
		return cyclingIcon;
	}
	
	public void setCyclingIcon(String cyclingIcon)
	{
		this.cyclingIcon = cyclingIcon;
	}
}
