package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void aNewGameShouldBeLoveAll()
	{
		TennisGame gameDummy = new TennisGame();
		assertEquals(gameDummy.getScore(), "love-all");
	}

}
