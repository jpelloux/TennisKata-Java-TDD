package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String LOVE_FIFTEEN = "love-fifteen";
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_ALL = "fifteen-all";
	
	private int serverScore;
	private int receiverScore;
	
	
	public TennisGame()
	{
		this.serverScore = 0;
		this.receiverScore = 0;
	}
	
	public void serverScores() {
		this.serverScore++;
	}

	public void receiverScores() {
		this.receiverScore++;
	}
	
	public String getScore() {
		if(serverScore == 0 && receiverScore == 0)
			return LOVE_ALL;
		if(serverScore == 1 && receiverScore == 0)
			return FIFTEEN_LOVE;
		if(serverScore == 0 && receiverScore == 1)
			return LOVE_FIFTEEN;
		return FIFTEEN_ALL;
	}


}
