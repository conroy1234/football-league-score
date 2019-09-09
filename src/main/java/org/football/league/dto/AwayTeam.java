package org.football.league.dto;

import org.football.league.model.Match;
import org.football.league.constants.Constants;
/*
 * one implementation of team
 */
public class AwayTeam implements Team {

	
	public Match getMatches() {
		Match match = new Match("Arcenal","Man City",5,2);		
		return match;
	}
	
	@Override
	public String getTeamName() {
	Match match = 	getMatches();
		return match.getAwayTeam();
	}

	
	@Override
	public int getScore() {
		Match match = 	getMatches();
		return match.getAwayScore();
	}
	@Override
	public int getPlayed() {
		
		return Constants.GAME_PLAYED_BY_AWAY;
	}


	@Override
	public int getWon() {
	
		return Constants.GAME_WON_BY_AWAY;
	}

	@Override
	public int getDraw() {
	
		return Constants.GAMES_DRAW_BY_AWAY;
	}

	@Override
	public int getLost() {
	
		return Constants.GAMES_LOST_BY_AWAY;
	}

	@Override
	public int getGoalsFor() {
		
		return Constants.GOAL_SCORED_BY_AWAY;
	}

	@Override
	public int getGoalsAgainst() {
		
		return Constants.GOAL_AGAINST_AWAY;
	}

	@Override
	public int getGoalDifference() {
		
		return Constants.AWAY_TEAM_GOAL_DIFFERENCE;
	}

	@Override
	public int getPoints() {
		
		return Constants.AWAY_TEAM_POINTS;
	}

	

}
