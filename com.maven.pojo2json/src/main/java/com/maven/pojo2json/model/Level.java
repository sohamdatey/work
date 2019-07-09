package com.maven.pojo2json.model;

public class Level {

	
	String levelText;
	int levelValue;
	
	public Level(String levelText, int levelValue) {
		super();
		this.levelText = levelText;
		this.levelValue = levelValue;
	}
	public String getLevelText() {
		return levelText;
	}
	public Level setLevelText(String levelText) {
		this.levelText = levelText;
		return this;
	}
	public int getLevelValue() {
		return levelValue;
	}
	public Level setLevelValue(int levelValue) {
		this.levelValue = levelValue;
		return this;
	}
	
}
