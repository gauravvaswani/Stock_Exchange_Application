package com.atos.stock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.dao.SeUserDAOImpl;
import com.atos.stock.model.SeUser;

@Service("seUserService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SeUserServiceImpl implements SeUserService{
	
	@Autowired
	private SeUserDAO seUserDao=new SeUserDAOImpl();
	
	@Override
	public SeUser getUser(String username) {
		return seUserDao.getUser(username);
	}
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(SeUser user) {
		seUserDao.addUser(user);
	}


	@Override
	public boolean checkUser(String username, String password) {
		// TODO Auto-generated method stub
		return seUserDao.checkUser(username, password);
	}


	@Override
	public boolean updateUserFullname(String username, String updatedFullName) {
		// TODO Auto-generated method stub
		return seUserDao.updateUserFullname(username, updatedFullName);
	}


	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return seUserDao.deleteUser(username);
	}


	@Override
	public void setTempPass(String username) {
		// TODO Auto-generated method stub
		seUserDao.setTempPass(username);
		
	}


	@Override
	public String getTempPass(String username) {
		// TODO Auto-generated method stub
		return seUserDao.getTempPass(username);
	}


	@Override
	public SeUser getUserByTempPass(String tempPass) {
		// TODO Auto-generated method stub
		return seUserDao.getUserByTempPass(tempPass);
	}


	@Override
	public boolean changePassword(String username, String password) {
		// TODO Auto-generated method stub
		
		return seUserDao.changePassword(username, password);
	}


	@Override
	public List<SeUser> getAllUsers() {
		// TODO Auto-generated method stub
		return seUserDao.getAllUsers();
	}
	
	

}
