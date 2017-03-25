package com.caledonhillsracing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/cyclist")
public class MainController 
{
	@Autowired
	private CyclistRepository cyclistRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewCyclist (@RequestParam String firstName, 
			@RequestParam String lastName,
			@RequestParam int age,
			@RequestParam String homeTown,
			@RequestParam String cyclingSpecialties,
			@RequestParam String favoriteSong,
			@RequestParam String favoriteCyclingEvent,
			@RequestParam String favoriteFood,
			@RequestParam String cyclingIcon) 
	{
		Cyclist c = new Cyclist();
		c.setFirstName(firstName);
		c.setLastName(lastName);
		c.setAge(age);
		c.setHomeTown(homeTown);
		c.setCyclingSpecialties(cyclingSpecialties);
		c.setFavoriteSong(favoriteSong);
		c.setFavoriteCyclingEvent(favoriteCyclingEvent);
		c.setFavoriteFood(favoriteFood);
		c.setCyclingIcon(cyclingIcon);
		return "Saved";
		
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Cyclist> getAllCyclists() {
		// This returns a JSON or XML with the users
		return cyclistRepository.findAll();
	}
	
	@GetMapping(path="/cyclist/{name}")
	public @ResponseBody Cyclist getCyclist (@PathVariable String lastName) 
	{
		List<Cyclist> findByLastName = this.cyclistRepository.findByLastName(lastName);
	//	if(findByLastName.isEmpty())  check for null condition
		return findByLastName.get(0);
		
	}
}
