package com.atos.stock.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the WATCH_LIST database table.
 * 
 */
@Entity
@Table(name="WATCH_LIST")
@NamedQuery(name="WatchList.findAll", query="SELECT w FROM WatchList w")
public class WatchList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@SequenceGenerator(name = "SequenceWatchlistGenerator", sequenceName = "WATCHLIST_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceWatchlistGenerator")
	@Column(name="WATCHLIST_ID")
	private long watchlistId;

	//bi-directional many-to-one association to SeUser
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private SeUser seUser;

	//bi-directional many-to-one association to StockData
	@ManyToOne
	@JoinColumn(name="STOCK_ID")
	private StockData stockData;

	public WatchList() {
	}

	public long getWatchlistId() {
		return this.watchlistId;
	}

	public void setWatchlistId(long watchlistId) {
		this.watchlistId = watchlistId;
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