package com.atos.stock.dao;

import com.atos.stock.model.SeUser;

public interface SeUserDAO {
	
	public void addUser(SeUser user);
	public void checkUser(String username,String password);
	public SeUser getUser(String username);
	public boolean updateUserFullname(String username,String updatedFullName);
	public boolean deleteUser(String username);
	public void setTempPass(String username);
	public String getTempPass(String username);
	public SeUser getUserByTempPass(String tempPass);


}
