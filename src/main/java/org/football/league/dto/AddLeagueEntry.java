package org.football.league.dto;

import java.util.ArrayList;
import java.util.List;

import org.football.league.model.LegueTableEntry;
import org.football.league.model.Match;
import org.springframework.stereotype.Component;

/*
 * this class will populate team, match and league
 */
@Component
public class AddLeagueEntry {

	/*
	 * return an instance of team check if the instance is homeTeam or away team
	 */
	public Team getTeam(Team team) {

		if (team instanceof HomeTeam) {
			team = new HomeTeam();
		}
		if (team instanceof AwayTeam) {
			team = new AwayTeam();
		}

		return team;
	}

	/*
	 * add data from team to league table entry home
	 */
	public LegueTableEntry getTableEntryForHomeTeam() {
		Team team = getTeam(new HomeTeam());
		String teamName = "Home team: " + team.getTeamName();
		LegueTableEntry entry = new LegueTableEntry(teamName, team.getPlayed(), team.getWon(), team.getDraw(),
				team.getLost(), team.getGoalsFor(), team.getGoalsAgainst(), team.getGoalDifference(), team.getPoints());
		
		return entry;

	}

	/*
	 * add data from team to league table entry away
	 */
	public LegueTableEntry getTableEntryForAwayTeam() {
		Team team = getTeam(new AwayTeam());
		String teamName = "away team: " + team.getTeamName();
		LegueTableEntry entry = new LegueTableEntry(teamName, team.getPlayed(), team.getWon(), team.getDraw(),
				team.getLost(), team.getGoalsFor(), team.getGoalsAgainst(), team.getGoalDifference(), team.getPoints());

		return entry;

	}

	/*
	 * add both home and away to the match
	 */
	public Match getMatche() {

		Match matche = new Match(getTableEntryForHomeTeam().getTeamName(), getTableEntryForAwayTeam().getTeamName(),
				getTableEntryForHomeTeam().getPoints(), getTableEntryForAwayTeam().getPoints());
		return matche;
	}

	/*
	 * this method will return a list of matches
	 */
	public List<Match> getMatches() {
		List<Match> matches = new ArrayList<>();
		matches.add(getMatche());
		return matches;
	}
}
