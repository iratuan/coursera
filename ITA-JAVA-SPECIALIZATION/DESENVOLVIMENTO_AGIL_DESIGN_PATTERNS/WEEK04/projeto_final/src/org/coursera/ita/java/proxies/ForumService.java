package org.coursera.ita.java.proxies;

import org.coursera.ita.java.entities.User;

public interface ForumService {
	public void addTopic(User user, String topic);
	public void addComment(User user, String topic, String comment);
	public void likeTopic(User user, String topic, String topicUser);
	public void likeComment(User user, String topic, String comment, String commentUser);
}
