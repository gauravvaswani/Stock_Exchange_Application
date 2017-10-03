package com.atos.stock.unitTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

import com.atos.stock.dao.SeUserDAO;
import com.atos.stock.impl.SeUserDAOImpl;
import com.atos.stock.model.SeUser;
import com.atos.stock.utils.MyUtil;

public class SeUserDAOImplTest {

	static HSSFRow row;

	@Test
	public void testAddUser() throws IOException {

	/*	String csvFile = "UserInfo.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] userinfo = line.split(cvsSplitBy);

				SeUser user = new SeUser();
				SeUserDAO se = new SeUserDAOImpl();

				user.setUserName(userinfo[0]);
				user.setUserPassword(userinfo[1]);
				user.setUserFullname(userinfo[2]);
				user.setUserPhone(new BigDecimal(userinfo[3]));
				user.setUserRole(userinfo[4]);

				se.addUser(user);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/

	}

	@Test
	public void testCheckUser() {
	
		/*String csvFile = "user.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				
				// use comma as separator
				String[] user_info=line.split(",");
				SeUserDAO se = new SeUserDAOImpl();
				assertEquals(true,(se.checkUser(user_info[0], user_info[1])));
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}

	@Test
	public void testGetUser() {
		
		/*String csvFile = "user.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] username=line.split(",");
				SeUserDAO se = new SeUserDAOImpl();
				assertNotNull(se.getUser(username[0]));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

	@Test
	public void testUpdateUserFullname() {
		
	/*	String csvFile = "UserInfo.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] user=line.split(",");
				SeUserDAO se = new SeUserDAOImpl();
				
				assertEquals(true,se.updateUserFullname(user[0], user[2]));
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
	}

	@Test
	public void testDeleteUser() {
	/*	String csvFile = "user.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] user=line.split(",");
				SeUserDAO se = new SeUserDAOImpl();
				assertEquals(true,se.deleteUser(user[0]));
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();*/
	}


	@Test
	public void testChangePassword() {
	
		/*String csvFile = "changePassword.csv";
		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] user=line.split(",");
				SeUserDAO se = new SeUserDAOImpl();
				assertEquals(true,se.changePassword(user[0], user[1]));
				

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		MyUtil.commitSession();
*/
	}

}
