package com.atos.stock.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the COMPANY_DATA database table.
 * 
 */
@Entity
@Table(name="COMPANY_DATA")
@NamedQuery(name="CompanyData.findAll", query="SELECT c FROM CompanyData c")
public class CompanyData implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//@GeneratedValue(strategy = GenerationType.AUTO)	
//	@Column(name="COMPANY_ID")
//	private long id;
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public String getCompanySymbol() {
		return companySymbol;
	}

	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}
	
	@Id
	@Column(name="COMPANY_CODE")
	private String companyCode;

	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="COMPANY_SYMBOL")
	private String companySymbol;
	
	@Column(name="COMPANY_STATUS")
	private String companyStatus;

	@Column(name="COMPANY_QUANTITY")
	private BigDecimal companyQuantity;

	@Column(name="INDUSTRY_SECTOR")
	private String industrySector;

	private BigDecimal isin;

	//bi-directional many-to-one association to StockData
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
//	@JoinTable(name="STOCK_DATA",joinColumns=@JoinColumn(name="COMPANY_CODE"),
//	inverseJoinColumns=@JoinColumn(name="STOCK_ID"))
	private List<StockData> stockData=new ArrayList<>();

	public CompanyData() {
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigDecimal getCompanyQuantity() {
		return this.companyQuantity;
	}

	public void setCompanyQuantity(BigDecimal companyQuantity) {
		this.companyQuantity = companyQuantity;
	}

	public String getIndustrySector() {
		return this.industrySector;
	}

	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
	}

	public BigDecimal getIsin() {
		return this.isin;
	}

	public void setIsin(BigDecimal isin) {
		this.isin = isin;
	}

	public List<StockData> getStockData() {
		return this.stockData;
	}

	public void setStockData(List<StockData> stockData) {
		this.stockData = stockData;
	}

	public StockData addStockData(StockData stockData) {
		getStockData().add(stockData);
		stockData.setCompanyData(this);

		return stockData;
	}

	public StockData removeStockData(StockData stockData) {
		getStockData().remove(stockData);
		stockData.setCompanyData(null);

		return stockData;
	}

}