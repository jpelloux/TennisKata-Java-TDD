package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String LOVE = "love";
	public static final String FIFTEEN = "fifteen";
	
	private static final String[] SCORE_TO_STRING= {LOVE, FIFTEEN, "thirty", "forty"};
	
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
		if (serverScore == receiverScore && serverScore == 3)
			return "deuce";
		if (serverScore == receiverScore)
			return SCORE_TO_STRING[serverScore] + "-all";
		return SCORE_TO_STRING[serverScore] + '-' + SCORE_TO_STRING[receiverScore];
}



}
