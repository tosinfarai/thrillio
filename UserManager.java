package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();
	private UserManager() {}
	
	public static UserManager getInstance() {
		return instance;
	}
	
	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setGender(gender);
		user.getUserType();
		
		return user;
	}
}
