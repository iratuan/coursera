package org.coursera.ita.java.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private List<Achievement> achievments = new ArrayList<Achievement>();

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Achievement> getAchievments() {
		return achievments;
	}

	public void addAchievment(Achievement achievment) {
		this.achievments.add(achievment);
	}

	public Achievement getAchievmentByName(String achievementName) {
		Achievement a = null;
		for (Achievement achievement : achievments) {
			if(achievement.getName() == achievementName) {
				a = achievement;
			}
		}
		return a;
	}
}
