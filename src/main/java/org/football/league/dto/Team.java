package org.football.league.dto;

import org.football.league.model.Match;

/*
 * interface that acts as a contract between different teams
 */
public interface Team {
	public Match getMatches();
	public String getTeamName();
	public int getWon();
	public int getDraw();
	public int getLost();
	public int getGoalsFor();
	public int getGoalsAgainst();
	public int getGoalDifference();
	public int getPoints();
	public int getPlayed();
	public int getScore();
}
