package org.ravi.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ravi.rest.messenger.database.Database;
import org.ravi.rest.messenger.model.Message;
import org.ravi.rest.messenger.model.Profile;

public class ProfileService {

	
	Map<String, Profile> profiles = Database.getProfiles();
	
	public ProfileService() {
		// TODO Auto-generated constructor stub
		profiles.put("ravi",new Profile(1L,"ravi","Ravi","Mishra" ));
		//profiles.put(2L,new Message("2Msg","ravi",2L));
	}
	
	
	
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		if (profile == null) return null;
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(),profile);
		return profile;		
		
	}
	
	public Profile updateMessage(Profile profile){
		if (profile.getProfileName().isEmpty()) return null;
		
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public void removeProfile(String profileName){
		profiles.remove(profileName);
		
	}


	public List<Profile> getAllProfiles() {
		// TODO Auto-generated method stub
		return new ArrayList<>(profiles.values());	}
	
	
	/*public List<Message> getAllMessages(){
		Message m1 = new Message("Hello world1", "ravi", 1L, new Date());
		Message m2 = new Message("Hello world123", "ravi", 2L, new Date());
		 List<Message> list = new ArrayList<>();
		 list.add(m1);
		 list.add(m2);
		return list;
	}*/


}
