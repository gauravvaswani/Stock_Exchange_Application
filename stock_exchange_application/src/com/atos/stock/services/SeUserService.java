package com.atos.stock.services;

import java.util.List;

import com.atos.stock.model.SeUser;

public interface SeUserService {

	public void addUser(SeUser user);
	public boolean checkUser(String username,String password);
	public SeUser getUser(String username);
	public boolean updateUserFullname(String username,String updatedFullName);
	public boolean deleteUser(String username);
	public void setTempPass(String username);
	public String getTempPass(String username);
	public SeUser getUserByTempPass(String tempPass);
	public boolean changePassword(String username,String password);
	public List<SeUser> getAllUsers();  

}
