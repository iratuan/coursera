package org.coursera.ita.java.observers;

import org.coursera.ita.java.entities.Achievement;
import org.coursera.ita.java.entities.User;

public interface AchievementObserver {
	void achievementUpdate(User user, Achievement a);
}
