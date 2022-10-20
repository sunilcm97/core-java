package com.xworkz.user.service;

import com.xworkz.user.DTO.User;

public interface UserI {
	
	public void saveUser(User user);
    public User findUserById(int userId);
    public void deleteUserById(int userId);
    public User loginUser(String email,String password);
    public User updateUser(User user);
}
