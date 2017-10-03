package com.atos.stock.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the STOCK_DATA database table.
 * 
 */
@Entity
@Table(name="STOCK_DATA")
@NamedQuery(name="StockData.findAll", query="SELECT s FROM StockData s")
public class StockData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SequenceStockGenerator", sequenceName = "STOCK_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceStockGenerator")
	@Column(name="STOCK_ID")
	private long stockId;

	@Column(name="CHANGE_PERCENTAGE")
	private BigDecimal changePercentage;

	@Column(name="CLOSING_STOCK_VALUE")
	private BigDecimal closingStockValue;

	@Column(name="HIGHEST_STOCK_VALUE")
	private BigDecimal highestStockValue;

	@Column(name="LAST_TRADE_PRICE")
	private BigDecimal lastTradePrice;

	@Column(name="LOWEST_STOCK_VALUE")
	private BigDecimal lowestStockValue;

	@Column(name="VOLUME")
	private BigDecimal volume;
	
	@Column(name="MARKET")
	private String market;
	
	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	@Column(name="OPENING_STOCK_VALUE")
	private BigDecimal openingStockValue;

	
	
	//bi-directional many-to-one association to CompanyData
	@ManyToOne
	@JoinColumn(name="COMPANY_CODE")
	private CompanyData companyData;

	//bi-directional many-to-one association to UserPortfolio
	@OneToMany(mappedBy="stockData", cascade=CascadeType.ALL)
	private List<UserPortfolio> userPortfolios=new ArrayList<UserPortfolio>();


	//bi-directional many-to-one association to WatchList
	@OneToMany(mappedBy="stockData", cascade=CascadeType.ALL)
	private List<WatchList> watchLists=new ArrayList<WatchList>();

	public StockData() {
	}

	public long getStockId() {
		return this.stockId;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public BigDecimal getChangePercentage() {
		return this.changePercentage;
	}

	public void setChangePercentage(BigDecimal changePercentage) {
		this.changePercentage = changePercentage;
	}

	public BigDecimal getClosingStockValue() {
		return this.closingStockValue;
	}

	public void setClosingStockValue(BigDecimal closingStockValue) {
		this.closingStockValue = closingStockValue;
	}

	public BigDecimal getHighestStockValue() {
		return this.highestStockValue;
	}

	public void setHighestStockValue(BigDecimal highestStockValue) {
		this.highestStockValue = highestStockValue;
	}

	public BigDecimal getLastTradePrice() {
		return this.lastTradePrice;
	}

	public void setLastTradePrice(BigDecimal lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}

	public BigDecimal getLowestStockValue() {
		return this.lowestStockValue;
	}

	public void setLowestStockValue(BigDecimal lowestStockValue) {
		this.lowestStockValue = lowestStockValue;
	}

	public BigDecimal getOpeningStockValue() {
		return this.openingStockValue;
	}

	public void setOpeningStockValue(BigDecimal openingStockValue) {
		this.openingStockValue = openingStockValue;
	}

	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public CompanyData getCompanyData() {
		return this.companyData;
	}

	public void setCompanyData(CompanyData companyData) {
		this.companyData = companyData;
	}

	public List<UserPortfolio> getUserPortfolios() {
		return this.userPortfolios;
	}

	public void setUserPortfolios(List<UserPortfolio> userPortfolios) {
		this.userPortfolios = userPortfolios;
	}

	public UserPortfolio addUserPortfolio(UserPortfolio userPortfolio) {
		getUserPortfolios().add(userPortfolio);
		userPortfolio.setStockData(this);

		return userPortfolio;
	}

	public UserPortfolio removeUserPortfolio(UserPortfolio userPortfolio) {
		getUserPortfolios().remove(userPortfolio);
		userPortfolio.setStockData(null);

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
		watchList.setStockData(this);

		return watchList;
	}

	public WatchList removeWatchList(WatchList watchList) {
		getWatchLists().remove(watchList);
		watchList.setStockData(null);

		return watchList;
	}

}