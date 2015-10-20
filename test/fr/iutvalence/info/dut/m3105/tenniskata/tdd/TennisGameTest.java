package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	public static final String LOVE_FIFTEEN = "love-fifteen";
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_ALL = "fifteen-all";

	private TennisGame gameDummy;
	
	@Before
	public void before()
	{
		gameDummy = new TennisGame();
	}
	
	@Test
	public void aNewGameScoreShouldBeLoveAll()
	{
		assertEquals(gameDummy.getScore(), LOVE_ALL);
	}

	@Test
	public void ifTheServerScoresScoreShouldBeFifteenLove()
	{
		gameDummy.serverScores();
		assertEquals(gameDummy.getScore(), FIFTEEN_LOVE);
	}
	
	@Test
	public void ifTheReceiverScoresScoreShouldBeLoveFifteen()
	{
		gameDummy.receiverScores();
		assertEquals(gameDummy.getScore(), LOVE_FIFTEEN);
	}
	
	@Test
	public void ifServerAndReceiverScoreOnceScoreShouldBeFifteenAll()
	{
		gameDummy.serverScores();
		gameDummy.receiverScores();
		assertEquals(gameDummy.getScore(), FIFTEEN_ALL);
		this.before();
		gameDummy.receiverScores();
		gameDummy.serverScores();
		assertEquals(gameDummy.getScore(), FIFTEEN_ALL);
	}
	

}
