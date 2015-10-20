package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void aNewGameScoreShouldBeLoveAll()
	{
		TennisGame gameDummy = new TennisGame();
		assertEquals(gameDummy.getScore(), "love-all");
	}

	@Test
	public void ifTheServingPlayerMarksScoreShouldBeFifteenLove()
	{
		TennisGame gameDummy = new TennisGame();
		gameDummy.servingPlayerMarks();
		assertEquals(gameDummy.getScore(), "fifteen-love");
	}

}
