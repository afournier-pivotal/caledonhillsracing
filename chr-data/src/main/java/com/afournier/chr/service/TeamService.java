package com.afournier.chr.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.afournier.chr.model.Team;
import com.afournier.chr.repo.TeamRepo;

@Service
public class TeamService {

	private TeamRepo teamRepo;
	
	@Autowired
	public TeamService(TeamRepo teamRepo) {
		this.teamRepo = teamRepo;
	}
	
	public List<Team> getTeams() {
		Iterable<Team> source = teamRepo.findAll();
		List<Team> target = new ArrayList<>();
		source.forEach(target::add);
		return target;
	}
	
	public Team getTeam(Long id) {
		return teamRepo.findOne(id);
	}
	
	public void saveTeam(String firstname, String lastname, String email, String bio) {
		teamRepo.save(new Team(firstname, lastname, email,bio) );
	}

	
	
}
