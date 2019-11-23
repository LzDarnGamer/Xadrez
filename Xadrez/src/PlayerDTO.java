package app.facade.dto;

import java.io.Serializable;

public class PlayerDTO implements Serializable{

	private static final long serialVersionUID = -4381652443739437211L;
	private String name, title, rank;
	private int level, gold;

	public PlayerDTO(String name, String title, String rank, int level, int gold) {
		super();
		this.name = name;
		this.title = title;
		this.rank = rank;
		this.level = level;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getRank() {
		return rank;
	}

	public int getLevel() {
		return level;
	}

	public int getGold() {
		return gold;
	}

	public String toString() {
		return "Name: " + name + ", Level:" + level + ", Gold:" + gold + ", Title:" + title + ", Rank:" + rank;
	}
}
