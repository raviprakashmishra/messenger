package org.ravi.rest.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.ravi.rest.messenger.model.Message;
import org.ravi.rest.messenger.model.Profile;

public class Database {
	public static Map<Long,Message> messages = new HashMap<>();
	public static Map<String,Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}
