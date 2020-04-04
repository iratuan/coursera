package org.coursera.ita.java.entities;

import java.util.List;

public class MemoryAchievementStorage implements AchievementStorage {

	@Override
	public void addAchievement(User user, Achievement a) {
		user.addAchievment(a);
	}

	@Override
	public List<Achievement> getAchievements(User user) {		
		return user.getAchievments();
	}

	@Override
	public Achievement getAchievement(User user, String achievementName) {
		return user.getAchievmentByName(achievementName);
	}

}
