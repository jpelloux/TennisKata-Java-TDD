package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String LOVE_FIFTEEN = "love-fifteen";
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_ALL = "love-all";
	
	
	private String score;
	
	public TennisGame()
	{
		setScore(LOVE_ALL);
	}
	
	public String getScore() {
		return this.score;
	}

	public void serverScores() {
		setScore(FIFTEEN_LOVE);
	}

	public void receiverScores() {
		setScore(LOVE_FIFTEEN);
	}

	private void setScore(String score) {
		this.score = score;
	}

}
