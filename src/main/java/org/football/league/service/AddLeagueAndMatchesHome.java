package org.football.league.service;

import java.util.ArrayList;
import java.util.List;

import org.football.league.dto.AddLeagueEntry;
import org.football.league.model.LegueTableEntry;
import org.football.league.model.Match;
import org.football.league.table.LeagueTable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * this class collect all the data from both home team and away team and return the results
 */
@Component
@Qualifier("addLeagueAndMatchesHome")
public class AddLeagueAndMatchesHome {

	/*
	 * get data for league table entry
	 */
	public List<LegueTableEntry> leagueTableEntries(AddLeagueEntry addLeagueEntry) {
		List<LegueTableEntry> tableEntries = new ArrayList<>();
		tableEntries.add(addLeagueEntry.getTableEntryForAwayTeam());
		tableEntries.add(addLeagueEntry.getTableEntryForHomeTeam());
		return tableEntries;
	}

	/*
	 * get data for matches
	 */
	public List<Match> matches(AddLeagueEntry addLeagueEntry) {
		List<Match> matches = addLeagueEntry.getMatches();
		LeagueTable leagueTable = new LeagueTable(matches);

		return leagueTable.getMatches();
	}
}
