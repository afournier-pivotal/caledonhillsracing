package com.afournier.chr.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afournier.chr.model.Team;
import com.afournier.chr.service.TeamService;

@RestController
@RequestMapping("/v1")

public class TeamController {
	
	private TeamService teamService;
	
	public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}

	@RequestMapping("/getTeams")
	public ResponseEntity<List<Team>> getTeams() {
		List<Team> values = teamService.getTeams();
		if (values != null) {
			return ResponseEntity.ok(values);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping("/getTeam")
	public ResponseEntity<Team> getTeam(Long id) {
		Team value = teamService.getTeam(id);
		if (value != null) {
			return ResponseEntity.ok(value);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/newTeam/{firstname}/{lastname}/{email}/{bio}")
	public void submitTeam(@PathVariable String firstname, @PathVariable String lastname,@PathVariable String email, @PathVariable String bio) {
		teamService.saveTeam(firstname, lastname, email, bio);
		
	}
	
}
