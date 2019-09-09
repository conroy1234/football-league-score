package org.football.league.controller;

import java.util.List;

import org.football.league.dto.AddLeagueEntry;
import org.football.league.model.LegueTableEntry;
import org.football.league.service.AddLeagueAndMatchesHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FootballController {
	@Autowired
	AddLeagueAndMatchesHome addLeagueAndMatchesHome;
	@Autowired
	AddLeagueEntry addLeagueEntry;
	
	@Value("${welcome.message}")
	String welcome;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getScore(Model model) {
		List<LegueTableEntry> entries = addLeagueAndMatchesHome.leagueTableEntries(addLeagueEntry);
		model.addAttribute("message",welcome);
		model.addAttribute("entries",entries);
		
		return"score";
	}
}
