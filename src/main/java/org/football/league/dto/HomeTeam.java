package org.football.league.dto;

import org.football.league.model.Match;
import org.football.league.constants.Constants;
/*
 * one implementation of team
 */
public class HomeTeam implements Team {

	
	public Match getMatches() {
		Match match = new Match("Arsenal","Man City",5,2);		
		return match;
	}
	
	
	@Override
	public String getTeamName() {
	Match match = 	getMatches();
		return match.getHomeTeam();
	}

	@Override
	public int getPlayed() {
		
		return Constants.GAME_PLAYED_BY_HOME;
	}

	@Override
	public int getScore() {
		Match match = 	getMatches();
		return match.getHomeScore();
	}

	@Override
	public int getWon() {		
		
		return Constants.GAME_WON_BY_HOME;
	}

	@Override
	public int getDraw() {
		
		return Constants.GAMES_DRAW_BY_HOME;
	}

	@Override
	public int getLost() {
		
		return Constants.GAMES_LOST_BY_HOME;
	}

	@Override
	public int getGoalsFor() {
	
		return Constants.GOAL_SCORED_BY_HOME;
	}

	@Override
	public int getGoalsAgainst() {
		
		return Constants.GOAL_AGAINST_HOME;
	}

	@Override
	public int getGoalDifference() {
	
		return Constants.HOME_TEAM_GOAL_DIFFERENCE;
	}

	@Override
	public int getPoints() {
	
		return Constants.HOME_TEAM_POINTS;
	}

	

}
