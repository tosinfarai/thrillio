/*
 * Manages all users
 */

package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	
	//Creates one instance of the UserManager Class  
	private static UserManager instance = new UserManager();
	
	private UserManager() {}
	
	//Allows the one instance of the UserManager to be accessed globally
	public static UserManager getInstance() {
		return instance;
	}
	
	//invoke methods to set fields of the user object
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
