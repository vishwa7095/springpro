package collections.ratan;

public class Players {
	private int playerId;
	private String playerName;
	private int Age;
	private String Team;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", Age=" + Age + ", Team=" + Team + "]";
	}
	

}
