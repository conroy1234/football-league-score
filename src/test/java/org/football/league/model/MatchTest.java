
package org.football.league.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.football.league.dto.AddLeagueEntry;
import org.football.league.model.LegueTableEntry;
import org.football.league.model.Match;
import org.junit.jupiter.api.Test;

public class MatchTest {

	@Test
	public void testHomeTeam() {

		AddLeagueEntry addLeagueEntry = new AddLeagueEntry();
		Match matcha = addLeagueEntry.getMatche();
		Match matchb = new Match("Arsenal", "Man City", 8, 5);
		assertThat(matchb.getHomeScore(), is(8));
		assertThat(matchb.getAwayScore(), is(5));
		assertThat(matchb.getAwayTeam(), is("Man City"));
		assertThat(matchb.getHomeTeam(), is("Arsenal"));
		assertThat(matcha.getAwayScore(), is(matchb.getAwayScore()));

	}

	@Test
	public void testLeagueTable() {
		AddLeagueEntry addLeagueEntry = new AddLeagueEntry();
		List<LegueTableEntry> tableEntries = new ArrayList<>();
		LegueTableEntry entry = addLeagueEntry.getTableEntryForAwayTeam();
		tableEntries.add(entry);

		assertThat(tableEntries.size(), is(1));
		assertThat(tableEntries.get(0), is(entry));
	}
}
