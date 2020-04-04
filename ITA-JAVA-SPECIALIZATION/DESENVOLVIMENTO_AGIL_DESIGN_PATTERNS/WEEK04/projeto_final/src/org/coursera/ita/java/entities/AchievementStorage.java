package org.coursera.ita.java.entities;

import java.util.List;

public interface AchievementStorage {

	public void addAchievement(User user, Achievement a);
	public List<Achievement> getAchievements(User user);
	public Achievement getAchievement(User user, String achievementName);
	
}