package com.atos.stock.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the USER_PORTFOLIO database table.
 * 
 */
@Entity
@Table(name="USER_PORTFOLIO")
@NamedQuery(name="UserPortfolio.findAll", query="SELECT u FROM UserPortfolio u")
public class UserPortfolio implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id 
	private int idPortfolio;

	

	public int getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(int idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	@Column(name="PORTFOLIO_DATA")
	private Timestamp portfolioData;

	@Column(name="STOCK_QUANTITY")
	private BigDecimal stockQuantity;

	//bi-directional many-to-one association to SeUser
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private SeUser seUser;

	//bi-directional many-to-one association to StockData
	@ManyToOne
	@JoinColumn(name="STOCK_ID")
	private StockData stockData;

	public UserPortfolio() {
	}

	public Timestamp getPortfolioData() {
		return this.portfolioData;
	}

	public void setPortfolioData(Timestamp portfolioData) {
		this.portfolioData = portfolioData;
	}

	public BigDecimal getStockQuantity() {
		return this.stockQuantity;
	}

	public void setStockQuantity(BigDecimal stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public SeUser getSeUser() {
		return this.seUser;
	}

	public void setSeUser(SeUser seUser) {
		this.seUser = seUser;
	}

	public StockData getStockData() {
		return this.stockData;
	}

	public void setStockData(StockData stockData) {
		this.stockData = stockData;
	}

}