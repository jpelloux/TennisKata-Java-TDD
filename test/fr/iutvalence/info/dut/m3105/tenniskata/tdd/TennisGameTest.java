package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame gameDummy;
	
	@Before
	public void before()
	{
		gameDummy = new TennisGame();
	}
	
	@Test
	public void aNewGameScoreShouldBeLoveAll()
	{
		assertEquals(gameDummy.getScore(), "love-all");
	}

	@Test
	public void ifTheServerScoresScoreShouldBeFifteenLove()
	{
		gameDummy.serverScores();
		assertEquals(gameDummy.getScore(), "fifteen-love");
	}
	
	@Test
	public void ifTheReceiverScoresScoreShouldBeLoveFifteen()
	{
		gameDummy.receiverScores();
		assertEquals(gameDummy.getScore(), "love-fifteen");
	}

}
