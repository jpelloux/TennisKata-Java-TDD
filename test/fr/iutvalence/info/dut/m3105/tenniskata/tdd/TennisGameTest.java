package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	public static final String[][] scoreArray =
		{
			{"love-all"    , "love-fifteen"  , "love-thirty"   , "love-forty"   },
			{"fifteen-love", "fifteen-all"   , "fifteen-thirty", "fifteen-forty"},
			{"thirty-love" , "thirty-fifteen", "thirty-all"    , "thirty-forty" },
			{"forty-love"  , "forty-fifteen" , "forty-thirty"  , "deuce"        },
		};

	private TennisGame gameDummy;
	
	@Before
	public void before()
	{
		gameDummy = new TennisGame();
	}
	
	@Test
	public void aNewGameScoreShouldBeLoveAll()
	{
		assertEquals(gameDummy.getScore(), scoreArray[0][0]);
	}

	@Test
	public void ifTheServerScoresScoreShouldBeFifteenLove()
	{
		gameDummy.serverScores();
		assertEquals(gameDummy.getScore(), scoreArray[1][0]);
	}
	
	@Test
	public void ifTheReceiverScoresScoreShouldBeLoveFifteen()
	{
		gameDummy.receiverScores();
		assertEquals(gameDummy.getScore(), scoreArray[0][1]);
	}
	
	@Test
	public void ifServerAndReceiverScoreOnceScoreShouldBeFifteenAll()
	{
		gameDummy.serverScores();
		gameDummy.receiverScores();
		assertEquals(gameDummy.getScore(), scoreArray[1][1]);
		this.before();
		gameDummy.receiverScores();
		gameDummy.serverScores();
		assertEquals(gameDummy.getScore(), scoreArray[1][1]);
	}
	
	@Test
	public void allScoresBeforeEqualityShouldWork()
	{
		for (int serverScore = 0 ; serverScore < 4 ; serverScore++)
		{
			for (int receiverScore = 0 ; receiverScore < 4 ; receiverScore++)
			{
				before();
				this.setScores(serverScore, receiverScore);
				assertEquals(gameDummy.getScore(), scoreArray[serverScore][receiverScore]);
			}
		}
	}
	
	
	
	private void setScores(int serverScore, int receiverScore)
	{
		for (int i = 0 ; i < serverScore ; i++)
		{
			gameDummy.serverScores();
		}
		
		for (int i = 0 ; i < receiverScore ; i++)
		{
			gameDummy.receiverScores();
		}
			
	}
	

}
