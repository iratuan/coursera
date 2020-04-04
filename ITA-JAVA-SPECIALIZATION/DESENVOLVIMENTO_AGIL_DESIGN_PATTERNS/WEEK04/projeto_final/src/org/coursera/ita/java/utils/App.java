package org.coursera.ita.java.utils;

import org.coursera.ita.java.entities.AchievementStorage;
import org.coursera.ita.java.entities.MemoryAchievementStorage;

public class App {

	private static AchievementStorage achievementInstance;

	private App() {}

	public static AchievementStorage getAchievementStorageInstance() {
		
		if (achievementInstance == null) {
			achievementInstance = new MemoryAchievementStorage();
		}

		return achievementInstance;
	}
}
