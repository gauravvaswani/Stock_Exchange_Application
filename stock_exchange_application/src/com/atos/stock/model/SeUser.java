package com.atos.stock.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the SE_USER database table.
 * 
 */
@Entity
@Table(name="SE_USER")
@NamedQuery(name="SeUser.findAll", query="SELECT s FROM SeUser s")
public class SeUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private long userId;

	@Column(name="USER_FULLNAME")
	private String userFullname;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	@Column(name="USER_PHONE")
	private BigDecimal userPhone;

	@Column(name="USER_ROLE")
	private String userRole;
	
	@Column(name="USER_STATUS")
	private String userStatus;
	
	@Column(name="TEMP_PASS")
	private String tempPass;

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getTempPass() {
		return tempPass;
	}

	public void setTempPass(String tempPass) {
		this.tempPass = tempPass;
	}

	//bi-directional many-to-one association to UserPortfolio
	@OneToMany(mappedBy="seUser",cascade=CascadeType.ALL)
//	@JoinTable(name="User_Portfolio",joinColumns=@JoinColumn(name="user_Id"),
//	inverseJoinColumns=@JoinColumn(name="idPortfolio"))
	private List<UserPortfolio> userPortfolios=new ArrayList<UserPortfolio>();


	//bi-directional many-to-one association to WatchList
	@OneToMany(mappedBy="seUser",cascade=CascadeType.ALL)
//	@JoinTable(name="Watch_List",joinColumns=@JoinColumn(name="user_Id"),
//	inverseJoinColumns=@JoinColumn(name="id"))
	private List<WatchList> watchLists=new ArrayList<WatchList>();

	public SeUser() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserFullname() {
		return this.userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public BigDecimal getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(BigDecimal userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public List<UserPortfolio> getUserPortfolios() {
		return this.userPortfolios;
	}

	public void setUserPortfolios(List<UserPortfolio> userPortfolios) {
		this.userPortfolios = userPortfolios;
	}

	public UserPortfolio addUserPortfolio(UserPortfolio userPortfolio) {
		getUserPortfolios().add(userPortfolio);
		userPortfolio.setSeUser(this);

		return userPortfolio;
	}

	public UserPortfolio removeUserPortfolio(UserPortfolio userPortfolio) {
		getUserPortfolios().remove(userPortfolio);
		userPortfolio.setSeUser(null);

		return userPortfolio;
	}

	public List<WatchList> getWatchLists() {
		return this.watchLists;
	}

	public void setWatchLists(List<WatchList> watchLists) {
		this.watchLists = watchLists;
	}

	public WatchList addWatchList(WatchList watchList) {
		getWatchLists().add(watchList);
		watchList.setSeUser(this);

		return watchList;
	}

	public WatchList removeWatchList(WatchList watchList) {
		getWatchLists().remove(watchList);
		watchList.setSeUser(null);

		return watchList;
	}

}